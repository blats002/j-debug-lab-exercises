package com.debug.ex18;

public class UserSession {
    private final String sessionId;
    private final String username;
    private final byte[] sessionBuffer;

    public UserSession(String sessionId, String username, byte[] sessionBuffer) {
        this.sessionId = sessionId;
        this.username = username;
        this.sessionBuffer = sessionBuffer;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getUsername() {
        return username;
    }

    public byte[] getSessionBuffer() {
        return sessionBuffer;
    }
}
