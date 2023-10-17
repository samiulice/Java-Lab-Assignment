package FileSharing;

import java.io.*;
import java.net.*;

public class Serverside {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(105);
        Socket s = ss.accept();
        DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());

        File f = new File("E:\\2010277105\\Java-Lab-Assignment\\SocketProgramming\\FileSharing\\myfile.txt");
        FileInputStream fileInputStream = new FileInputStream(f);
        dataOutputStream.writeLong(f.length());
        byte []buffer = new byte[4*1024];
        int c;
        while((c = fileInputStream.read(buffer)) != -1) {
            dataOutputStream.write(buffer, 0, c);
            dataOutputStream.flush();
        }
    }
}
