package Fishtank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    private WaterCondition waterCondition;
    private ArrayList<LocalDateTime> datesForWaterChange;
    private ArrayList<WaterCondition> waterConditions;

    // Constructor to initialize ArrayLists
    public Menu() {
        datesForWaterChange = new ArrayList<>();
        waterConditions = new ArrayList<>();
    }

    public static void main(String[] args) {
        new Menu().run();
    }

    private void run() {
        System.out.println("Please select from the menu:");
        System.out.println("(f) note food given");
        System.out.println("(w) Water changed. note date and water condition");
        System.out.println("(n) Get names of fish currently in tank");
        char choice = in.nextLine().charAt(0);

        if (choice == 'f') {
            feeding();
        }
        if (choice == 'w') {
            changeingWater();
        }
        if (choice == 'n') {
            getFishNames();
        }
    }

    public void feeding() {
        System.out.println("Enter time since last feeding (in days):");
        long daysSinceFood = in.nextLong();
        System.out.println("Date of last feeding: " + LocalDateTime.now().minusDays(daysSinceFood));
        if (daysSinceFood == 3)
            System.out.println("Your fish have a fasting day today. Come back tomorrow!");
        else {
            System.out.println("Give your fish some food!");
        }
    }

    public void changeingWater() {
        LocalDateTime dateForWaterChange = LocalDateTime.now();

        System.out.println("Please select water state from the list:");

        // Loop through all values of the WaterCondition enum and display them
        WaterCondition[] conditionOptions = WaterCondition.values();
        for (int i = 0; i < conditionOptions.length; i++) {
            System.out.println("(" + (i + 1) + ") " + conditionOptions[i]);
        }

        // Read the user's choice
        int choice = in.nextInt();

        if (choice >= 1 && choice <= conditionOptions.length) {
            waterCondition = conditionOptions[choice - 1]; // Set the selected water condition
            datesForWaterChange.add(dateForWaterChange);
            waterConditions.add(waterCondition);
            System.out.println("Water condition selected: " + waterCondition);
        } else {
            System.out.println("Invalid choice");
        }
    }



    public void getFishNames() {
        FishTank fishTank = new FishTank("Wogglie", "Swimmie");
        System.out.println(fishTank.getFish1());
        System.out.println(fishTank.getFish2());
    }
}
