package org.example;

// Клас CargoAircraft
class CargoAircraft extends Aircraft {
    private double cargoVolume; // Об'єм вантажного відсіку (куб. м)

    public CargoAircraft(String model, int maxSpeed, int range, double payload, double cargoVolume) {
        super(model, maxSpeed, range, payload);
        this.cargoVolume = cargoVolume;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Volume: " + cargoVolume + " cubic meters";
    }
}