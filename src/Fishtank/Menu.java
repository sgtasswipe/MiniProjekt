package Fishtank;

import Fishtank.LogEntry;
import Fishtank.WaterCondition;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    private WaterCondition waterCondition;
    private ArrayList<LocalDateTime> datesForWaterChange;
    private ArrayList<WaterCondition> waterConditions;
    private ArrayList<LogEntry> logEntries;
    private boolean runProgram = true;
    private String comment;

    // Constructor to initialize ArrayLists
    public Menu() {
        datesForWaterChange = new ArrayList<>();
        waterConditions = new ArrayList<>();
        logEntries = new ArrayList<>();

    }

    public static void main(String[] args) {
        new Menu().run();
    }

    private void run() {
        do {
            System.out.println("Please select from the menu:");
            System.out.println("(f) note food given");
            System.out.println("(c) note fish condition");
            System.out.println("(w) Water changed. note date and water condition");
            System.out.println("(n) Get names of fish currently in tank");
            System.out.println("(l) To list log water changes, and food.");
            System.out.println("(x) Exit program");
            char choice = in.nextLine().charAt(0);

            if (choice == 'f') {
                feeding();
            }
            if (choice == 'w') {
                changingWater();
            }
            if (choice == 'n') {
                getFishNames();
            }
            if (choice == 'l') {
                listLogEntries();
            }
            if (choice == 'x') {
                exitProgram();
            }
            if (choice == 'c')
                fishCondition();
        } while (runProgram);
    }

    public void feeding() {
        FishTank fishTank = new FishTank("Wogglie", "Swimmie");
        System.out.println("Enter time since last fasting (in days):");
        long daysSinceFast = in.nextLong();
        in.nextLine(); // Scanner bug
        LocalDateTime lastFeedingDate = LocalDateTime.now().minus(Duration.ofDays(daysSinceFast));
        System.out.println("Date of last fasting: " + lastFeedingDate);

        if (daysSinceFast <= 3) {
            System.out.println("Please feed " + fishTank.getFish1() + " and " + fishTank.getFish2() + " or else they might die");
        } else if (daysSinceFast > 4) {
            System.out.println("Your fish have been overfed. Consider fasting more.");
        } else {
            System.out.println("Your fish is having a fasting day, today. Come back tomorrow!");
        }

        // Create a log entry for feeding
        logEntries.add(new LogEntry(lastFeedingDate, "Feeding", comment));

    }

    public void changingWater() {
        LocalDateTime dateForWaterChange = LocalDateTime.now();

        System.out.println("Please select water state from the list:");


        WaterCondition[] conditionOptions = WaterCondition.values();
        for (int i = 0; i < conditionOptions.length; i++) {
            System.out.println("(" + (i + 1) + ") " + conditionOptions[i]);
        }


        int choice = in.nextInt();
        in.nextLine(); // scanner bug

        if (choice >= 1 && choice <= conditionOptions.length) {
            waterCondition = conditionOptions[choice - 1]; // Set the selected water condition
            datesForWaterChange.add(dateForWaterChange);
            waterConditions.add(waterCondition);
            System.out.println("Water condition selected: " + waterCondition);

            // Create a log entry for water change

            System.out.println("Add a comment:");
            comment = in.nextLine();
            if (comment.length() <= 60) {
                logEntries.add(new LogEntry(dateForWaterChange, "Water Change: " + waterCondition, comment));
            } else
                System.out.println("Invalid comment: Too long (max 60 chars)");

        } else {
            System.out.println("Invalid choice");
        }
    }

    public void getFishNames() {
        FishTank fishTank = new FishTank("Wogglie", "Swimmie");
        System.out.println(fishTank.getFish1());
        System.out.println(fishTank.getFish2());
    }

    public void fishCondition() {
        FishTank fishTank = new FishTank("Wogglie", "Swimmie");
        System.out.println("Please add comment about the condition of the fishes");
        System.out.println("Enter comment about " + fishTank.getFish1() + " :");
        comment = in.nextLine();
        if (comment.length() > 30)
            System.out.println("Invalid comment: Too long (max 30 chars)");
        else
            logEntries.add(new LogEntry(LocalDate.now().atStartOfDay(), "Fish Condition: " + fishTank.getFish1(), comment));
        System.out.println("Enter comment about " + fishTank.getFish2() + " :");
        comment = in.nextLine();
        if (comment.length() > 30)
            System.out.println("Invalid comment: Too long (max 30 chars)");
        else
            logEntries.add(new LogEntry(LocalDate.now().atStartOfDay(), "Fish Condition: " + fishTank.getFish2(), comment));
    }

    public void listLogEntries() {
        System.out.println("Log Entries:");
        for (LogEntry entry : logEntries) {
            System.out.println("Date: " + entry.getFeedingDate() + ", Activity: " + entry.getWaterQuality() + " Comment: " + entry.getComment());
        }
    }

    public void exitProgram() {
        runProgram = false;

    }
}
