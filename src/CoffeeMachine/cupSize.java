package CoffeeMachine;
import java.util.Scanner;

public class cupSize {
    static Scanner in = new Scanner(System.in);
    private static int choice = in.nextInt();
    public static void main(String[] args) {
        System.out.println("Choose your prefered cup size: ");
        System.out.println("(1) Small");
        System.out.println("(2) Medium");
        System.out.println("(3) Large");


        switch (choice) {
            case 1 -> System.out.println("You have chosen Small");
            case 2 -> System.out.println("You have chosen Medium");
            case 3 -> System.out.println("You have chosen Large");
        }


    }


    public String getSize() {
        return getSize();
    }
}
