package SocketProgram01;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("Server is running...");
        Socket s1 = ss.accept(); //wait and accept a connection
        //Create data input stream
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String(dis.readUTF());
        System.out.println(st);
        //create data output stream
        OutputStream s1Out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1Out);
        dos.writeUTF("Hello client from server first message");
        dos.close();
        s1In.close();
        s1Out.close();
        s1.close();
    }
}
