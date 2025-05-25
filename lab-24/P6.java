// 6. Declare a class called book having author_name as private data member. Extend book class to have two sub classes called book_publication & paper_publication. Each of these classes have private member called title. Write a program to show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author. Use command line arguments for inputting data. (C)

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Method to be overridden
    public void display() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Paper Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

public class P6 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java P6 <author_name> <type: book/paper> <title>");
            return;
        }

        String author = args[0];
        String type = args[1].toLowerCase();
        String title = args[2];

        Book ref;

        if (type.equals("book")) {
            ref = new BookPublication(author, title);
        } else if (type.equals("paper")) {
            ref = new PaperPublication(author, title);
        } else {
            System.out.println("Invalid publication type. Use 'book' or 'paper'.");
            return;
        }

        ref.display();
    }
}
