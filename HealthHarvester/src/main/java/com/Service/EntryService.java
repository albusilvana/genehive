package com.Service;

import com.Convertor.core.EntityBaseDTOs;
import com.Convertor.core.EntryDTOConvertor;
import com.DAO.EntryDAO;
import com.DTO.BasicEntityDTO;
import com.DTO.EntryDTO;
import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;

import java.util.List;

/**
 * Created by silvana.albert on 4/10/15.
 */
public class EntryService {

    private EntryDAO entryDAO = new EntryDAO();

    public List<EntryDTO> getAllEntries() throws Exception {
        return entryDAO.getAllEntries();
    }


    public List<BasicEntityDTO> getAllBasicEntitiesDTO() throws Exception{
        return entryDAO.getBasicEntitiesDto();
    }
}
