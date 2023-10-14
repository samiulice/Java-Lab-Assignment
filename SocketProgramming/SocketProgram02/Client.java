package SocketProgram02;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{
        //Create a socket to connect to the server
        Socket s2 = new Socket("localhost", 4999);
        //Send First msg
        OutputStream s1Out = s2.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1Out);
        dos.writeUTF("Hello Server1, this is from client Message #1\n");
        //receive first msg
        InputStream s1In = s2.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String(dis.readUTF());
        System.out.println(st);

        //Send Second msg
        s1Out = s2.getOutputStream();
        dos = new DataOutputStream(s1Out);
        dos.writeUTF("Hello Server1, this is from client Message #2\n");

        //receive Second msg
        s1In = s2.getInputStream();
        dis = new DataInputStream(s1In);
        st = new String(dis.readUTF());
        System.out.println(st);


        dos.close();
        s1In.close();
        s1Out.close();
        s2.close();

    }
}
