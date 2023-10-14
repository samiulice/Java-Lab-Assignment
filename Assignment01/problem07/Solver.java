package problem07;

public class Solver {

    public static String MaxUsedWord(String str){

        String[] arr = str.split(" ");

        int count, max_count = 0;
        String word = "";
        for(String i:arr){
            count = 0;
            for(String j:arr){
                if(j.equals(i)){
                    count++;
                }
            }
            if(count > max_count){
                max_count = count;
                word = i;
            }
        }

        return word;
    }

    public static String wordWithMaxLength(String str){

        String[] arr = str.split(" ");
        String temp = arr[0];
        for(String i:arr){
            if(temp.length() < i.length()){
                temp = i;
            }
        }
        return temp;
    }

}
