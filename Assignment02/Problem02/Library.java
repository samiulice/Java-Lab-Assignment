package Problem02;

import java.util.ArrayList;

public class Library {
    ArrayList<String> availableBooks = new ArrayList<>();
    ArrayList<String> issueBooks = new ArrayList<>();

    public Library() {}

    public void addBook(String bookTitle){

        this.availableBooks.add(bookTitle);
        System.out.println(bookTitle+" added to the library");
    }
    public void issueBooks(String bookTitle){
        int i, n = this.availableBooks.size();
        for (i = 0; i < n; i++){
            if(bookTitle.equals(this.availableBooks.get(i))){
                this.availableBooks.remove(i);
                this.issueBooks.add(bookTitle);
                System.out.println(bookTitle + " is issued...");
                return;
            }
        }

        System.out.println(bookTitle+" Not available");
    }
    public void returnBooks(String bookTitle){
        int i, n = this.issueBooks.size();
        for (i = 0; i < n; i++){
            if(bookTitle.equals(this.issueBooks.get(i))){
                this.issueBooks.remove(i);
                this.availableBooks.add(bookTitle);
                System.out.println(bookTitle + " is added to the library...");
                break;
            }
        }
    }
    public void displayAvailableBooks(){
        if(this.availableBooks.isEmpty()){
            System.out.println("No books available in the library");
            return;
        }
        System.out.println("Available Books:");
        for(String i: this.availableBooks){
            System.out.println(i);
        }
    }
    public void displayIssueBooks(){
        if(this.issueBooks.isEmpty()){
            System.out.println("No books available in the issue list");
            return;
        }
        System.out.println("Issue Books: ");
        for(String i: this.issueBooks){
            System.out.println(i);
        }
    }
}
