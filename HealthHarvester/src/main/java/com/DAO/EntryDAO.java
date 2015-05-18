package com.DAO;

import com.Convertor.core.EntryDTOConvertor;
import com.DTO.BasicEntityDTO;
import com.DTO.EntryDTO;
import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDAO {

    CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

    EntryDTOConvertor entryDTOConvertor = new EntryDTOConvertor();

    public List<EntryDTO> getAllEntries() throws Exception {
        cassandraEntriesAccessor.activate();
        List<Entry> entities = (List<Entry>) cassandraEntriesAccessor.readEntries();

        return entryDTOConvertor.toDTOList(entities);
    }

    public List<BasicEntityDTO> getBasicEntitiesDto() throws Exception {
        cassandraEntriesAccessor.activate();
        List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByContry();
        List<BasicEntityDTO> returnList = new ArrayList<BasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            BasicEntityDTO newEntityDTO = new BasicEntityDTO(country, 0);
            for (BasicEntityDTO basicEntityDTO : basicEntityDTOList) {
                if (basicEntityDTO.getCode().equals(country)) {
                    newEntityDTO.setZ(newEntityDTO.getZ() + basicEntityDTO.getZ());
                }
            }
            returnList.add(newEntityDTO);
        }
        return returnList;
    }
}
