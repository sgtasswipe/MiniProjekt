package authorsandbooks;

import java.util.ArrayList;

import java.util.Scanner;

public class Publishing {
    ArrayList<Authors> listOfAuthors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Publishing().run();
    }

    public void run() {
        boolean running = true;
        while (running) {
            mainMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addBook();
                case 2 -> ListOfAuthors();
                case 3 -> running = false;

            }
        }

    }

    private void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of author: ");
        String name = scanner.nextLine();
        System.out.println("Enter email of author: ");
        String email = scanner.nextLine();
        System.out.println("Enter title of book: ");
        String title = scanner.nextLine();
        System.out.println("Enter number of pages in book: ");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine(); // Scanner bug fix
        System.out.println("Enter the gender of the author, as (m/f): ");
        char gender = new Scanner(System.in).nextLine().charAt(0);
        Authors Authors = new Authors(name, email, title, numberOfPages, gender);
        listOfAuthors.add(Authors);
        System.out.println("Successful");
        System.out.println("Authors name: " + name +
                "\nTitle: " + title +
                "\nNumber of pages: " + numberOfPages +
                "\nAuthors email: " + email +
                "\nAuthors gender: " + gender +
                "\n------------------------------");
        System.out.println("\nBack To Main Menu. TYPE '1'\nAdd another book. TYPE '2'");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            mainMenu();
        } else if (i == 2) {
            addBook();
        }


    }

    private void mainMenu() {
        System.out.println("Welcome to the publishing house");
        System.out.println("1. Add book");
        System.out.println("2. List of Books");
        System.out.println("3. Exit");
        for (int i = 0; i < 1; i++) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addBook();
                case 2 -> ListOfAuthors();
                case 3 -> System.exit(0);
            }
        }

    }

    public void ListOfAuthors() {
        listOfAuthors.add(new Authors("Ole K.", "Olek@email.dk", "Den Lille Havfrue", 225, 'm'));
        listOfAuthors.add(new Authors("Jenette C.", "JenetteCripsy@gmail.com", "Lille peter edderkop", 25, 'f'));

        for (Authors listOfAuthor : listOfAuthors) {
            System.out.printf("Authors name: %s%n", listOfAuthor.getName());
            System.out.printf("Title of book: %s%n", listOfAuthor.getTitle());
            System.out.printf("Number of pages in book: %d%n", listOfAuthor.getNumberOfPages());
            System.out.printf("Gender: %s%n", listOfAuthor.getGender());
            System.out.printf("Email: %s%n%n", listOfAuthor.getEmail());
        }

        // Efter at have vist alle forfattere, gå tilbage til hovedmenuen eller tilføj en ny bog
        System.out.println("\nBack To Main Menu. TYPE '1'\nAdd a book. TYPE '2'");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Læs newline karakteren efter næste int

        if (choice == 1) {
            mainMenu();
        } else if (choice == 2) {
            addBook();
        }
    }
}
