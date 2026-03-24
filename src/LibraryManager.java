import java.util.*;

class LibraryManager {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<IssueRecord> records = new ArrayList<>();

    // ---------------- ADD BOOK ----------------
    public void addBook(Book book) {
        books.add(book);
        FileHandler.saveBooks(books);   // file saving
        System.out.println("Book added successfully");
    }

    // ---------------- ADD USER ----------------
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully");
    }

    // ---------------- VIEW BOOKS ---------------
    public void viewBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    // ---------------- ISSUE BOOK ----------------
    public void issueBook(int bookId, int userId) {

        for (Book b : books) {

            if (b.id == bookId && b.canBeIssued()) {

                records.add(new IssueRecord(bookId, userId));

                System.out.println("Book issued successfully");
                return;
            }
        }

        System.out.println("Book cannot be issued");
    }

    // ---------------- SEARCH BOOK ----------------
    public void searchBook(String title) {

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                b.display();
                return;
            }
        }

        System.out.println("Book not found");
    }

    // ---------------- VIEW ISSUED BOOKS ----------------
    public void viewIssuedBooks() {

        for (IssueRecord r : records) {
            System.out.println("Book ID: " + r.bookId + 
                               " issued to User ID: " + r.userId);
        }
    }
}
