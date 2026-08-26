package com.debug.ex04;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ReconciliationService reconciliationService = new ReconciliationService();
        List<String> items = reconciliationService.getIncomingProducts();
        if (!items.isEmpty()) {
            System.out.println(items.get(0));
        } else {
            System.out.println("No incoming products found.");
        }
    }
}