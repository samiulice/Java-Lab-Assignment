package problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int dividend = inputScanner.nextInt();
        System.out.print("Enter Second Number: ");
        int divider = inputScanner.nextInt();
        inputScanner.close();
        if(divider == 0){
            System.out.println("Dividing by zero is not allowed");
        }
        else{
            System.out.printf("%d divided by %d is: %d\n", dividend, divider, Solver.divider(dividend, divider));
        }


    }
}
