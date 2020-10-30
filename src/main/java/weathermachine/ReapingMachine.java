package weathermachine;

import java.util.Observable;

public class ReapingMachine implements Observer {
    private static final int TEMP = 5;
    private static final int HUMIDITY = 65;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int temp, int humidity, int windPower) {
        if (temp > TEMP && humidity > HUMIDITY){
            status = true;
        }
    }
}
