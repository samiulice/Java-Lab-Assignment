package SendingArrayofData;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ClientSide {
    public static void main(String[] args) throws IOException{
        Socket sc = new Socket("localhost",105);

        //Defining input and output stream for sending data
        DataInputStream input = new DataInputStream(sc.getInputStream());
        ObjectOutputStream output = new ObjectOutputStream(sc.getOutputStream());
        //Example 01
        double []arr = {10,10.2,14};
        output.writeObject(arr);//sending data to the server
        System.out.println(input.readDouble());//reading data from the server

        //Example 02
        ArrayList<Integer> newarr = new ArrayList<>(Arrays.asList(10,15,14,18,16,8,1,5,85,52,5,5,5,51,4,15,8,2,3));
        output.writeObject(newarr);

        System.out.println(input.readDouble());

    }
}
