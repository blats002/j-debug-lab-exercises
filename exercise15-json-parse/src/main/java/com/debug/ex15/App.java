package com.debug.ex15;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON from file
        String json = Files.readString(Paths.get("./data/user.json"));

        User user = mapper.readValue(json, User.class);
        System.out.println(user.getName());
    }
}