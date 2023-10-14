package SocketProgram01;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{
        //Create a socket to connect to the server
        Socket s2 = new Socket("localhost", 4999);

        //create data output stream
        OutputStream s1Out = s2.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1Out);

        //send a string
        dos.writeUTF("Hello Server1, this is from client Message #1\n");

        //create data input stream
        InputStream s1In = s2.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String(dis.readUTF());
        System.out.println(st);

        dos.close();
        s1In.close();
        s1Out.close();
        s2.close();

    }
}
