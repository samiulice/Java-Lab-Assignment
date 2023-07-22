package problem03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = myScanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = myScanner.nextInt();
        System.out.println(Solver.multiplier(a, b));
    }
}
