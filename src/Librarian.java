public class Librarian extends User {
    private String employmentId;

    public Librarian(int userId, String name, String employmentId) {
        super(userId, name);
        this.employmentId = employmentId;
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public void addBook(Book book, Catalog catalog) {
        catalog.addBook(book);
        System.out.println("Book added by Librarian: " + getName());
    }
}
