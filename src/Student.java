class Student extends User {

    public Student(int id, String name) {
        super(id, name);
    }

    public int getBorrowLimit() {
        return 3;
    }
}
