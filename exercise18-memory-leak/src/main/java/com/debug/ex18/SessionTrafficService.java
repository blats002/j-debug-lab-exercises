package com.debug.ex18;

/**
 * SessionTrafficService simulates high-throughput incoming user authentication traffic.
 */
public class SessionTrafficService {

    /**
     * Generates a simulated UserSession containing a 1MB payload buffer.
     *
     * @param index sequence index of the generated session
     * @return a new UserSession instance
     */
    public UserSession createSession(int index) {
        byte[] buffer = new byte[1024 * 1024]; // 1MB buffer
        return new UserSession("SESSION-" + index, "user_" + index, buffer);
    }
}
