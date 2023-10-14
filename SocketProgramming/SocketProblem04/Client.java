package SocketProblem04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost", 105);

        DataOutputStream output = new DataOutputStream(sc.getOutputStream());
        double []arr = {4.51,9.6,4.4,10.85}; //29.36
        output.writeUTF(Arrays.toString(arr));

        DataInputStream input = new DataInputStream(sc.getInputStream());
        System.out.println(input.readUTF());
        output.close();
        input.close();
    }

}
