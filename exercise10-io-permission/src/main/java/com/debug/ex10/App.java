package com.debug.ex10;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Application entry point demonstrating audit log writing:
 * 1. Creates sample audit records.
 * 2. Directs output to the active writable log file.
 * 3. Writes records safely.
 */
public class App {

    public static void main(String[] args) throws IOException {
        ArchiveStorageService storageService = new ArchiveStorageService();
        AuditLogWriter writer = new AuditLogWriter();

        List<AuditRecord> records = List.of(
            new AuditRecord("EVT-1001", "admin", "USER_LOGIN", "2026-09-02T10:00:00Z"),
            new AuditRecord("EVT-1002", "system", "PAYMENT_SYNC", "2026-09-02T10:05:00Z")
        );

        // Solution: Write active audit records to getActiveLogFile() instead of getArchivedLogFile().
        // Why: The archived file (locked_audit.log) is marked as read-only. Attempting to write to a
        // read-only file with new FileWriter(...) throws java.io.IOException (Access Denied / Permission Denied).
        // Writing to getActiveLogFile() (active_audit.log) allows the application to write new records successfully.
        File targetFile = storageService.getActiveLogFile();
        int written = writer.writeRecords(targetFile, records);

        System.out.println("Written " + written + " audit records to " + targetFile.getName());
    }
}