package problem01;

public class Solver {
    protected static StringBuilder DecToBin(int number){
        int rem;
        StringBuilder temp = new StringBuilder();
        if(number == 0){
            temp.append(0);
            return temp;
        }
        while(number != 0){
            rem = number % 2;
            temp.append(rem);
            number = number / 2;
        }
        return temp.reverse();
    }
    protected static int counter(StringBuilder temp){
        int zero = 0, n = temp.length();
        for(int i = 0; i < n; i++){
            if(temp.charAt(i) == '0'){
                zero++;
            }
        }
        return zero;
    }
}
