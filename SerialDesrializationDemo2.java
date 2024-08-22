// serialization and Deserialization

import java.io.*;

class Hospital implements Serializable{
    String hospitalName ;
    int noOfDoctors;

    Hospital(String hospitalName, int noOfDoctors){
        this.hospitalName =hospitalName;
        this.noOfDoctors = noOfDoctors;
    }
}
public class SerialDesrializationDemo2 {
    public static void main(String[] args) {
        Hospital obj1 = new Hospital("Puna", 100);
        Hospital obj2 = new Hospital("KM", 200);

        // Serialization
        try(FileOutputStream fos = new FileOutputStream("hospital.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(obj1);
            oos.writeObject(obj2);

        }catch(IOException e){
            e.printStackTrace();
        }

        // Deserialization

        try (FileInputStream fis = new FileInputStream("hospital.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Hospital hObj1 = (Hospital) ois.readObject();
            Hospital hObj2 = (Hospital) ois.readObject();

            System.out.println("Hospital Name:" + hObj1.hospitalName + " No. of Doctors:" + hObj1.noOfDoctors);
            System.out.println("Hospital Name:" + hObj2.hospitalName + " No. of Doctors:" + hObj2.noOfDoctors);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
