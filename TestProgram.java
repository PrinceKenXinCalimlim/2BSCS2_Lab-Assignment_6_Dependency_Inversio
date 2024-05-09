public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("246", "Bateman", "Patrick", "American Psycho");
        ProcessBook process1 = new ProcessBook(student1, new Book());
        process1.processBook();
    
        Student student2 = new Student("456", "Corleone", "Michael", "The Godfather");
        ProcessBook process2 = new ProcessBook(student2, new Book());
        process2.processBook();
    
        Student student3 = new Student("236", "Dunne", "Amy", "The Civil War Diary");
        ProcessJournal process3 = new ProcessJournal(student3, new Journal());
        process3.processJournal();
    
        Student student4 = new Student("556", "Thurman", "Uma", "The Journals of Sylvia Plath");
        ProcessJournal process4 = new ProcessJournal(student4, new Journal());
        process4.processJournal();

    }
}