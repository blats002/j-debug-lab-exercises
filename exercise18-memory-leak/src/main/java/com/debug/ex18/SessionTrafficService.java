package com.debug.ex18;

public class SessionTrafficService {

    public UserSession createSession(int index) {
        // 1MB session state buffer
        byte[] buffer = new byte[1024 * 1024];
        return new UserSession("SESSION-" + index, "user_" + index, buffer);
    }
}
