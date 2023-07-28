package problem07;

import java.util.HashMap;
public class Solver {
    protected static String MaxUsedWord(String str){
        //splitting the line into word specified by whitespace
        String[] arr = str.split(" ");

        //store all words into the map to identify how many times the specific word is used
        int n = arr.length;
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            if(!arr[i].isBlank()){      //ignoring element that contains whitespace only
                if(wordMap.containsKey(arr[i])){    /* updating the value against a word
                                                         that is already mapped into the map
                                                    */
                    int oldValue = wordMap.get(arr[i]);
                    wordMap.replace(arr[i], oldValue+1);
                }
                else{                               //putting values against the key that are not exit in the map
                    wordMap.put(arr[i], 1);
                }
            }
        }
        //Finding the word that are used most frequently
        String temp = "";
        int maxValues = 0;
        for (String key:wordMap.keySet()) {
            if(maxValues < wordMap.get(key)){
                maxValues = wordMap.get(key);
                temp = key;
            }
        }
        return temp;
    }

    protected static String findMaxLengthWord(String str){
        String[] arr = str.split(" ");
        int n = arr.length, maxLength = 0;
        String word = "";
        for(int i = 0; i < n; i++){
            if(!arr[i].isBlank() && arr[i].length() > maxLength){
                maxLength = arr[i].length();
                word = arr[i];
            }
        }

        return word;
    }
}
