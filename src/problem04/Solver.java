package problem04;

import java.util.ArrayList;

public class Solver {
    protected static String reverseWord(String str){
        String[] arr = str.split(" ");
        String reverseStr = "";
        for(int i = arr.length-1; i >= 0; i--){
            if(!arr[i].isBlank()){
                reverseStr = reverseStr + arr[i]  + " ";
            }
        }
        return reverseStr;
    }
}
