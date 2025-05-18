/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek person
 */
import java.io.*;

class Person implements Serializable{
    private String name;
    
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class SerializePerson{
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}