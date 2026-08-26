package com.debug.ex15;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON from file
        File file = new File("./data/user.json");
        if (!file.exists()) {
            file = new File("exercise15-json-parse/data/user.json");
        }
        String json = Files.readString(file.toPath());

        User user = mapper.readValue(json, User.class);
        System.out.println(user.getName());
    }
}