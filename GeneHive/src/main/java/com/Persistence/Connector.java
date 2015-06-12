package com.Persistence;

import java.sql.*;
import java.util.Iterator;

/**
 * Created by silvana.albert on 2/24/15.
 */
public class Connector {

    static Connection connectionCass;
    public static ResultSet rs;
    public final static String CASS_HOST = "jdbc:cassandra://127.0.0.1:9160";

    public static void connectToCass() throws Exception {
        if (connectionCass == null || connectionCass.isClosed()) {
            String connectionURL = CASS_HOST;
            Class.forName("org.apache.cassandra.cql.jdbc.CassandraDriver").newInstance();
            connectionCass= DriverManager.getConnection(connectionURL);
        }
    }

    public static ResultSet cassQuery(String query) throws SQLException {
        Statement statement = null;
        try {
            System.out.println(" " + query);
            statement = connectionCass.createStatement();
            rs = statement.executeQuery(query);
        }
        catch (Exception ex) {
            System.out.print(ex);
        }
        return rs;
    }

    public static void main(String[] args) throws Exception {
        connectToCass();
        ResultSet resultSet = cassQuery("select identificationNumber,countrycode,mutationentries  from Entries_Space.Entries");

        System.out.print(resultSet);

    }
}
