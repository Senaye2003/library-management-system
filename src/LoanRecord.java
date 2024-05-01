public class LoanRecord {
    private String loanID;
    private String dueDate;
    private Book book;

    public LoanRecord(String loanID, String dueDate, Book book) {
        this.loanID = loanID;
        this.dueDate = dueDate;
        this.book = book;
    }

    public String getLoanID() {
        return loanID;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Book getBook() {
        return book;
    }
}

