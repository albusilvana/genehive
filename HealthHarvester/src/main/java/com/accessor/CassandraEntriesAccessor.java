package com.accessor;

import java.net.InetAddress;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Model.Entry;
import com.Persistence.Connector;
import com.accessor.iterator.EntryIterator;
import com.datastax.driver.core.*;
import com.datastax.driver.core.exceptions.NoHostAvailableException;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.datastax.driver.core.BatchStatement;
import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;


/**
 * Created by silvana.albert on 3/29/15.
 */
@Singleton
public class CassandraEntriesAccessor {


    private static final Logger LOG = LoggerFactory.getLogger(CassandraEntriesAccessor.class);

    private Connector connector = new Connector();

    private static final String EVENT_COLUMNS = "eventId, epochHours, globalCustomerId, occurredDate, actionType, channelCode, articleId, " +
            "contentDeliveryPlatformId, customerCustomerId, customerProductId, feedId, licensorId, licensorPublicationId, multiplier, " +
            "publicationId, description, ref1, ref2, syndicatorSourceId";
    private static final String INSERT_EVENT = "INSERT INTO events (" + EVENT_COLUMNS + ") VALUES " +
            "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    private static final String FIND_EVENTS_BY_CUSTOMER_ID_EPOCH_DAY = "SELECT " + EVENT_COLUMNS +
            " FROM events WHERE epochHours = ? AND globalCustomerId = ?";
    private static final String FIND_EVENTS_BY_EPOCH_HOUR = "SELECT " + EVENT_COLUMNS +
            " FROM events WHERE epochHours = ?";
    public static final String FIND_ALL_ENTRIES = "SELECT * FROM entries_space.entries";

    private Cluster cluster;

    private Session session;

    private volatile boolean active;
    private volatile boolean activating;
    private volatile boolean deactivating;

    private int insertBatchSize;
    private ConsistencyLevel readConsistencyLevel;
    private ConsistencyLevel writeConsistencyLevel;

    private PreparedStatement insertPreparedStatement;
    private PreparedStatement findAllPreparedStatement;
    private PreparedStatement readPreparedStatement;

    public void activate() throws Exception {
        LOG.trace("Activating CasandraEventsAccessor");
        if (active || activating) {
            return;
        }
        activating = true;

        insertBatchSize = 1000;

        String readConsistency = "ONE";

        String writeConsistency = "ONE";


//        String hostNames = "127.0.0.1";
//        Preconditions.checkState(hostNames == null || !hostNames.isEmpty(), "There are no Cassandra nodes to connect!");
//        String[] hosts = hostNames.split(",");
//
//        Cluster.Builder clusterBuilder = new Cluster.Builder();
//
//        clusterBuilder.addContactPoint(hostNames);
//        Integer port = 9160;
//        clusterBuilder.withPort(port);
//        this.cluster = clusterBuilder.build();
//
//        Metadata metadata = cluster.getMetadata();
//        LOG.debug("Connected to cluster: {}", metadata.getClusterName());
//        for (Host host : metadata.getAllHosts()) {
//            LOG.debug("Host: {}", host.getAddress());
//        }
//
//        String keyspace = "entries_space";
//        session = cluster.connect(keyspace);

//        findAllPreparedStatement = session.prepare(FIND_ALL_ENTRIES);
//        findAllPreparedStatement.setConsistencyLevel(readConsistencyLevel);
//        readPreparedStatement = session.prepare(FIND_EVENTS_BY_EPOCH_HOUR);
//        readPreparedStatement.setConsistencyLevel(readConsistencyLevel);
//        insertPreparedStatement = session.prepare(INSERT_EVENT);
//        insertPreparedStatement.setConsistencyLevel(writeConsistencyLevel);


        connector.connectToCass();

        active = true;
        activating = false;
        LOG.debug("CasandraEventsAccessor is activated");

    }

