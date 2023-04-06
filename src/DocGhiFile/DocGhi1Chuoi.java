package DocGhiFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhi1Chuoi {
    public static void writeFromFile(String s) throws IOException {
        FileOutputStream out = new FileOutputStream("D:\\text.txt");
        byte[] b = s.getBytes();
        out.write(b);
        System.out.println("success...!");
        out.close();
    }

    public static void readFromFile() throws IOException {
        FileInputStream in = new FileInputStream("D:\\text.txt");
        int i = 0;
        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }
        in.close();
    }

    public static void main(String[] args) throws IOException {
        writeFromFile("Nguyen Manh Cuong");
        readFromFile();
    }

}
