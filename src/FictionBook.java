class FictionBook extends Book {

    public FictionBook(int id, String title, String author) {
        super(id, title, author);
    }

    public boolean canBeIssued() {
        return true;
    }
}
