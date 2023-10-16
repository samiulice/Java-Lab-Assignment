package Exam;

import java.util.*;
public class ArithmeticOperation{
    public static void main(String[] args) {
        String  n1, n2, op;
        Scanner input= new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter the first number:");
                n1=input.nextLine();
                System.out.println("Enter the second number:");
                n2=input.nextLine();
                System.out.println("Enter the operator:");
                op =input.nextLine();
                int a = Integer.valueOf(n1), b = Integer.valueOf(n2);
                ArithmeticOperation.performOperation(a,b,op);
            }catch (NumberFormatException e){
                System.out.println("Invalid Number format");
            }
        }

    }

    public static void performOperation(int n1, int n2, String op){
            try{
                if(op.equals("+")){
                    System.out.println("The addition is =" + (n1+n2));
                } else if (op.equals("-")) {
                    System.out.println("The Subtraction is =" + (n1-n2));
                } else if (op.equals("*")) {
                    System.out.println("The multiplication is =" + (n1*n2));
                } else if (op.equals("/")) {
                    System.out.println("The Division is =" + (n1/n2));
                } else {
                    throw new IllegalArgumentException();
                }
            }catch(ArithmeticException e){
                System.out.println("Error: Divider by zero");
            } catch(IllegalArgumentException e){
                System.out.println("Invalid operator");
            }
    }
}