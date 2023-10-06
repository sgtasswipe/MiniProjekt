package CoffeeMachine;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

class TestCoffeeMachine2 {
    ArrayList<String> coffeeMachines = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    Cup cupS = new Cup("Small");
    Cup cupM = new Cup("Medium");
    Cup cupL = new Cup("Large");
    Cup cup = new Cup("Not set");
    Cup espressoS = new Cup("Single");
    Cup espressoD = new Cup("Double");
    Cup espressoT = new Cup("Triple");


    public static void main(String[] args) {
        new TestCoffeeMachine2().run();
    }


    private void run() {
        System.out.println("Welcome to COFFEE MOCCA MASTER HOUSE");
        //chooseCoffee();
        serveCoffee();
    }

    public void serveCoffee() {
        System.out.println("Choose your drink:");
        System.out.println("(1) Latte");
        System.out.println("(2) Black coffee");
        System.out.println("(3) Espresso");
        System.out.println("(4) Chocolate drink");
        System.out.println("(5) Cocoa");

        int choice = in.nextInt();        // Indlæs brugerens valg

        switch (choice) {
            case 1 -> {
                System.out.println("You have chosen Latte ");
                coffeeMachines.add("Latte");
                serveCoffeSize();
            }

            case 2 -> {
                System.out.println("You have chosen Black Coffee");
                coffeeMachines.add("Black Coffee");
                serveCoffeSize();
            }

            case 3 -> {
                System.out.println("You have chosen Espresso");
                coffeeMachines.add("Espresso");
                serveCoffeeSTR();
            }
            case 4 -> {
                System.out.println("You have chosen Chocolate Drink");
                coffeeMachines.add("Chocolate Drink");
                serveCoffeSize();
                askForCream();
            }
            case 5 -> {
                System.out.println("You have chosen Cocoa");
                coffeeMachines.add("Cocoa");
                serveCoffeSize();
                askForCream();
            }
            default -> System.out.println("Invalid choice");

        }
    }

    private void askForCream() {
        System.out.println("Do you want cream?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("You have chosen Yes");
                coffeeMachines.add("Cream");
            }
            case 2 -> {
                System.out.println("You have chosen No");
            }
        }System.out.println(coffeeMachines);
    }

    public void serveCoffeSize() {

        System.out.println("Chose your cup size:");
        System.out.println("(1) Small ");
        System.out.println("(2) Medium");
        System.out.println("(3) Large");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                cupS.setSize("Small");
                coffeeMachines.add("Small");
            }
            case 2 -> {
                cupM.setSize("Medium");
                coffeeMachines.add("Medium");
            }
            case 3 -> {
                cupL.setSize("Large");
                coffeeMachines.add("Large");
            }
        } System.out.println(coffeeMachines);


    }

    public void serveCoffeeSTR() {

        System.out.println("How many Espresso shots: ");
        System.out.println("(1) Single");
        System.out.println("(2) Double");
        System.out.println("(3) Triple");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                espressoS.setSize("Single");
                coffeeMachines.add("Single");
            }
            case 2 -> {
                espressoD.setSize("Double");
                coffeeMachines.add("Double");
            }
            case 3 -> {
                espressoT.setSize("Triple");
                coffeeMachines.add("Triple");
            }
        }
        System.out.println(coffeeMachines);
    }
} // class TestCoffeeMachine