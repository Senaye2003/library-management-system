import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Catalog catalog = new Catalog(1);
    private static Librarian librarian = new Librarian(1, "Brok", "111");
    private static Student student = new Student(2, "Bruv", "22");

    public static void main(String[] args) {
        // Add some books to the catalog to start with
        catalog.addBook(new Book("123-456-789", "Java Basics", "Senaye Weldeberhan", 2020, "available"));
        catalog.addBook(new Book("987-654-321", "Advanced Java", "Travis Scott", 2021, "available"));

        boolean quit = false;
        while (!quit) {
            System.out.println("\nWelcome to the Library Management System. Choose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Available Books");
            System.out.println("5. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    simulateAddBook();
                    break;
                case 2:
                    simulateBorrowBook();
                    break;
                case 3:
                    simulateReturnBook();
                    break;
                case 4:
                    displayAvailableBooks();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid one.");
            }
        }
    }

    private static void simulateAddBook() {
        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter publication year:");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter status:");
        String status = scanner.nextLine();
        Book newBook = new Book(ISBN, title, author, year, status);
        librarian.addBook(newBook, catalog);
        System.out.println("Book added successfully!");
    }

    private static void simulateBorrowBook() {
        System.out.println("Enter the ISBN of the book you want to borrow:");
        String ISBN = scanner.nextLine();
        for (Book book : catalog.getBooks()) {
            if (book.getISBN().equals(ISBN) && book.getStatus().equals("available")) {
                book.setStatus("borrowed");
                System.out.println("You have successfully borrowed the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available for borrowing.");
    }

    private static void simulateReturnBook() {
        System.out.println("Enter the ISBN of the book you want to return:");
        String ISBN = scanner.nextLine();
        for (Book book : catalog.getBooks()) {
            if (book.getISBN().equals(ISBN)) {
                book.setStatus("available");
                System.out.println("You have successfully returned the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("This book does not belong to our catalog.");
    }

    private static void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : catalog.getBooks()) {
            if (book.getStatus().equals("available")) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
            }
        }
    }
}


