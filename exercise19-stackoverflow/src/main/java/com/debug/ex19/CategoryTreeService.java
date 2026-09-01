package com.debug.ex19;

public class CategoryTreeService {

    /**
     * Recursively traverses from the current category up to the root parent,
     * assembling the full breadcrumb path (e.g., "Electronics > Computers > Laptops").
     */
    public String buildBreadcrumbPath(Category category) {
        if (category == null) {
            return "";
        }
        if (category.getParent() == null) {
            return category.getName();
        }
        return buildBreadcrumbPath(category.getParent()) + " > " + category.getName();
    }
}
