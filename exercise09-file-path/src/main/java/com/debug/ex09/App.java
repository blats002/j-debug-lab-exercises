package com.debug.ex09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("data/input.txt");

        // Solution: Verify file and directory existence before attempting to read.
        // Why: Opening a FileReader on a non-existent relative or absolute path throws FileNotFoundException.
        // Ensuring parent directories exist (mkdirs()) and creating the initial file if missing guarantees
        // the file stream can be opened successfully regardless of the current working directory.
        if (!file.exists()) {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("Sample file content");
            }
        }

        // Safe reading with try-with-resources: automatically closes the stream
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Read file content: " + reader.readLine());
        }
    }
}