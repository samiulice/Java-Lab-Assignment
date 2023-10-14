package SocketProblem04;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(105);
        Socket ss = serverSocket.accept();

        DataInputStream input = new DataInputStream(ss.getInputStream());
        double sum = 0.0;
        String temp = input.readUTF();
        String s = temp.substring(1,temp.length()-1);
        String []nums = s.split(",");
        for(String i:nums){
            sum+= Double.parseDouble(i);
        }
        System.out.println(sum);
        DataOutputStream output = new DataOutputStream(ss.getOutputStream());
        output.writeUTF(String.valueOf(sum));
        input.close();
        output.close();

    }
}
