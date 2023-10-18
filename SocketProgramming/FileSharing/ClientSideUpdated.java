package FileSharing;

import java.net.*;
import java.io.*;

public class ClientSideUpdated {
    public static void main(String[] args) throws Exception{
        try{
            Socket socket = new Socket("localhost", 105);


            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            String fileName = "SocketProgramming/FileSharing/clientinfoupdate" + inputStream.readUTF();
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            int c;
            while((c = inputStream.read()) != -1){
                fileOutputStream.write((char)c);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
