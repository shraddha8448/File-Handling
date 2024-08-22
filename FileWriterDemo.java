import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("abc.txt");

        fw.write(100);
        fw.write(" s/w Solution");
        fw.write("\n");

        char ch[] = {'a','b','c'};
        fw.write(ch);

        fw.flush();
        fw.close();
    }
}
