package com.debug.ex10;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        ArchiveStorageService storageService = new ArchiveStorageService();
        AuditLogWriter writer = new AuditLogWriter();

        List<AuditRecord> records = List.of(
            new AuditRecord("EVT-1001", "admin", "USER_LOGIN", "2026-09-02T10:00:00Z"),
            new AuditRecord("EVT-1002", "system", "PAYMENT_SYNC", "2026-09-02T10:05:00Z")
        );

        File targetFile = storageService.getArchivedLogFile();
        int written = writer.writeRecords(targetFile, records);

        System.out.println("Written " + written + " audit records to " + targetFile.getName());
    }
}