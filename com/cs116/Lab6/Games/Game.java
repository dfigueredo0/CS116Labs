package com.cs116.Lab6.Games;

public class Game {
    private String description;

    public Game(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return ("Description: " + description);
    }
}
