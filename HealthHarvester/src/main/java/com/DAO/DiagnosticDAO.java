package com.DAO;

import com.Convertor.core.EntryDTOConvertor;
import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;

import java.util.List;

/**
 * Created by silvana.albert on 5/6/15.
 */
public class DiagnosticDAO {

    CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

    public List<String> getAllDiagnostics() throws Exception {
        cassandraEntriesAccessor.activate();
        List<String> entities=  cassandraEntriesAccessor.readDiagnostics();

        return entities;
    }
}
