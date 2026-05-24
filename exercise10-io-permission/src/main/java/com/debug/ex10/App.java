package com.debug.ex10;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // Try writing to a restricted location (on many systems this will fail)
        FileWriter writer = new FileWriter("/root/protected.txt"); // BUG
        writer.write("test");
        writer.close();
    }
}