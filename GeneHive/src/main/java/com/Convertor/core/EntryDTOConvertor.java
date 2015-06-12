package com.Convertor.core;

import com.Convertor.api.DTOConverter;
import com.DTO.EntryDTO;
import com.Model.Entity;
import com.Model.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDTOConvertor implements DTOConverter<Entry, EntryDTO> {

    @Override
    public List<EntryDTO> toDTOList(List<Entry> entities) {

        List<EntryDTO> dtos = new ArrayList<EntryDTO>();
        for (Entry entity : entities) {
            dtos.add(toDTO(entity));
        }

        return dtos;
    }

    @Override
    public EntryDTO toDTO(Entry entity) {

        if (entity == null) {
            return null;
        }

        EntryDTO actionDTO = new EntryDTO(entity.getIdentificationNumber(), entity.getCountryCode(), entity.getMutationEntries());
        return actionDTO;
    }

    @Override
    public Entry toEntity(EntryDTO entryDTO) {
        return new Entry(entryDTO.getIdentificationNumber(), entryDTO.getCountryCode(), entryDTO.getMutationEntries());
    }


}
