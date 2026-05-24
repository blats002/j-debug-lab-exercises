package com.debug.ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:./data/tstdb;IFEXISTS=TRUE", "sa", "");
        System.out.println(conn);
    }
}