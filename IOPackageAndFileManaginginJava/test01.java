import java.io.*;

public class test01 {
    public static void main(String[] args) throws IOException {
        String name = "Samiul Bashir";
        byte []b = name.getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        int c;
        while((c = input.read()) != -1){
            System.out.print((char)c);
        }
        System.out.println();
        input.reset();
        while((c = input.read()) != -1){
            System.out.print(Character.toUpperCase((char) c));
        }
        System.out.println();
        input.reset();
        while((c = input.read()) != -1){
            System.out.print(Character.toLowerCase((char) c));
        }
        input.close();
    }
}
