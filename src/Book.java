abstract class Book {

    protected int id;
    protected String title;
    protected String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public abstract boolean canBeIssued();

    public void display() {
        System.out.println(id + " - " + title + " by " + author);
    }
}
