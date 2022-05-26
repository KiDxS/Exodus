/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.student.registration.config;

import java.sql.*;

public class SQLDatabaseConnection {

    static final String DB_URL = "jdbc:mysql://localhost";
    static final String USER = "admin";
    static final String PASS = "VatJ3sxokbFz";
    Connection connection;

    public Connection initializeConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void greet() {
        System.out.println("test");
    }

}
