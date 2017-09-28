package com.accessor;

/**
 * Created by silvana.albert on 5/12/15.
 */
public class CassandraAccessorFactory {
    private final static CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

    private CassandraAccessorFactory() throws Exception {
        cassandraEntriesAccessor.activate();
    }

    public static CassandraEntriesAccessor getInstance() {
        return cassandraEntriesAccessor;
    }
}
