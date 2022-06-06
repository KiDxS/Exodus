/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.student.registration.config;

import java.sql.*;

public class SQLDatabaseConnection {

    Connection connection;

    // Function call to initialize a connection to the mysql database
    public Connection initializeConnection(String database) {
        try {
            final String DB_URL = String.format("jdbc:mysql://20.89.22.46/%s", database);
            final String USER = "admin"; // Change this to the username of your mysql user.
            final String PASS = "DckVFuTu3Th5"; // Change this to the password of your mysql user
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
