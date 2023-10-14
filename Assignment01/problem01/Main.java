package problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        number = inputScanner.nextInt();
        inputScanner.close();
        StringBuilder BinaryNumber = Solver.DecToBin(number);//int to binary conversion
        System.out.println("Binary Representation: " + BinaryNumber);
        System.out.println("Number of Zeros: " + Solver.counter(BinaryNumber)); //counting number of zeros
        System.out.println("Number of ones: " + (BinaryNumber.length()-Solver.counter(BinaryNumber))); //counting number of ones
    }
}
