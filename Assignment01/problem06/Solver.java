package problem06;

public class Solver {
    protected static long sumOfDigits(long n){
        int sum = 0;
        n = Math.abs(n);
        while(n != 0){
            sum += (int)(n%10);
            n = n / 10;
        }
        return sum;
    }
}
