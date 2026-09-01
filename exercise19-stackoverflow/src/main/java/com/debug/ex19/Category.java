package com.debug.ex19;

public class Category {
    private final String name;
    private Category parent;

    public Category(String name) {
        this(name, null);
    }

    public Category(String name, Category parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }
}
