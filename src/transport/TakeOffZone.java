package transport;

import java.util.ArrayList;

public class TakeOffZone {
    ArrayList<Vehicle> list;
    public static void main(String[] args) {
        new TakeOffZone().run();
    }

    private void run() {
        Plane plane = new Plane();
        Car car = new Car();
        Boat boat = new Boat();
        // creates instance of UI class to be used on the objects.
        UI ui = new UI();
        list = new ArrayList<Vehicle>();
        list.add(plane);
        list.add(boat);
        list.add(car);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).startEngine();
            if( list.get(i) instanceof  Plane)
                plane.fly(ui);
            if ( list.get(i) instanceof Boat)
                boat.sail(ui);
            if (list.get(i) instanceof  Car)
                car.drive(ui);

        }



    }
}