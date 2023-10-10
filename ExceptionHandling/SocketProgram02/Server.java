package SocketProgram02;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("Server is running...");
        Socket s1 = ss.accept(); //wait and accept a connection

        //Receive First msg
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String(dis.readUTF());
        System.out.println(st);

        //send First msg
        OutputStream s1Out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1Out);
        dos.writeUTF("Hello client from server message #1 ");

        //Receive Second msg
        s1In = s1.getInputStream();
        dis = new DataInputStream(s1In);
        st = new String(dis.readUTF());
        System.out.println(st);

        //send second msg
        s1Out = s1.getOutputStream();
        dos = new DataOutputStream(s1Out);
        dos.writeUTF("Hello client from server message #2 ");

        dos.close();
        s1In.close();
        s1Out.close();
        s1.close();
    }
}
