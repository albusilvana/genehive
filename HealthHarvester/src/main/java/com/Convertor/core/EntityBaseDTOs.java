package com.Convertor.core;

import com.Model.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Transfer Object for storing a list of {@link EntityBaseDTOs} and the total size of the list
 */
public class EntityBaseDTOs {

    private List<? extends Entity> entityList = new ArrayList<Entity>();
    private int totalSize;
    private String message;

    public EntityBaseDTOs() {
    }

    public EntityBaseDTOs(List<? extends Entity> entityList, int totalSize) {
        this.entityList = entityList;
        this.totalSize = totalSize;
    }

    public List<? extends Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<? extends Entity> entityList) {
        this.entityList = entityList;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public boolean isEmpty() {
        return entityList.isEmpty();
    }
}
