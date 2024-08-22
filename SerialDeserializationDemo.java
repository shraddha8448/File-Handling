// Serialization and Deserialization

import java.io.*;
class Company implements Serializable{
    String compName;
    int noOfEmp;

    Company(String compName, int noOfEmp){
        this.compName = compName;
        this.noOfEmp = noOfEmp;
    }
}
public class SerialDeserializationDemo {
    public static void main(String[] args) {
        // Serialization
        Company obj1 = new Company("Nvidia", 80);
        Company obj2 = new Company("Google",150);

        try(FileOutputStream fos = new FileOutputStream("company.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(obj1);
            oos.writeObject(obj2);

        }catch(IOException e){
            e.getMessage();
        }

        // Deserialization
        try (FileInputStream fis = new FileInputStream("company.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Company Dobj1 = (Company)ois.readObject();
            Company Dobj2 = (Company) ois.readObject();

            System.out.println(Dobj1.compName+ " : " + Dobj1.noOfEmp);
            System.out.println(Dobj2.compName+ " : " + Dobj2.noOfEmp);
        }catch (IOException | ClassNotFoundException e){

        }
    }
}
