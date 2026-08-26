package com.debug.ex14;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:./data/testdb", "sa", "");
        System.out.println("Connection established: " + conn);
        conn.close();
    }
}