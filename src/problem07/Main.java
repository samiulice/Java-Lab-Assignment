package problem07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
        System.out.println("Frequently used word: " + Solver.MaxUsedWord(str));
        System.out.println("Word that has maximum length: " + Solver.wordWithMaxLenght(str));
    }
}
