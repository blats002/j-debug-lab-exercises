package com.debug.ex09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("data/input.txt");
        if (!file.exists()) {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("Sample file content");
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println(reader.readLine());
        }
    }
}