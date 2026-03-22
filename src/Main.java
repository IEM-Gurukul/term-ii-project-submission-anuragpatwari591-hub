public class Main {

    public static void main(String[] args) {

        LibraryManager lib = new LibraryManager();

        // Add sample book
        Book b1 = new FictionBook(1, "Harry Potter", "Rowling");
        lib.addBook(b1);

        // Add sample user
        User u1 = new Student(101, "Anurag");
        lib.addUser(u1);

        // View books
        lib.viewBooks();

        // Issue book
        lib.issueBook(1, 101);
    }
}
