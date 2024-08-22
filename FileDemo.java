// file Exist or not
// File or directory creation
import java.io.*;
public class FileDemo {
    public static void main(String[] args) throws  IOException{

        // file creation
        File f = new File("abc.txt");
        System.out.println(f.exists());

        f.createNewFile();
        System.out.println(f.exists());

        // Directory creation
        File f2 = new File("pqr");
        System.out.println(f2.exists());

        f2.mkdir();
        System.out.println(f2.exists());

        File f3 = new File("D:\\Java","demo");
        f3.createNewFile();

    }
}
