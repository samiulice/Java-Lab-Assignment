package problem01;

public class Solver {
    protected static StringBuilder DecToBin(int number){
        int rem;
        boolean isPositive = number >= 0;
        number = Math.abs(number);
        StringBuilder temp = new StringBuilder();

        if(number == 0){
            temp.append(0);
            return temp;
        }
        //convert decimal to binary in reverse order
        while(number != 0){
            rem = number % 2;
            temp.append(rem);
            number = number / 2;
        }
        //append 0 for empty places
        if(temp.length() < 8){
            while(temp.length() < 7){
                temp.append(0);
            }
        }
        else if(temp.length() < 16){
            while(temp.length() < 15){
                temp.append(0);
            }
        }
        else if(temp.length() < 32){
            while(temp.length() < 31){
                temp.append(0);
            }
        }
        else{
            while(temp.length() < 63){
                temp.append(0);
            }
        }
        //append sign bit = 0 if number is positive, 1 if number is negative
        if(isPositive){
            temp.append(0);
        }
        else{
            temp.append(1);
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
