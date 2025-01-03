package org.example;

// Клас FighterAircraft
class FighterAircraft extends Aircraft {
    private String weaponry; // Тип озброєння

    public FighterAircraft(String model, int maxSpeed, int range, double payload, String weaponry) {
        super(model, maxSpeed, range, payload);
        this.weaponry = weaponry;
    }

    public String getWeaponry() {
        return weaponry;
    }

    public void setWeaponry(String weaponry) {
        this.weaponry = weaponry;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weaponry: " + weaponry;
    }
}
