package com.debug.ex18;

import java.util.ArrayList;
import java.util.List;

/**
 * SessionCacheManager maintains active user sessions in memory.
 *
 * Core learning objective:
 * Understanding how unbounded object retention causes java.lang.OutOfMemoryError (Java heap space)
 * and how bounded capacity limits and cache eviction enable the Garbage Collector (GC) to reclaim memory.
 */
public class SessionCacheManager {

    private static final int MAX_CACHE_CAPACITY = 5;
    private final List<UserSession> activeSessions = new ArrayList<>();

    /**
     * Caches a user session with bounded capacity eviction.
     *
     * Solution: When the cache reaches its maximum threshold (MAX_CACHE_CAPACITY), evict older entries.
     * Why: Retaining strong references to every incoming session object indefinitely prevents the
     * Garbage Collector from freeing old session buffers. Bounding the cache size or evicting expired
     * sessions ensures memory utilization remains stable and prevents heap exhaustion.
     *
     * @param session the UserSession to cache
     */
    public void cacheSession(UserSession session) {
        if (activeSessions.size() >= MAX_CACHE_CAPACITY) {
            activeSessions.remove(0); // Evict oldest session
        }
        activeSessions.add(session);
    }

    public int getCachedSessionCount() {
        return activeSessions.size();
    }

    public void clear() {
        activeSessions.clear();
    }
}
