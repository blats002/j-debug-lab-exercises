package com.debug.ex04;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ReconciliationService reconciliationService = new ReconciliationService();
        List<String> items = reconciliationService.getIncomingProducts();
        
        // Solution: Check if the list contains elements (!items.isEmpty()) before accessing index 0.
        // Why: When an upstream service returns an empty list, calling items.get(0) throws IndexOutOfBoundsException
        // because size is 0. Checking isEmpty() enables graceful handling/fallback for empty datasets.
        if (items != null && !items.isEmpty()) {
            System.out.println("First product: " + items.get(0));
        } else {
            System.out.println("No incoming products found.");
        }
    }
}