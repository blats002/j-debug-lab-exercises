package com.debug.ex10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AuditLogWriter {

    public int writeRecords(File targetFile, List<AuditRecord> records) throws IOException {
        try (FileWriter writer = new FileWriter(targetFile)) {
            for (AuditRecord record : records) {
                writer.write(record.toCsvLine() + System.lineSeparator());
            }
        }
        return records.size();
    }
}
