package FileSharing;

import java.io.*;
import java.net.*;
public class SmartServer {
    public static void main(String[] args) throws Exception{
        try{
            ServerSocket serverSocket = new ServerSocket(105);
            System.out.println("Server is running..");
            Socket socket = serverSocket.accept();
            System.out.println("Connected successfully to the client");

            File file = new File("SocketProgramming/FileSharing/myVideo.mp4");
            String fileName = file.getName();
            String extension = fileName.substring(fileName.lastIndexOf("."));
            System.out.println(extension);

            FileInputStream fileInputStream = new FileInputStream(file);
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF(extension);

            int c;
            while((c=fileInputStream.read()) != -1){
                outputStream.write(c);
            }
            System.out.println("file sent successfully");
            outputStream.close();
            fileInputStream.close();
            socket.close();
            serverSocket.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
