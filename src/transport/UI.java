package transport;

public class UI {
    public void startEngineMessage() {
        System.out.println("Engine is on");
    }

    public void movementMessage(Vehicle vehicle) {
        if (vehicle instanceof Plane) {
            System.out.println("Plane is now flying");
        } else if (vehicle instanceof Car) {
            System.out.println("Car is now driving");
        } else if (vehicle instanceof Boat) {
            System.out.println("Boat is now sailing");
        }
    }
    public void errorMessage() {
        System.out.println("It might help to turn on the engine...");
    }
}