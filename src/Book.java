public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int year;
    private String status;

    public Book(String ISBN, String title, String author, int year, String status) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
