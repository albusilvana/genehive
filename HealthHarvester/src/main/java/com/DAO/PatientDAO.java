package com.DAO;

import java.sql.ResultSet;

import com.Persistence.Connector;

/**
 * Created by silvana.albert on 3/11/15.
 */
public class PatientDAO {

    private Connector connector = new Connector();

    public static void main(String[] args) throws Exception {
        Connector connector = new Connector();
        connector.connectToCass();
        ResultSet resultSet = connector.cassQuery("select * from Entries_Space.entries ");


    }
}
