package authorsandbooks;

public class Books extends Authors {
    private String title;
    private int numberOfPages;



    Books (String title, String name, int numberOfPages, char gender) {
        super(title, name, numberOfPages, gender);
        this.title = title;
        this.numberOfPages = numberOfPages;

    }

    public Books (String email, String title, char gender) {
        super(email, title, gender);

    }

    public String getTitle () {
        return title;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
}
