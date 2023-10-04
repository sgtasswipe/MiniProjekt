package transport;

public class Vehicle {
    private boolean engineIsStarted = false;
    public void startEngine() {
        engineIsStarted = true;
        UI ui = new UI();
        ui.startEngineMessage();
    }
    public boolean getEngineIsStarted() {
        return engineIsStarted;
    }

}
