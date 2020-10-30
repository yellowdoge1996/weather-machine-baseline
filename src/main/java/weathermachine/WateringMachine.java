package weathermachine;

import java.util.Observable;

public class WateringMachine implements Observer {
    private static final int TEMP = 10;
    private static final int HUMIDITY = 55;
    private static final int WIND_POWER = 4;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int... args) {
        if (args[0] > TEMP && args[1] < HUMIDITY && args[2] < WIND_POWER){
            status = true;
        }
    }
}

