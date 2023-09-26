package Problem03;

import java.util.Scanner;

public class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }

    public static void main(String[] args) throws NegativeNumberException {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series: ");
        n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0; i < n; i++){
            int x = sc.nextInt();
            try{
                if(x < 0){
                    throw new NegativeNumberException("Negative number exception");
                }
            }catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
