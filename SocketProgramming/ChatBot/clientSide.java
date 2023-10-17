package ChatBot;

import java.io.*;
import java.net.*;
import java.util.*;

public class clientSide {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 105);
        Scanner input = new Scanner(System.in);
        String inputmsg, outputmsg;
        DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
        DataInputStream inputStream = new DataInputStream(s.getInputStream());
        String st = "close";
        while(true){
            outputmsg = input.nextLine();
            outputStream.writeUTF(outputmsg);
            inputmsg = inputStream.readUTF();
            System.out.println(inputmsg);
            if(st.equals(inputmsg.toLowerCase())&&st.equals(outputmsg.toLowerCase())){
                inputStream.close();
                outputStream.close();
                s.close();
                return;
            }
        }
    }
}
