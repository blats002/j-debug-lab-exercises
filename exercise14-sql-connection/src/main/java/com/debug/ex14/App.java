package com.debug.ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        // Solution: Use a valid JDBC URL without conflicting parameters (e.g. removing 'IFEXISTS=TRUE' on new DBs).
        // Why: When connecting to an embedded database with IFEXISTS=TRUE or an unroutable port/host,
        // DriverManager throws SQLException / DatabaseNotFoundException. Using standard JDBC connection
        // string parameters allows the driver to locate, initialize, and open the connection stream.
        String jdbcUrl = "jdbc:h2:./data/testdb";
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, "sa", "")) {
            System.out.println("Connected to database successfully: " + !conn.isClosed());
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}