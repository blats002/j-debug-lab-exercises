package com.debug.ex18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        for (long i = 0; i < 5; i++) {
            list.add(new byte[1024 * 1024]); // 1MB
            System.out.println("Allocated: " + list.size() + " MB");
            list.clear();
        }
    }
}