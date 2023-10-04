package transport;

public class Car extends  Vehicle{
    UI ui = new UI();

    public void drive(UI ui) {
        if (getEngineIsStarted()) {
            ui.movementMessage(this);

        } else
            ui.errorMessage();
    }
}
