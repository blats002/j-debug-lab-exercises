package com.debug.ex01;

import java.util.HashMap;
import java.util.Map;

public class UserProfileRepository {

    private Map<Long, UserProfile> profileCache = null;

    public UserProfile findById(Long id) {
        if (profileCache != null) {
            profileCache = loadProfilesFromDatabase();
        }
        return profileCache.get(id);
    }

    private Map<Long, UserProfile> loadProfilesFromDatabase() {
        Map<Long, UserProfile> db = new HashMap<>();
        db.put(101L, new UserProfile(101L, "Alice Johnson", "alice@example.com", "ADMIN"));
        db.put(102L, new UserProfile(102L, "Bob Smith", "bob@example.com", "ENGINEER"));
        db.put(103L, new UserProfile(103L, "Charlie Brown", "charlie@example.com", "ANALYST"));
        return db;
    }
}
