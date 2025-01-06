package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// головний клас
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Aircraft> aircraftsList = new ArrayList();
        aircraftsList.add(new PassengerAircraft("Boeing 747", 900, 15000, 400.0, 416));
        aircraftsList.add(new CargoAircraft("Antonov An-225", 850, 12000, 250.0, 1300.0));
        aircraftsList.add(new FighterAircraft("F-22 Raptor", 2410, 2960, 19.7, "Air-to-Air Missiles"));
        System.out.println("All Aircraft:");

        for (Aircraft aircraft : aircraftsList) {
            System.out.println(aircraft);
        }

        Aircraft maxRangeAircraft = findAircraftWithMaxRange(aircraftsList);
        System.out.println("\nAircraft with the longest range:");
        System.out.println(maxRangeAircraft);
        String searchModel = "Antonov An-225";
        Aircraft foundAircraft = findAircraftByModel(aircraftsList, searchModel);
        System.out.println("\nSearch result for model \"" + searchModel + "\":");
        if (foundAircraft != null) {
            System.out.println(foundAircraft);
        } else {
            System.out.println("Aircraft not found.");
        }

    }

    public static Aircraft findAircraftWithMaxRange(List<Aircraft> aircraftList) {
        Aircraft maxRangeAircraft = null;
        int maxRange = 0;
        Iterator var3 = aircraftList.iterator();

        while(var3.hasNext()) {
            Aircraft aircraft = (Aircraft)var3.next();
            if (aircraft.getRange() > maxRange) {
                maxRange = aircraft.getRange();
                maxRangeAircraft = aircraft;
            }
        }

        return maxRangeAircraft;
    }

    public static Aircraft findAircraftByModel(List<Aircraft> aircraftList, String model) {
        Iterator var2 = aircraftList.iterator();

        Aircraft aircraft;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            aircraft = (Aircraft)var2.next();
        } while(!aircraft.getModel().equalsIgnoreCase(model));

        return aircraft;
    }
}
