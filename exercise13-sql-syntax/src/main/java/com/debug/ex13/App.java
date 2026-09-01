package com.debug.ex13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        // In-memory H2 database connection
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        Statement stmt = conn.createStatement();

        // Ensure the schema table exists for the query
        stmt.execute("CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(255))");
        stmt.execute("INSERT INTO users VALUES (1, 'Alice')");

        // Solution: Correct SQL keyword syntax to 'SELECT' (fixing typos like 'SELEC *').
        // Why: Relational database parsers reject misspelled DML/DDL keywords with JdbcSQLSyntaxErrorException.
        // Using standard ANSI SQL keywords ensures the database engine can parse and execute the query plan.
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            System.out.println("User: " + rs.getString("name"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}