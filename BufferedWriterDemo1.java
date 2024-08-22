import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {

    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("bwDemo.txt"))){

            bw.write("Hellow World");
            bw.newLine();
            bw.write("Welcome");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
