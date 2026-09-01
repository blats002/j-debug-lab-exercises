package com.debug.ex18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        // Solution: Limit loop iterations and periodically clear/evict accumulated buffers.
        // Why: Holding strong references to large byte arrays in a collection prevents the Garbage Collector (GC)
        // from reclaiming heap memory. In an unbounded loop, this rapidly consumes all available JVM heap space
        // and throws java.lang.OutOfMemoryError: Java heap space. Clearing or bounding the collection allows GC
        // to reclaim memory and keeps heap utilization stable.
        for (int i = 0; i < 5; i++) {
            list.add(new byte[1024 * 1024]); // 1MB buffer
        }
        
        System.out.println("Allocated " + list.size() + "MB safely without exhausting JVM heap.");
        list.clear(); // Release references for garbage collection
    }
}