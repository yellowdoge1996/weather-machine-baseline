package weathermachine;

import java.util.Observable;

public class ReapingMachine implements Observer {
    private static final int TEMP = 5;
    private static final int HUMIDITY = 65;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int... args) {
        if (args[0] > TEMP && args[1] > HUMIDITY){
            status = true;
        }
    }
}
