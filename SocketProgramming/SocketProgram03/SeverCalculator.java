package SocketProgram03;
import java.io.*;
import java.net.*;
import java.util.*;

public class SeverCalculator {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(105);
        System.out.println("Server is running");
        Socket s = serverSocket.accept();
        System.out.println("client request is accepted");

        //Read the radius from client
        DataInputStream sIn = new DataInputStream(s.getInputStream());
        Double radius = sIn.readDouble();

        //Calculate radius and send to the client
        Double area = Math.PI * radius * radius;
        System.out.println("Area is : " + area + "Sending to client");
        DataOutputStream sOut = new DataOutputStream(s.getOutputStream());
        sOut.writeDouble(area);


    }
}
