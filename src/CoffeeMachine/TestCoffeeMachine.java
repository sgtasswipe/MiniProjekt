package CoffeeMachine;


import java.util.ArrayList;
import java.util.Scanner;

public class TestCoffeeMachine {
    ArrayList<CoffeeMachine> coffeeMachines = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    private cupSize cupSize = new cupSize();
    Cup Cup = new Cup("Cup", cupSize.getSize());

    public static void main(String[] args) {
        new TestCoffeeMachine().run();
    }

    private void run() {
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
            case 1:
                System.out.println("You have chosen Latte " + cupSize.getSize());
                break;
            case 2:
                System.out.println("You have chosen Black Coffee");
                break;
            case 3:
                System.out.println("You have chosen Espresso");
                break;
            case 4:
                System.out.println("You have chosen Chocolate Drink");
                break;
            case 5:
                System.out.println("You have chosen Cocoa");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

   /* public void chooseCoffee() {
        coffeeMachines.add(new CoffeeMachine("Latte", "Small"));
        coffeeMachines.add(new CoffeeMachine("Latte", "Medium"));
        coffeeMachines.add(new CoffeeMachine("Latte", "Large"));
        coffeeMachines.add(new CoffeeMachine("Espresso", "Single"));
        coffeeMachines.add(new CoffeeMachine("Espresso", "Double"));
        coffeeMachines.add(new CoffeeMachine("Espresso", "Triple"));
        coffeeMachines.add(new CoffeeMachine("Sort Kaffe", "Small"));
        coffeeMachines.add(new CoffeeMachine("Sort Kaffe", "Medium"));
        coffeeMachines.add(new CoffeeMachine("Sort Kaffe", "Large"));
        coffeeMachines.add(new CoffeeMachine("Kakao", "Small"));
        coffeeMachines.add(new CoffeeMachine("Kakao", "Medium"));
        coffeeMachines.add(new CoffeeMachine("Kakao", "Large"));
        coffeeMachines.add(new CoffeeMachine("Chokolade Drik", "Small"));
        coffeeMachines.add(new CoffeeMachine("Chokolade Drik", "Medium"));
        coffeeMachines.add(new CoffeeMachine("Chokolade Drik", "Large"));

        for (CoffeeMachine coffeeMachine : coffeeMachines) {
            coffeeMachine.serve(Cup.getName(), cupSize.getSize());
        }
    }*/

}
