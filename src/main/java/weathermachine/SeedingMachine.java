package weathermachine;

import java.util.Map;
import java.util.Observable;

public class SeedingMachine implements Observer {
    private static final int TEMP = 5;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int... args) {
        if (args[0] > 5){
            status = true;
        }
    }
}
