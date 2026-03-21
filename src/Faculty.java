class Faculty extends User {

    public Faculty(int id, String name) {
        super(id, name);
    }

    public int getBorrowLimit() {
        return 5;
    }
}
