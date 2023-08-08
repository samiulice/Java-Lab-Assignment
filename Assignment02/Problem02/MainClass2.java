package Problem02;

import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner input = new Scanner(System.in);
        String x;
        while(true){
            System.out.println("Add(1)\tIssue(2)\tAvailableList(3)\tIssueList(4)\tExit(0)");
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
                myLibrary.displayAvailableBooks();
            }
            else if(x.equals("4")){
                myLibrary.displayissueBooks();
            }
            else if(x.equals("0")){
                return;
            }
        }
    }
}
