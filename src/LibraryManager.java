import java.util.*;

class LibraryManager {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<IssueRecord> records = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    // Add User
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully");
    }

    // View Books
    public void viewBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    // Issue Book
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
}
