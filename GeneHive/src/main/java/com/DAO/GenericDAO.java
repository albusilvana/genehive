package com.DAO;


import java.util.Date;
import java.util.List;
import java.util.Map;



/**
 * Generic DAO
 *
 * @param <E> the entity type
 * @param <K> the key type. Eg: Long, String
 */
public interface GenericDAO<E, K> {

    K create(E entity);

    void batchCreate(List<E> entities, int batchSize);

    void batchUpdate(List<E> entities, int batchSize);

    void batchUpsert(Class<E> entityClazz, List<E> entities, int batchSize);

    E find(Class<E> entityClazz, K id);

    /**
     * @param entityClazz  the class of the entity
     * @param itemsPerPage how many items per page
     * @param page         the page number to start counting the items per page, starts from 0
     * @return a paginated view for the entities, or empty list if none found
     */
    List<E> findAll(Class<E> entityClazz, int itemsPerPage, int page);

    /**
     * @param entityClazz  the class of the entity
     * @param conditions   the conditions to filter the entity
     * @param itemsPerPage how many items per page
     * @param page         the page number to start counting the items per page, starts from 0
     * @return a paginated view for the filtered entities, or empty list if none found
     */
    List<E> findAllByMultipleConditions(Class<E> entityClazz, Map<String, Object> conditions, int itemsPerPage, int page);

    /**
     * Method finds, filters returns in paginated manner all entities
     *
     * @param entityClazz       the class of the entity

     * @param itemsPerPage      number of items per page
     * @param page              the page number
     * @return a paginated view for the filtered entities, or empty list if none found
     */
    public List<E> findAllByMultipleConditions(Class<E> entityClazz, int itemsPerPage, int page);

    public List<E> findAllByMultipleConditionsSorted(Class<E> entityClazz, Map<String, Object> conditions, List<?> sortOptions, int itemsPerPage, int page);

    /**
     * @param entityClazz  the class of the entity
     * @param sortOptions  the sort options(parameter names and sorting order)
     * @param itemsPerPage how many items per page
     * @param pageNr       the page number to start counting the items per page, starts from 0
     * @return a paginated view for the sorted entities, or empty list if none found
     */
    List<E> findAllSorted(Class<E> entityClazz, List<?> sortOptions, int itemsPerPage, int pageNr);

    List<E> findAllByNamedQuery(Class<E> entityClazz, String namedQuery, Map<String, Object> params);

    /**
     * @param entityClazz  the class of the entity
     * @param query        The named query
     * @param params       conditions to filter the entities
     * @param itemsPerPage items to display per page
     * @param pageNr       the page number to retrieve
     * @return a list of entities by a named query using pagination
     */
    List<E> findAllByNamedQuery(Class<E> entityClazz, String query, Map<String, Object> params, int itemsPerPage, int pageNr);

    E update(E entity);

    void remove(E entity);  //~ TODO: no need

    /**
     * Generic method used for returning the total number of records for a specific entity
     *
     * @param entityClazz the class of the entity
     * @return the total number of records found in DB
     */
    int getTotalSize(Class<E> entityClazz);

    /**
     * Generic method used for returning the total number of records for a specific entity
     * by a map of conditions
     * (eg. info needed for pagination in UI)
     *
     * @param entityClazz the class of the entity
     * @param conditions  the conditions to filter the entity
     * @return the total number of records found in DB
     */
    int getTotalSize(Class<E> entityClazz, Map<String, Object> conditions);


    /**
     * Generic method used for returning the total number of records for a specific search by a named query
     * (eg. info needed for pagination in UI)
     *
     * @param clazz      the class of the entity
     * @param namedQuery the named query
     * @param params     params to apply to the named query
     * @return a int value representing the total size
     */
    int getTotalSizeByNamedQuery(Class<E> clazz, String namedQuery, Map<String, Object> params);


    List<E> findUpdatedBetween(Class<E> entityClazz, Date startDate, Date endDate);

    /**
     * Returns the updated entities in the given period
     *
     * @param entityClazz class of the entity
     * @param startDate   start date interval
     * @param endDate     end date interval
     * @param pageNumber  index page string with 0
     * @param pageSize    size of the elements on a page
     * @return one page of the entire list of updated entities
     */
    List<E> findPagedUpdatedBetween(Class<E> entityClazz, Date startDate, Date endDate, int pageNumber, int pageSize);

    @Deprecated
    Object runQueryWithSingleResult(String queryName, List<Object> paramValues);

    Object runQueryWithSingleResult(String queryName, Map<String, Object> params);

    List<Object[]> runQuery(String queryName, List<Object> paramValues);

    List<Object[]> runQuery(String queryName, Map<String, Object> params);

    List<Object[]> runNativeQuery(String queryName, List<Object> paramValues);

}
