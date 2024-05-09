public class ProcessBook {

    private Student student;
    private Book book;

    public ProcessBook(Student student, Book book) {
        this.student = student;
        this.book = book;
    }

    public void processBook() {
        book.borrow(student.getTitle());
    }
}