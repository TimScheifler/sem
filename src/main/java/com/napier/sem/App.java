package com.napier.sem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class App {

    private final static Logger LOG = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) throws SQLException {
        // Create new DatabaseConnector
        DatabaseConnector connector = new DatabaseConnector();

        // Connect to database
        connector.connect();

        ArrayList<Employee> employees = connector.getAllSalaries();
        //should be 24_0124
        System.out.println(employees.size());
        //connector.printSalaries(employees);   //commented, because it's failing for some reason even though there are no errors.

        Department department = connector.getDepartment("Sales");
        System.out.println(department);
        ArrayList<Employee> employees1 = connector.getSalariesByDepartment(department);
        for (Employee employee : employees1){
            System.out.println(employee);
        }
        System.out.println(employees1.size());
        System.out.println("done. Going to disconnect!");
        connector.disconnect();
    }
}
