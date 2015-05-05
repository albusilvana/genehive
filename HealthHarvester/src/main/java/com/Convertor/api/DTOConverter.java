package com.Convertor.api;

import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */

public interface DTOConverter<E, DTO> {

    List<DTO> toDTOList(List<E> entities);

    DTO toDTO(E entity);

    E toEntity(DTO dto);

}