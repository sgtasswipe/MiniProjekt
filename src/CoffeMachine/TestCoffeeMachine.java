package CoffeMachine;

public class TestCoffeeMachine {
    public static void main(String[] args) {
        new TestCoffeeMachine().run();
    }

    private void run() {
        serveCoffee();
        chooseCoffee();

    }

    private void serveCoffee() {
        switch () {
            case 1 -> System.out.println("You have chosen small Latte");

    }

    private void chooseCoffee() {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Latte", "Small");
        coffeeMachine.serve(coffeeMachine);
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Latte", "Medium");
        coffeeMachine1.serve(coffeeMachine1);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("Latte", "Large");
        coffeeMachine2.serve(coffeeMachine2);
        CoffeeMachine coffeeMachine3 = new CoffeeMachine("Espresso", "Single");
        coffeeMachine3.serve(coffeeMachine3);
        CoffeeMachine coffeeMachine4 = new CoffeeMachine("Espresso", "Double");
        coffeeMachine4.serve(coffeeMachine4);
        CoffeeMachine coffeeMachine5 = new CoffeeMachine("Espresso", "Triple");
        coffeeMachine5.serve(coffeeMachine5);
        CoffeeMachine coffeeMachine6 = new CoffeeMachine("Sort Kaffe", "Small");
        coffeeMachine6.serve(coffeeMachine6);
        CoffeeMachine coffeeMachine7 = new CoffeeMachine("Sort Kaffe", "Medium");
        coffeeMachine7.serve(coffeeMachine7);
        CoffeeMachine coffeeMachine8 = new CoffeeMachine("Sort Kaffe", "Large");
        coffeeMachine8.serve(coffeeMachine8);
        CoffeeMachine coffeeMachine9 = new CoffeeMachine("Kakao", "Small");         // Husk flødeskums mulighed
        coffeeMachine9.serve(coffeeMachine9);
        CoffeeMachine coffeeMachine10 = new CoffeeMachine("Kakao", "Medium");
        coffeeMachine10.serve(coffeeMachine10);
        CoffeeMachine coffeeMachine11 = new CoffeeMachine("Kakao", "Large");
        coffeeMachine11.serve(coffeeMachine11);
        CoffeeMachine coffeeMachine12 = new CoffeeMachine("Chokolade Drik", "Small"); // Husk flødeskums mulighed
        coffeeMachine12.serve(coffeeMachine12);
        CoffeeMachine coffeeMachine13 = new CoffeeMachine("Chokolade Drik", "Medium");
        coffeeMachine13.serve(coffeeMachine13);
        CoffeeMachine coffeeMachine14 = new CoffeeMachine("Chokolade Drik", "Large");
        coffeeMachine14.serve(coffeeMachine14);

    }
}

