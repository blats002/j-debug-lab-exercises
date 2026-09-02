package com.debug.ex10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * AuditLogWriter handles writing structured audit entries to a file.
 */
public class AuditLogWriter {

    /**
     * Writes records into the target file using try-with-resources to ensure
     * the FileWriter is automatically closed and flushed.
     *
     * @param targetFile destination file
     * @param records    list of audit records to write
     * @return count of written records
     * @throws IOException if the destination file is read-only or I/O fails
     */
    public int writeRecords(File targetFile, List<AuditRecord> records) throws IOException {
        try (FileWriter writer = new FileWriter(targetFile)) {
            for (AuditRecord record : records) {
                writer.write(record.toCsvLine() + System.lineSeparator());
            }
        }
        return records.size();
    }
}
