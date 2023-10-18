package FileSharing;

import java.net.*;
import java.io.*;

public class Serverside {
    public static void main(String[] args) throws Exception{
        try{
            ServerSocket serverSocket = new ServerSocket(4000);
            System.out.println("Server is running..");
            Socket socket = serverSocket.accept();
            System.out.println("Connected successfully to the client");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            File file = new File("SocketProgramming/FileSharing/myinfo.txt");
            FileInputStream fileInputStream = new FileInputStream(file);

            int c;
            while((c=fileInputStream.read()) != -1){
                outputStream.write(c);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
