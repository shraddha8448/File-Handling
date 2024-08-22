import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Player implements Serializable{
    int jerNo;
    String pName;

    Player(int jerNo,String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }
}

// Serialization : write the Object in the file.
public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Player obj1 = new Player(1,"KL Rahul");
        Player obj2 = new Player(45,"Rohit Sharma");
        Player obj3 = new Player(18,"Virat Kohli");

        FileOutputStream fos = new FileOutputStream("player.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj1);
        oos.writeObject(obj2);
        oos.writeObject(obj3);

        oos.close();
        fos.close();
    }
}
