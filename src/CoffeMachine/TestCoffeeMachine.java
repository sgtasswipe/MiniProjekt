package CoffeMachine;

public class TestCoffeeMachine {
    public static void main(String[] args) {
        new TestCoffeeMachine().run();
    }

    private void run() {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Black coffee ", "Small"   );
        coffeeMachine.serve(coffeeMachine.getName(), coffeeMachine.getSize());
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Latte " , "Large");
        coffeeMachine1.serve(coffeeMachine1.getName(), coffeeMachine1.getSize());
    }

     }

