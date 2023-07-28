package problem06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        long n = input.nextLong();
        input.close();
        System.out.printf("Sum of all digits of number %d is %d\n", n, Solver.sumOfDigits(n));
    }
}
