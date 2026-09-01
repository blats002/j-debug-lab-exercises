package com.debug.ex15;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.nio.file.Files;

public class App {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Locate data/user.json relative to multi-module root or submodule directory
        File file = new File("./data/user.json");
        if (!file.exists()) {
            file = new File("exercise15-json-parse/data/user.json");
        }
        
        // Solution: Remove illegal syntax (e.g., trailing commas like '{"name": "Alice",}') in user.json.
        // Why: Standard JSON specifications (RFC 8259) forbid trailing commas before closing braces/brackets.
        // Jackson's default parser strictly validates token grammar and throws JsonParseException on invalid tokens.
        // Fixing the JSON structure ensures the ObjectMapper can map keys directly into the User POJO.
        String json = Files.readString(file.toPath());

        User user = mapper.readValue(json, User.class);
        System.out.println("Parsed User Name: " + user.getName());
    }
}