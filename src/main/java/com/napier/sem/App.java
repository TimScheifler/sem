package com.napier.sem;

import com.napier.sem.db.DatabaseConnector;

import java.util.ArrayList;
import java.util.logging.Logger;

public class App {

    private final static Logger LOG = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        // Create new DatabaseConnector
        DatabaseConnector connector = new DatabaseConnector();

        // Connect to database
        connector.connect();

        ArrayList<Employee> employees = connector.getAllSalaries();
        //should be 24_0124
        System.out.println(employees.size());

        // Disconnect from database
        connector.disconnect();
    }
}
