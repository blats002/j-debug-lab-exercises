package com.debug.ex09;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader("data/input.txt")
        );
        System.out.println(reader.readLine());
        reader.close();
    }
}