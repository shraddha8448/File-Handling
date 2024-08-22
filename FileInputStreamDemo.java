
import java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] args)throws IOException {
        // Read raw bytes from the file
        FileInputStream fs = new FileInputStream("abc.txt");

        // FileDescriptor represent the connection of actual file
        FileDescriptor fd = fs.getFD();

        // read the character from the file
        FileReader fr = new FileReader(fd);

        int data = fr.read();
        while (data != -1){
            System.out.print((char)data);
            data = fr.read();
        }
        fr.close();
    }
}

