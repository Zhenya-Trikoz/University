package org.example.model;

import java.util.UUID;

public class University {
    private UUID ID;
    private String name;

    public University(String name) {
        this.ID = UUID.randomUUID();
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Університет {" +
                "ID=" + getID() +
                ", Назва = " + getName() +
                '}';
    }
}
