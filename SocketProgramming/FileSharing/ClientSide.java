package FileSharing;

import java.net.*;
import java.io.*;

public class ClientSide {
    public static void main(String[] args) throws Exception{
        try{
            Socket socket = new Socket("localhost", 4000);


            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            File file = new File("SocketProgramming/FileSharing/clientinfo.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            int c;
            while((c = inputStream.read()) != -1){
                System.out.print((char) c);
                fileOutputStream.write((char)c);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
