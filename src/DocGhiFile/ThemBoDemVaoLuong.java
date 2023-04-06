package DocGhiFile;

import java.io.*;

public class ThemBoDemVaoLuong {
    public static void writeFromFile(String s) throws IOException {
        FileOutputStream out = new FileOutputStream("D:\\text.txt");
        BufferedOutputStream buff = new BufferedOutputStream(out);
        byte[] b = s.getBytes();
        buff.write(b);
        System.out.println("Success..!");
        buff.flush();
        buff.close();
        out.close();
    }

    public static void readFromFile() throws IOException {
        FileInputStream in = new FileInputStream("D:\\text.txt");
        BufferedInputStream buffin = new BufferedInputStream(in);
        int i = 0;
        while((i = buffin.read()) != -1)
        {
            System.out.print((char)(i));
        }
    }
    public static void main(String[] args) throws IOException {
        String s = "Nguyen Manh Cuong new";
//       writeFromFile(s);
        readFromFile();
    }

}
