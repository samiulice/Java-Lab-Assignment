package problem03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = inputScanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = inputScanner.nextInt();
        inputScanner.close();
        
        System.out.printf("%d  Multiplied by %d is: %d\n", a, b, Solver.multiplier(a, b));
    }
}
