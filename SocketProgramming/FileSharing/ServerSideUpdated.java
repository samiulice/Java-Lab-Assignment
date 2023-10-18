package FileSharing;

import java.net.*;
import java.io.*;

public class ServerSideUpdated {
    public static void main(String[] args) throws Exception{
        try{
            ServerSocket serverSocket = new ServerSocket(105);
            System.out.println("Server is running..");
            Socket socket = serverSocket.accept();
            System.out.println("Connected successfully to the client");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            File file = new File("SocketProgramming/FileSharing/myinfo.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            String fileName = file.getName();
            String extension = fileName.substring(fileName.lastIndexOf("."));
            outputStream.writeUTF(extension);
            int c;
            while((c=fileInputStream.read()) != -1){
                outputStream.write(c);
            }
            System.out.println("file sent successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
