package com.debug.ex18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionCacheTest {

    @Test
    @DisplayName("Verify SessionCacheManager stores sessions and bounds capacity")
    void testSessionCaching() {
        SessionCacheManager manager = new SessionCacheManager();
        SessionTrafficService service = new SessionTrafficService();

        for (int i = 0; i < 10; i++) {
            manager.cacheSession(service.createSession(i));
        }

        assertTrue(manager.getCachedSessionCount() <= 5, "Cache should enforce maximum capacity limit");
        manager.clear();
        assertEquals(0, manager.getCachedSessionCount(), "Clear should release all cached sessions");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without OutOfMemoryError")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should manage memory allocations safely without throwing OutOfMemoryError");
    }
}
