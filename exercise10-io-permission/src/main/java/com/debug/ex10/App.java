package com.debug.ex10;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("/root/protected.txt");
        writer.write("test");
        writer.close();
    }
}