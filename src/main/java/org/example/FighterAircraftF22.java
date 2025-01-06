package org.example;

class FighterAircraftF22 extends Aircraft {
    private double fighterVolume;

    public FighterAircraftF22(String model, int maxSpeed, int range, double payload, double cargoVolume) {
        super(model, maxSpeed, range, payload);
        this.fighterVolume = fighterVolume;
    }
    public double getFighterVolume() {
        return fighterVolume;
    }

    public void setFighterVolume(double cargoVolume) {
        this.fighterVolume = cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Volume: " + fighterVolume + " cubic meters";
    }
}
