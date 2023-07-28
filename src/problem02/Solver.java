package problem02;

public class Solver {
    protected static int divider(int a, int b){
        int res = 0;
        boolean negativeResult = a * b < 0;
         a = Math.abs(a);
         b = Math.abs(b);
        while(a >= 0){
            a = a - b;
            res++;
        }
        if(negativeResult){
            return (-1)*res + 1;
        }
        return res-1;
    }
}
