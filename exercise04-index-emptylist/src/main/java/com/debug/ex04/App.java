package com.debug.ex04;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ReconciliationService reconciliationService = new ReconciliationService();
        List<String> items = reconciliationService.getIncomingProducts();
        System.out.println(items.get(0));
    }
}