package com.loginapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/loginapp"; // replace 'loginapp' with your DB name
        String user = "root"; // your DB username
        String password = "root"; // your DB password

        // Try to connect
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to Database Successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to Database!");
            e.printStackTrace();
        }
    }
}