    public List<EntryIterator> readEntries() throws SQLException {
        if (!active) {
            LOG.error("CasandraEventsAccessor is not active");
        }
        List<EntryIterator> results = new ArrayList<EntryIterator>();
        ResultSet resultSet = null;
        try {

            resultSet = (ResultSet) connector.cassQuery(FIND_ALL_ENTRIES);
            results.add(new EntryIterator(resultSet));

        } catch (NoHostAvailableException ex) {
            LOG.error("Cannot connect to any host in the cluster", ex);
            Map<InetAddress, Throwable> err = ex.getErrors();
            for (InetAddress address : err.keySet()) {
                LOG.error("Error on host " + address.getHostAddress() + ": ", err.get(address));
            }
        }
        return results;
    }


//        public EntryIterator readEvents(Long epochHours) {
//            if (!active) {
//                LOG.error("CasandraEventsAccessor is not active");
//                throw new DataAccessException("CasandraEventsAccessor is not active");
//            }
//            ResultSet resultSet = null;
//            try {
//                BoundStatement boundStatement = readPreparedStatement.bind(epochHours);
//                boundStatement.setConsistencyLevel(readConsistencyLevel);
//                resultSet = session.execute(boundStatement);
//            } catch (NoHostAvailableException ex) {
//                LOG.error("Cannot connect to any host in the cluster", ex);
//                Map<InetAddress, Throwable> err = ex.getErrors();
//                for (InetAddress address : err.keySet()) {
//                    LOG.error("Error on host " + address.getHostAddress() + ": ", err.get(address));
//                }
//                throw new DataAccessException(ex.getMessage(), ex);
//            }
//            return new EventIterator(resultSet);
//        }
//
//        /**
//         * Writes events into Cassandra inserting one by one.
//         */
//        @Override
//        public void writeEvents(List<Event> events) throws DataAccessException {
//            if (!active) {
//                LOG.error("CasandraEventsAccessor is not active");
//                throw new DataAccessException("CasandraEventsAccessor is not active");
//            }
//            try {
//                Stopwatch watch = Stopwatch.createStarted();
//                for (Event event : events) {
//                    BoundStatement boundStatement = bindParametersToStatement(event, insertPreparedStatement);
//                    boundStatement.setConsistencyLevel(writeConsistencyLevel);
//                    session.execute(boundStatement);
//                }
//                LOG.debug("Writing {} events completed in: {} (millis)", events.size(), watch.elapsed(TimeUnit.MILLISECONDS));
//            } catch (Exception ex) {
//                throw new DataAccessException(ex);
//            }
//        }
//
//        /**
//         * Writes events into Cassandra inserting in batch.
//         */
//        @Override
//        public void writeBatchEvents(List<Event> events) throws DataAccessException {
//            if (!active) {
//                LOG.error("CasandraEventsAccessor is not active");
//                throw new DataAccessException("CasandraEventsAccessor is not active");
//            }
//            LOG.trace("Writing {} events started at {}", events.size(), new Date());
//            long startTime = System.nanoTime();
//            int count = 1;
//            int from = 0;
//            int to = Math.min(insertBatchSize, events.size());
//            List<Event> pagedEvents = events.subList(from, to);
//            while (!pagedEvents.isEmpty()) {
//                try {
//                    LOG.trace("Inserting events from {} to {}", from, to);
//
//                    BatchStatement batchStatement = batchInsert(pagedEvents, insertPreparedStatement);
//                    session.execute(batchStatement);
//                    count++;
//                    from = to;
//                    to = Math.min(insertBatchSize * count, events.size());
//
//                    pagedEvents = events.subList(from, to);
//                } catch (Exception e) {
//                    throw new DataAccessException(e.getMessage(), e);
//                }
//            }
//            LOG.debug("Writing {} events finished at {}. Took {} nanos", events.size(), new Date(), System.nanoTime() - startTime);
//        }
//
//        @Override
//        public void deactivate() {
//            LOG.trace("Deactivating CasandraEventsAccessor");
//            if (!active || deactivating) {
//                return;
//            }
//            deactivating = true;
//            session.close();
//            cluster.close();
//
//            active = false;
//            deactivating = false;
//            LOG.trace("CasandraEventsAccessor is deactivated");
//        }
//
//        private BatchStatement batchInsert(List<Event> pagedEvents, PreparedStatement preparedStatement) throws Exception {
//            BatchStatement batchStatement = new BatchStatement();
//            batchStatement.setConsistencyLevel(writeConsistencyLevel);
//            for (Event event : pagedEvents) {
//                batchStatement.add( bindParametersToStatement(event, preparedStatement) );
//            }
//            return batchStatement;
//        }

//        private BoundStatement bindParametersToStatement(Entry event, PreparedStatement preparedStatement) {
//            return preparedStatement.bind(
//                    event.getEventId(),
//                    event.getEpochHours(),
//                    event.getGlobalCustomerId(),
//                    event.getOccurredDate(),
//                    event.getActionType(),
//                    event.getChannelCode(),
//                    event.getArticleId(),
//                    event.getContentDeliveryPlatformId(),
//                    event.getCustomerCustomerId(),
//                    event.getCustomerProductId(),
//                    event.getFeedId(),
//                    event.getLicensorId(),
//                    event.getLicensorPublicationId(),
//                    event.getMultiplier(),
//                    event.getPublicationId(),
//                    event.getDescription(),
//                    event.getRef1(),
//                    event.getRef2(),
//                    event.getSyndicatorSourceId()
//            );
//        }
}


