import java.io.*;
public class FileWriterDemo2 {
    public static void main(String[] args)throws IOException {
        File f = new File("Incubator.txt");
        FileWriter fw = new FileWriter(f,true);// by default append is false

        fw.write("Testing\n");
        fw.write("Devops\n");
        fw.write("Salesforce\n");
        fw.write("Backend");

        fw.close();
    }
}
