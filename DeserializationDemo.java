import java.io.*;

// Deserialization : Read the object from the file
public class DeserializationDemo {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("player.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Player obj1 = (Player)ois.readObject();
            Player obj2 = (Player)ois.readObject();

            System.out.println(obj1.pName + ":" + obj1.jerNo);
            System.out.println(obj2.pName + ":" + obj2.jerNo);
        } catch (IOException |  ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
