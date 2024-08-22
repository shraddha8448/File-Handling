
//
import java.io.*;
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{

        // OutputStreamWriter
        OutputStream outputStream = new FileOutputStream("abc.txt");
        Writer writer = new OutputStreamWriter(outputStream);

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Hello, World!\n");
        bufferedWriter.write("Welcome");
        bufferedWriter.close();

        //
        InputStream inputStream = new FileInputStream("abc.txt");
        Reader reader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
