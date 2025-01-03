package org.example;

// Клас PassengerAircraft
class PassengerAircraft extends Aircraft {
    private int passengerCapacity; // Кількість пасажирів

    public PassengerAircraft(String model, int maxSpeed, int range, double payload, int passengerCapacity) {
        super(model, maxSpeed, range, payload);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passenger Capacity: " + passengerCapacity;
    }
}
