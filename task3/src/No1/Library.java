package No1;

class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5]; // fixed size
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full!");
        }
    }


    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }


    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}