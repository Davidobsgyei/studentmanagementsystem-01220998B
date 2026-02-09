package com.smsplus.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInit {

    public static void createStudentsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "email TEXT NOT NULL," +
                "course TEXT NOT NULL" +
                ");";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Students table is ready.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // For testing
    public static void main(String[] args) {
        createStudentsTable();
    }
}
