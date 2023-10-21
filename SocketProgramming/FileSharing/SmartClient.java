package FileSharing;

import java.io.*;
import java.net.*;

public class SmartClient {
    public static void main(String[] args) throws Exception{
        try{
            Socket clientSoc = new Socket("localhost", 105);
            DataInputStream inputStream = new DataInputStream(clientSoc.getInputStream());
            String fileName = "SocketProgramming/FileSharing/output" + inputStream.readUTF();
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            int c;
            while((c = inputStream.read()) != -1){
                System.out.println((char)c);
                fileOutputStream.write((char)c);
            }
            fileOutputStream.close();
            inputStream.close();
            clientSoc.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
