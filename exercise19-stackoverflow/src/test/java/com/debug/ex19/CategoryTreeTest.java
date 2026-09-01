package com.debug.ex19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryTreeTest {

    @Test
    @DisplayName("Verify linear category hierarchy constructs correct breadcrumb path")
    void testLinearCategoryPath() {
        CategoryTreeService service = new CategoryTreeService();
        Category root = new Category("Electronics");
        Category sub = new Category("Computers", root);
        Category item = new Category("Laptops", sub);

        String path = service.buildBreadcrumbPath(item);
        assertEquals("Electronics > Computers > Laptops", path);
    }

    @Test
    @DisplayName("Verify root category with no parent returns its name")
    void testRootCategoryPath() {
        CategoryTreeService service = new CategoryTreeService();
        Category root = new Category("Books");

        String path = service.buildBreadcrumbPath(root);
        assertEquals("Books", path);
    }

    @Test
    @DisplayName("Verify App.main executes without StackOverflowError")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should configure a valid category tree without throwing StackOverflowError");
    }
}
