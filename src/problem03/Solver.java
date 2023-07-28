package problem03;

public class Solver {
    protected static int multiplier(int a, int b){
        int res = 0;
        boolean positiveResult = (a >= 0 && b >= 0) || (a < 0 && b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(a > 0){
            res = res+b;
            a--;
        }
        if (positiveResult){
            return res;
        }
        return res*(-1);
    }
}
