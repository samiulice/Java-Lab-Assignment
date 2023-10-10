package SocketProgram03;
import java.util.*;
import java.net.*;
import java.io.*;
public class ClientInput {
    public static void main(String[] args) throws IOException{
        Socket clientSocket = new Socket("localhost", 105);
        System.out.println("Connected to the server successfully");

        //Taking radius as input from terminal
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        Double radius = input.nextDouble();

        //send radius to the server
        DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
        dos.writeDouble(radius);

        //Receive area from the server
        DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
        Double area = dis.readDouble();
        System.out.println("Area is: " + area);




    }
}
