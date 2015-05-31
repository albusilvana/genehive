package com.accessor;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

import com.DTO.BasicEntityDTO;
import com.DTO.TrainingModelDTO;
import com.DateUtils;
import com.Model.BaseEntity;
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

    public static final String FIND_ALL_MUTATIONS = "select mutationentries from Entries_Space.Entries";

    public static final String FIND_ALL_MUTATIONS_FOR_CSV = "select countryCode,mutationentries,gender,dateOfBirth,dateOfDiagnosis,dateOfDeath from Entries_Space.Entries";

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
            Entry entry = utilsService.convertToEntity(identificationNumber, countryCode, mutation);
            results.add(entry);

        }
        return results;
    }

    public List<? extends Entity> countEntries() throws SQLException {
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
            Entry entry = utilsService.convertToEntity(identificationNumber, countryCode, mutation);
            results.add(entry);

        }
        return results;
    }

    public List<TrainingModelDTO> getCSVEntries() throws SQLException {
        if (!active) {
            LOG.error("CasandraEventsAccessor is not active");
        }
        List<TrainingModelDTO> results = new ArrayList<TrainingModelDTO>();
        ResultSet resultSet = session.execute(FIND_ALL_MUTATIONS_FOR_CSV);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            String countryCode = row.getString(0);
            String mutationentries = row.getString(1);
            String gender = row.getString(2);
            Date dateOfBirth = row.getDate(3);
            Date dateOfDiagnosis = row.getDate(4);
            Date dateOfDeath = row.getDate(5);
            int dateOfDeathAge = 100;
            if (dateOfDeath != null) {
                dateOfDeathAge = DateUtils.getAge(dateOfDeath);
            }
            TrainingModelDTO trainingModelDTO = new TrainingModelDTO(countryCode, mutationentries, gender, DateUtils.getAge(dateOfBirth), DateUtils.getAge(dateOfDiagnosis), dateOfDeathAge);
            results.add(trainingModelDTO);

        }
        return results;
    }

    public List<BasicEntityDTO> readMutationByContry(String countryCode) throws SQLException {
        String query = "select mutationentries from Entries_Space.Entries where countryCode = '" + countryCode + "';";
        List<BasicEntityDTO> results = new ArrayList<BasicEntityDTO>();
        ResultSet resultSet = session.execute(query);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            ;
            String mutations = row.getString(0);
            BasicEntityDTO basicEntityDTO = utilsService.convertToBasicEntityDTO(countryCode, mutations);
            results.add(basicEntityDTO);
        }
        return results;
    }

    public long readMutationCount() throws SQLException {
        String query = "select count(*) from Entries_Space.Entries;";
        long no = 0;
        ResultSet resultSet = session.execute(query);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            ;
            no = row.getLong(0);
        }
        return no;
    }

    public boolean insertEntry(String query) throws SQLException {
        boolean success = true;
        try {
            session.execute(query);
        } catch (Exception e) {
            success = false;
        }
        return success;
    }

    public List<BasicEntityDTO> readMutationByGender(String gender) throws SQLException {
        String query = "select countryCode,mutationentries from Entries_Space.Entries where gender = '" + gender + "';";
        List<BasicEntityDTO> results = new ArrayList<BasicEntityDTO>();
        ResultSet resultSet = session.execute(query);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            String countryCode = row.getString(0);
            String mutations = row.getString(1);
            BasicEntityDTO basicEntityDTO = utilsService.convertToBasicEntityDTO(countryCode, mutations);
            results.add(basicEntityDTO);
        }
        return results;
    }

    public List<String> readDiagnostics() throws SQLException {
        if (!active) {
            LOG.error("CasandraEventsAccessor is not active");
        }
        List<String> results = new ArrayList<String>();
        ResultSet resultSet = session.execute(FIND_ALL_MUTATIONS);
        Iterator<Row> iter = resultSet.iterator();
        while (iter.hasNext()) {
            if (resultSet.getAvailableWithoutFetching() == 100 && !resultSet.isFullyFetched())
                resultSet.fetchMoreResults();
            Row row = iter.next();
            String mutations = row.getString(0);
            List<String> mutationList = utilsService.convertToDiagnstics(mutations);
            for (String mut : mutationList) {
                if (!results.contains(mut)) {
                    results.add(mut);
                }
            }
        }
        return results;
    }
}


