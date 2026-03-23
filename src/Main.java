import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManager lib = new LibraryManager();

        System.out.println("Library System Running...");

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1 Add Book");
            System.out.println("2 Add User");
            System.out.println("3 View Books");
            System.out.println("4 Issue Book");
            System.out.println("5 Exit");

            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Enter number.");
                sc.next();
                continue;
            }

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                if (id <= 0)
                {
                 System.out.println("Invalid ID");
                 continue;
                }

                System.out.print("Enter Title: ");
                String title = sc.next();

                System.out.print("Enter Author: ");
                String author = sc.next();

                Book b = new FictionBook(id, title, author);
                lib.addBook(b);
            }

            else if (choice == 2) {

                System.out.print("Enter User ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                User u = new Student(id, name);
                lib.addUser(u);
            }

            else if (choice == 3) {
                lib.viewBooks();
            }

            else if (choice == 4) {

                System.out.print("Enter Book ID: ");
                int bid = sc.nextInt();

                System.out.print("Enter User ID: ");
                int uid = sc.nextInt();

                lib.issueBook(bid, uid);
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
