package com.debug.ex19;

public class App {
    public static void main(String[] args) {
        CategoryTreeService service = new CategoryTreeService();

        // Solution: Maintain an acyclic (DAG / Tree) hierarchy where the root category has null parent.
        // Why: Setting root.setParent(item) creates a circular dependency: Laptops -> Computers -> Electronics -> Laptops.
        // When recursive path traversal traverses 'getParent()', it enters an infinite recursion loop that exhausts
        // the thread's call stack, throwing java.lang.StackOverflowError.
        // Ensuring root.getParent() is null terminates recursion cleanly when the top of the hierarchy is reached.
        Category root = new Category("Electronics");
        Category sub = new Category("Computers", root);
        Category item = new Category("Laptops", sub);

        String path = service.buildBreadcrumbPath(item);
        System.out.println("Category Path: " + path);
    }
}