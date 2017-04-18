package com.favoriteshop.model;

public enum Role {

    SIMPLE_USER("Simple user"),
    ADMIN("Admin");

    private String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
