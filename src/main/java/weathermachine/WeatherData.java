package weathermachine;

import java.util.*;

public class WeatherData{
    List<Observer> machines = new ArrayList<Observer>();
    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        machines.add(seedingMachine);
        machines.add(reapingMachine);
        machines.add(wateringMachine);
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        for (Observer machine : machines) {
            machine.update(temp, humidity, windPower);
        }
    }
}

