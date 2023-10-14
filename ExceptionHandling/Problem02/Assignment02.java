package Problem02;

public class Assignment02 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int [] arr = new int[5];
        try{
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
