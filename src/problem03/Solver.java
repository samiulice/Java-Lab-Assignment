package problem03;

public class Solver {
    protected static int multiplier(int a, int b){
        int res = 0;
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(a > 0){
            res = res+b;
            a--;
        }
        return res;
    }
}
