import java.io.*;
import java.util.*;

class FileHandler {

    public static void saveBooks(ArrayList<Book> books) {

        try {
            FileWriter fw = new FileWriter("books.txt");

            for (Book b : books) {
                fw.write(b.id + "," + b.title + "," + b.author + "\n");
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving books");
        }
    }
}
