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
        System.out.println("Server is running...");
        Socket ss = serverSocket.accept();

        DataInputStream input = new DataInputStream(ss.getInputStream());
        String temp = input.readUTF();

        double sum = 0.0;

        String s = temp.substring(1,temp.length()-1);
        String []nums = s.split(",");
        for(int i = 0; i < nums.length; i++){
            sum= sum + Double.parseDouble(nums[i]);

        }
//        System.out.println(sum);
        DataOutputStream output = new DataOutputStream(ss.getOutputStream());
        output.writeUTF(String.valueOf(sum));
        input.close();
        output.close();

    }
}
