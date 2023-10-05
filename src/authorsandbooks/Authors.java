package authorsandbooks;

public class Authors {
    private String name;
    private String email;
    private String nameOfBook;
    private int numberOfPages;
    private char gender;


    public Authors(String name, String email, String nameOfBook, int numberOfPages, char gender) {
        this.name = name;
        this.email = email;
        this.nameOfBook = nameOfBook;
        this.numberOfPages = numberOfPages;
        this.gender = gender;
    }
    public Authors(String title, String name, int numberOfPages, char gender) {
    }

    public Authors(String email, String title, char gender) {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public char getGender() {
        return gender;
    }
    public String getTitle() {
        return nameOfBook;
    }
}
