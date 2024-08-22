// Read the File
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("Incubator.txt");
        int data = fr.read();
        while(data != -1){
            System.out.print((char)data);
            data = fr.read();
        }
        fr.close();;
    }
}
