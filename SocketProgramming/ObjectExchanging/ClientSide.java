package ObjectExchanging;

import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 105);

        try {
            ObjectOutputStream output = new ObjectOutputStream(s.getOutputStream());
            Circle circle = new Circle(5.0);
            output.writeObject(circle);
            DataInputStream input = new DataInputStream(s.getInputStream());
            System.out.println(input.readDouble());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
