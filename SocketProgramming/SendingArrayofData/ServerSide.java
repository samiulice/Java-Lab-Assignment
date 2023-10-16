package SendingArrayofData;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(105);
            Socket s = ss.accept();

            //Defining input and output stream
            ObjectInputStream input = new ObjectInputStream(s.getInputStream());
            DataOutputStream output = new DataOutputStream(s.getOutputStream());

            //example 01
            double []arr = (double[]) input.readObject();//reading input from client
            double sum = 0.0;
            for(double i : arr){
                sum += i;
            }
            output.writeDouble(sum);//sending data to the client

            //example 02
            ArrayList<Integer> myarr = (ArrayList<Integer>) input.readObject();//reading input from client
            for(double i : myarr){
                sum += i;
            }
            output.writeDouble(sum);//sending data to the client

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
