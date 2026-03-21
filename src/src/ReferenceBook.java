class ReferenceBook extends Book {

    public ReferenceBook(int id, String title, String author) {
        super(id, title, author);
    }

    public boolean canBeIssued() {
        return false;
    }
}
