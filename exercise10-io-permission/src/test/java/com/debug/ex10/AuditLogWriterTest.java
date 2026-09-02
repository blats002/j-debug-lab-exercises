package com.debug.ex10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AuditLogWriterTest {

    @Test
    @DisplayName("Verify AuditLogWriter writes records to active file without IOException")
    void testWriteToActiveFile() throws Exception {
        ArchiveStorageService storageService = new ArchiveStorageService();
        AuditLogWriter writer = new AuditLogWriter();

        File activeFile = storageService.getActiveLogFile();
        List<AuditRecord> records = List.of(
            new AuditRecord("EVT-1", "user1", "LOGIN", "2026-09-02T10:00:00Z")
        );

        int count = writer.writeRecords(activeFile, records);
        assertEquals(1, count);
        assertTrue(activeFile.exists(), "Active file should exist");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing IOException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should write audit logs to a permitted writable file without throwing IOException");
    }
}
