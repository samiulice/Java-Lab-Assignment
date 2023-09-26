package problme01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        try{
            int a = input.nextInt(), b = input.nextInt();
            double x = a, y = b;
            input.close();

            System.out.println("Addition");
            try {
                if (Math.abs(x + y) > 2147483647) {
                    throw new CustomExceptionClass("Integer Value Out of Range");
                }
                System.out.println((a + b));
            }catch (CustomExceptionClass e) {
                System.out.println(e);
            }
            System.out.println("Subtraction");
            try {
                if (Math.abs(x - y) > 2147483647) {
                    throw new CustomExceptionClass("Integer Value Out of Range");
                }
                System.out.println((a - b));
            }catch (CustomExceptionClass e) {
                System.out.println(e);
            }
            System.out.println("Multiplication");
            try {
                if (Math.abs(x * y) > 2147483647) {
                    throw new CustomExceptionClass("Integer Value Out of Range");
                }
                System.out.println((a * b));
            }catch (CustomExceptionClass e) {
                System.out.println(e);
            }
            System.out.println("Division");
            try {
                System.out.println((a/b));
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
