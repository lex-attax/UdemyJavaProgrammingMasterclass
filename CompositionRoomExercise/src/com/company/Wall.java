package com.company;

public class Wall {
    public String color;
    public int numberOfWalls;
    public boolean needsRenovation;

    public Wall(String color, int numberOfWalls, boolean needsRenovation) {
        this.color = color;
        this.numberOfWalls = numberOfWalls;
        this.needsRenovation = needsRenovation;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public boolean isNeedsRenovation() {
        return needsRenovation;
    }

    public void changeColor(String color) {
        this.color = color;
    }
}
