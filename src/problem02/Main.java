package problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int dividend = myScanner.nextInt();
        System.out.print("Enter Second Number: ");
        int divider = myScanner.nextInt();

        System.out.println("Result is: " + Solver.divider(dividend, divider));
    }
}
