package transport;

public class Plane extends  Vehicle {
    UI ui = new UI();
    public void fly(UI ui) {
        if (getEngineIsStarted()) {
            ui.movementMessage(this);

        } else
            ui.errorMessage();
    }
}
