package com.DAO;

import com.Convertor.core.EntryDTOConvertor;
import com.DTO.EntryDTO;
import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;

import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDAO {

    CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

    EntryDTOConvertor entryDTOConvertor = new EntryDTOConvertor();

    public List<EntryDTO> getAllEntries() throws Exception {
        cassandraEntriesAccessor.activate();
        List<Entry> entities= (List<Entry>) cassandraEntriesAccessor.readEntries();

        return entryDTOConvertor.toDTOList(entities);
    }
}
