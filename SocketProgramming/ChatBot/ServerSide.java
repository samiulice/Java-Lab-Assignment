package ChatBot;

import java.util.*;
import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(105);
        Socket s = ss.accept();
        Scanner input = new Scanner(System.in);
        String inputmsg, outputmsg, st = "close";
        DataInputStream inputStream = new DataInputStream(s.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());

        while(true){
            while(true){
                inputmsg = inputStream.readUTF();
                System.out.println(inputmsg);
                outputmsg = input.nextLine();
                outputStream.writeUTF(outputmsg);
                if(st.equals(inputmsg.toLowerCase())&&st.equals(outputmsg.toLowerCase())){
                    inputStream.close();
                    outputStream.close();
                    s.close();
                    return;
                }
            }
        }
    }
}
