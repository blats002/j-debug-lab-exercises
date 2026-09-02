package com.debug.ex01;

import java.util.HashMap;
import java.util.Map;

/**
 * UserProfileRepository manages user profile persistence and in-memory caching.
 *
 * Core learning objective:
 * Understanding how inverted conditions in lazy-loading patterns lead to java.lang.NullPointerException,
 * and how defensive initialization ensures safe collection lookups.
 */
public class UserProfileRepository {

    private Map<Long, UserProfile> profileCache = null;

    /**
     * Looks up a UserProfile by unique identifier with lazy cache initialization.
     *
     * Solution: Invert the check to 'if (profileCache == null)'.
     * Why: When 'profileCache' is initially null, checking '!= null' prevents initialization from running.
     * As a result, 'profileCache' remains null, and calling profileCache.get(id) throws NullPointerException.
     * Checking '== null' guarantees the cache is populated on first access before calling .get(id).
     *
     * @param id the unique user identifier
     * @return the corresponding UserProfile instance, or null if not found
     */
    public UserProfile findById(Long id) {
        if (profileCache == null) {
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
