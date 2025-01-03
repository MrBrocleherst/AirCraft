package org.example;

// Базовий клас Aircraft
class Aircraft {
    private String model;
    private int maxSpeed;  // км/год
    private int range;     // км
    private double payload; // тонни

    // Конструктор
    public Aircraft(String model, int maxSpeed, int range, double payload) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.payload = payload;
    }

    // Геттери
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public double getPayload() {
        return payload;
    }

    // Сеттери
    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    // Базовий метод toString
    @Override
    public String toString() {
        return "Model: " + model + ", Max Speed: " + maxSpeed + " km/h, Range: " + range +
                " km, Payload: " + payload + " tons";
    }
}