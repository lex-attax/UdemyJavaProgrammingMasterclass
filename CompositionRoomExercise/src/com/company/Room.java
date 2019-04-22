package com.company;

public class Room {
    public int squareMeters;
    public int height;
    public Wall wall;
    public Furniture furniture;

    public Room(int squareMeters, int height, Wall wall, Furniture furniture) {
        this.squareMeters = squareMeters;
        this.height = height;
        this.wall = wall;
        this.furniture = furniture;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getHeight() {
        return height;
    }

    public Wall getWall() {
        return wall;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
