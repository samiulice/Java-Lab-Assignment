package ObjectExchanging;

import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(105);
        Socket s = ss.accept();

        try{
            ObjectInputStream input = new ObjectInputStream(s.getInputStream());
            Circle circle = (Circle) input.readObject();

            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            output.writeDouble(circle.area());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
