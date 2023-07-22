package problem02;

public class Solver {
    protected static int divider(int a, int b){
        int res = 0;
        while(a >= 0){
            a = a - b;
            res++;
        }
        return res-1;
    }
}
