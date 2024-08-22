// list of Files or directory
import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("D:\\Java");
        String[] s = f.list();
        int count = 0;

        for(String s1: s){
            System.out.println(s1);
            count++;
        }
        System.out.println(count);

        System.out.println("Files in the Java Directory");
        for(String s1: s){
            File f1 = new File(f,s1);
            if(f1.isFile()){
                System.out.println(s1);
            }
        }

        System.out.println("Ditectories in the Java Directory");
        for(String s1: s){
            File f1 = new File(f,s1);
            if(f1.isDirectory()){
                System.out.println(s1);
            }
        }
    }
}
