package com.DAO.core;



public class DefaultGenericDAO<E> {

    protected static final String ENTITY = " e ";
    protected static final String FIND_ALL_TEMPLATE = " FROM %s " + ENTITY;
    protected static final String FIND_ALL_BY_PROPERTIES_TEMPLATE = "FROM %s " + ENTITY + " where %s";
    protected static final String GET_COUNT_BY_CONDITIONS = "SELECT COUNT(*) FROM %s " + ENTITY + " where %s";
    protected static final String GET_COUNT = "SELECT COUNT(*) FROM %s " + ENTITY;
    protected static final String CONDITIONS_ARE_NULL_OR_EMPTY = "Conditions are null or empty!";


}
