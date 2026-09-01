package com.debug.ex11;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");

        // Solution: Collect items to add/remove in a secondary collection and apply modifications after iteration.
        // Why: Standard Java collections (like ArrayList) maintain an internal modification count (modCount).
        // Calling items.add() or items.remove() directly inside an enhanced for-each loop invalidates the
        // underlying iterator's expected modCount, throwing ConcurrentModificationException.
        // Staging mutations in 'toAdd' and calling items.addAll() after traversal completes eliminates the error.
        List<String> toAdd = new ArrayList<>();
        for (String item : items) {
            if ("B".equals(item)) {
                toAdd.add("D");
            }
        }
        items.addAll(toAdd);
        System.out.println("Items after safe modification: " + items);
    }
}