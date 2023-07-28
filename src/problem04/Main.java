package problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = inputScanner.nextLine();
        System.out.println(Solver.reverseWord(str));
    }
}
