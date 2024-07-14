import java.util.ArrayList;
import java.util.Scanner;

class Comic {
    private String title;
    private String author;
    private String isbn;

    public Comic(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

public class ComicManager {
    private ArrayList<Comic> comicList;
    private Scanner scanner;

    public ComicManager() {
        comicList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addComic() {
        System.out.print("Enter comic title: ");
        String title = scanner.nextLine();
        System.out.print("Enter comic author: ");
        String author = scanner.nextLine();
        System.out.print("Enter comic ISBN: ");
        String isbn = scanner.nextLine();
        
        Comic newComic = new Comic(title, author, isbn);
        comicList.add(newComic);
        System.out.println("Comic added successfully!");
    }

    public void displayComics() {
        if (comicList.isEmpty()) {
            System.out.println("No comics available.");
            return;
        }
        
        System.out.println("Comics in the collection:");
        for (Comic comic : comicList) {
            System.out.println(comic);
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n1. Add Comic");
            System.out.println("2. Display Comics");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addComic();
                    break;
                case 2:
                    displayComics();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        ComicManager manager = new ComicManager();
        manager.run();
    }
}
