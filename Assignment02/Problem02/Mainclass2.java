package Problem02;

public class Mainclass2 {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.addBook("Book 1");
        myLibrary.addBook("Book 2");
        myLibrary.addBook("Book 3");
        myLibrary.addBook("Book 4");
        myLibrary.addBook("Book 5");
        myLibrary.addBook("Book 6");
        myLibrary.addBook("Book 7");
//        myLibrary.displayAvailableBooks();
//        myLibrary.displayissueBooks();

        myLibrary.issueBooks("Book 2");
        myLibrary.issueBooks("Book 3");
        myLibrary.issueBooks("Book 4");
        myLibrary.issueBooks("Book 10");
        myLibrary.returnBooks("Book 3");
        myLibrary.displayAvailableBooks();
        myLibrary.displayissueBooks();

    }
}
