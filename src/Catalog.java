import java.util.ArrayList;

public class Catalog {
    private int catalogId;
    private ArrayList<Book> books;

    public Catalog(int catalogId) {
        this.catalogId = catalogId;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
