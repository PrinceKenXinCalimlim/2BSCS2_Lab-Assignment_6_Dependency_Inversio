public class ProcessJournal {

    private Student student;
    private Journal journal;

    public ProcessJournal(Student student, Journal journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}
