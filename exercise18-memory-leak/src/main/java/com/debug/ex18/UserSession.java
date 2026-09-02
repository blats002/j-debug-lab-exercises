package com.debug.ex18;

/**
 * UserSession is an immutable domain model representing an authenticated user session
 * holding session context and memory buffers.
 */
public class UserSession {

    private final String sessionId;
    private final String username;
    private final byte[] sessionBuffer;

    /**
     * Constructs a new UserSession.
     *
     * @param sessionId     unique session token identifier
     * @param username      authenticated user login name
     * @param sessionBuffer in-memory session state buffer
     */
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
