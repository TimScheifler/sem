package com.napier.sem;

import com.napier.sem.db.DatabaseConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class App {

    private final static Logger LOG = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        // Create new DatabaseConnector
        DatabaseConnector connector = new DatabaseConnector();

        // Connect to database
        connector.connect();

        // Disconnect from database
        connector.disconnect();
    }
}
