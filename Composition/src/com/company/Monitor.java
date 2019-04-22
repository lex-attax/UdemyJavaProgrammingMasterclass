package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResosution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResosution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResosution = nativeResosution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " +x + ", " + y + " in colour " + color);
    }
}
