package com.debug.ex19;

public class App {
    public static void main(String[] args) {
        CategoryTreeService service = new CategoryTreeService();

        // Valid linear category hierarchy without circular references
        Category root = new Category("Electronics");
        Category sub = new Category("Computers", root);
        Category item = new Category("Laptops", sub);

        String path = service.buildBreadcrumbPath(item);
        System.out.println("Category Path: " + path);
    }
}