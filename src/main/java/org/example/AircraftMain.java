package org.example;

import java.util.ArrayList;
import java.util.List;

// Головний клас
public class AircraftMain {
    public static void main(String[] args) {
        // Список літаків
        List<Aircraft> aircraftList = new ArrayList<>();
        aircraftList.add(new PassengerAircraft("Boeing 747", 900, 15000, 400, 416));
        aircraftList.add(new CargoAircraft("Antonov An-225", 850, 12000, 250, 1300));
        aircraftList.add(new FighterAircraft("F-22 Raptor", 2410, 2960, 19.7, "Air-to-Air Missiles"));

        // Вивід усіх літаків
        System.out.println("All Aircraft:");
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft);
        }

        // Пошук літака з найбільшою дальністю польоту
        Aircraft maxRangeAircraft = findAircraftWithMaxRange(aircraftList);
        System.out.println("\nAircraft with the longest range:");
        System.out.println(maxRangeAircraft);

        // Пошук літака за моделлю
        String searchModel = "Antonov An-225";
        Aircraft foundAircraft = findAircraftByModel(aircraftList, searchModel);
        System.out.println("\nSearch result for model \"" + searchModel + "\":");
        if (foundAircraft != null) {
            System.out.println(foundAircraft);
        } else {
            System.out.println("Aircraft not found.");
        }
    }

    // Метод для пошуку літака з найбільшою дальністю
    public static Aircraft findAircraftWithMaxRange(List<Aircraft> aircraftList) {
        Aircraft maxRangeAircraft = null;
        int maxRange = 0;

        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getRange() > maxRange) {
                maxRange = aircraft.getRange();
                maxRangeAircraft = aircraft;
            }
        }
        return maxRangeAircraft;
    }

    // Метод для пошуку літака за моделлю
    public static Aircraft findAircraftByModel(List<Aircraft> aircraftList, String model) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getModel().equalsIgnoreCase(model)) {
                return aircraft;
            }
        }
        return null;
    }
}
