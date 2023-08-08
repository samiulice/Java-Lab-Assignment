package Problem02;

import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner input = new Scanner(System.in);
        String x;
        while(true){
            System.out.println("Add(1)\tIssue(2)\tReturn Book(3)\tAvailableList(4)\tIssueList(5)\tExit(0)");
            x = input.nextLine();
            if(x.equals("1")){
                System.out.print("Enter book name: ");
                String book = input.nextLine();
                myLibrary.addBook(book);
            }
            else if(x.equals("2")){
                System.out.print("Enter book name: ");
                String book = input.nextLine();
                myLibrary.issueBooks(book);
            }
            else if(x.equals("3")){
                System.out.print("Enter book name: ");
                String book = input.nextLine();
                myLibrary.returnBooks(book);
            }
            else if(x.equals("4")){
                myLibrary.displayAvailableBooks();
            }
            else if(x.equals("5")){
                myLibrary.displayIssueBooks();
            }
            else if(x.equals("0")){
                return;
            }
        }
    }
}
