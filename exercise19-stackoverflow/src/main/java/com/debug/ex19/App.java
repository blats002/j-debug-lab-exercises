package com.debug.ex19;

public class App {
    public static void main(String[] args) {
        CategoryTreeService service = new CategoryTreeService();

        Category root = new Category("Electronics");
        Category sub = new Category("Computers", root);
        Category item = new Category("Laptops", sub);

        root.setParent(item);

        String path = service.buildBreadcrumbPath(item);
        System.out.println("Category Path: " + path);
    }
}