package FileSharing;

import java.net.*;
import java.io.*;


public class ClientSide {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 105);

        DataInputStream inputStream = new DataInputStream(s.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
        File f = new File("E:\\2010277105\\Java-Lab-Assignment\\SocketProgramming\\FileSharing\\clientfile.txt");
        FileWriter fileWriter = new FileWriter(f);
       long len = inputStream.readLong();
        System.out.println(len);
        while(len > 0){
            char c = (char)inputStream.readByte();
            System.out.print(c);
            fileWriter.append(c);
            len--;
        }
        if(f.createNewFile()){

        }else {
            System.out.println("error occurred during file creation");
        }

    }
}
