package No1;
class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public int getBookID() {
        return bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void displayBook() {
        System.out.println("ID: " + bookID +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + isAvailable);
    }
}