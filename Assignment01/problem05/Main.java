package problem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First line: ");
        String str1 = input.nextLine();
        System.out.println("Enter Second line: ");
        String str2 = input.nextLine();
        input.close();
        System.out.println("First line contains Second line?" + Solver.isContains(str1, str2));

    }


}
