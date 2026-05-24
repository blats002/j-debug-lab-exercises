package com.debug.ex11;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");

        for (String item : items) {
            if ("B".equals(item)) {
                items.add("D");
            }
        }
    }
}