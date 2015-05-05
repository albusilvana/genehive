package com.accessor;

import java.sql.SQLException;
import java.util.*;

import com.Model.Entity;
import com.Service.EntryService;
import com.Service.UtilsService;
import com.datastax.driver.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Model.Entry;

import com.google.inject.Singleton;


/**
 * Created by silvana.albert on 3/29/15.
 */
@Singleton
public class CassandraEntriesAccessor {


    private static final Logger LOG = LoggerFactory.getLogger(CassandraEntriesAccessor.class);

    public static final String FIND_ALL_ENTRIES = "select identificationNumber,countrycode,mutationentries from Entries_Space.Entries";

    private UtilsService utilsService = new UtilsService();

    private Cluster cluster;

    private Session session;

    private volatile boolean active;
    private volatile boolean activating;
    private volatile boolean deactivating;

    private int insertBatchSize;


    public void activate() throws Exception {
        LOG.trace("Activating CasandraEventsAccessor");
        if (active || activating) {
            return;
        }
        activating = true;

        insertBatchSize = 1000;

        Cluster cluster = new Cluster.Builder()
                .addContactPoints("127.0.0.1")
                .withPort(9042)
                .build();

        String keyspace = "entries_space";
        session = cluster.connect(keyspace);

        active = true;
        activating = false;
        LOG.debug("CasandraEventsAccessor is activated");

    }

    public List<? extends Entity> readEntries() throws SQLException {
        if (!active) {
            LOG.error("CasandraEventsAccessor is not active");
        }
        List<Entry> results = new ArrayList<Entry>();
        ResultSet resultSet = session.execute(FIND_ALL_ENTRIES);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            String identificationNumber = row.getString(0);
            String mutation = row.getString(1);
            String countryCode = row.getString(2);
            Entry entry = utilsService.convertToEntity(identificationNumber,countryCode, mutation);
            results.add(entry);

        }
        return results;
    }
}


