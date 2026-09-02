package com.debug.ex10;

import java.io.File;
import java.io.IOException;

/**
 * ArchiveStorageService manages log file destinations for compliance records.
 *
 * Core learning objective:
 * Understanding file permissions, why writing to a read-only locked file throws java.io.IOException,
 * and how to direct write operations to active writable files.
 */
public class ArchiveStorageService {

    /**
     * Returns the archived log file (locked as read-only).
     *
     * @return locked read-only File instance
     */
    public File getArchivedLogFile() throws IOException {
        File file = new File("locked_audit.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.setReadOnly();
        return file;
    }

    /**
     * Returns the active log file (writable).
     *
     * @return writable File instance
     */
    public File getActiveLogFile() throws IOException {
        File file = new File("active_audit.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.setWritable(true);
        return file;
    }
}
