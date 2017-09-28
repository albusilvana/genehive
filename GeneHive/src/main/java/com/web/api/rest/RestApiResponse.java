package com.web.api.rest;

/**
 * Created by silvana.albert on 4/12/15.
 */
public class RestApiResponse<T> {

    public static final String STATUS_SUCCESS = "SUCCESS";

    public static final String STATUS_ERROR = "FAILURE";

    private String status;

    private String messageCode;

    private String userMessage;

    private String developerMessage;

    private T entity;

    private Integer totalSize;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }
}
