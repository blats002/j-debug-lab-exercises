package com.debug.ex10;

import java.io.File;
import java.io.IOException;

public class ArchiveStorageService {

    public File getArchivedLogFile() throws IOException {
        File file = new File("locked_audit.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.setReadOnly();
        return file;
    }

    public File getActiveLogFile() throws IOException {
        File file = new File("active_audit.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.setWritable(true);
        return file;
    }
}
