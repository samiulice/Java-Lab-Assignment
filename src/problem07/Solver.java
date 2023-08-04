package problem07;

public class Solver {

    public static String MaxUsedWord(String str){

        String[] arr = str.split(" ");

        int count = 0, max_count = 0;
        String word = "";
        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals(arr[i])){
                    count++;
                }
            }
            if(count > max_count){
                max_count = count;
                word = arr[i];
            }
        }

        return word;
    }

    public static String wordWithMaxLenght(String str){

        String[] arr = str.split(" ");
        String temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(temp.length() < arr[i].length()){
                temp = arr[i];
            }
        }
        return temp;
    }

}
