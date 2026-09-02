package com.debug.ex10;

public class AuditRecord {
    private final String eventId;
    private final String actor;
    private final String action;
    private final String timestamp;

    public AuditRecord(String eventId, String actor, String action, String timestamp) {
        this.eventId = eventId;
        this.actor = actor;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String toCsvLine() {
        return eventId + "," + actor + "," + action + "," + timestamp;
    }
}
