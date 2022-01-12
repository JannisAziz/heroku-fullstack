package de.jannisaziz.backend.model;

public record Product (int id, String name) {
    @Override public String toString() { return "ID-" + id + ": " + name; }
}
