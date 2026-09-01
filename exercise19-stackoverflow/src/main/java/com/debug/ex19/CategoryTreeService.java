package com.debug.ex19;

public class CategoryTreeService {

    /**
     * Recursively traverses from the current category up to the root parent,
     * assembling the full breadcrumb path (e.g., "Electronics > Computers > Laptops").
     */
    public String buildBreadcrumbPath(Category category) {
        // Base case 1: Null check handles empty or non-existent category lookups safely
        if (category == null) {
            return "";
        }
        
        // Base case 2: Root category has reached top of hierarchy (no parent) -> stops recursion
        if (category.getParent() == null) {
            return category.getName();
        }
        
        // Recursive step: Traverse up to parent and append current category name
        return buildBreadcrumbPath(category.getParent()) + " > " + category.getName();
    }
}
