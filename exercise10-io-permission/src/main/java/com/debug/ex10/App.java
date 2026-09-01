package com.debug.ex10;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // Solution: Write to a safe, user-writable relative path (e.g. "protected.txt" or application log dir).
        // Why: Attempting to write to system-restricted paths like "/root/protected.txt" or "C:\Windows" throws
        // IOException / AccessDeniedException / FileNotFoundException because the process lacks OS privileges.
        // Using a relative path within the application directory ensures write permissions succeed across platforms.
        // Using try-with-resources guarantees the file writer is properly flushed and closed.
        try (FileWriter writer = new FileWriter("protected.txt")) {
            writer.write("test");
        }
    }
}