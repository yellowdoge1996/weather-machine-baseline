package weathermachine;

public class SeedingMachine implements Observer {
    private static final int TEMP = 5;
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void update(int temp, int humidity, int windPower) {
        if (temp > TEMP){
            status = true;
        }
    }
}
