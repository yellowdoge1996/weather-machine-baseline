package weathermachine;

public class WateringMachine implements Observer {
    private static final int TEMP = 10;
    private static final int HUMIDITY = 55;
    private static final int WIND_POWER = 4;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int temp, int humidity, int windPower) {
        if (temp > TEMP && humidity < HUMIDITY && windPower < WIND_POWER){
            status = true;
        }
    }
}

