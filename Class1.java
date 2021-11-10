import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Class1
 */
public class Class1 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre d'employees : ");
        int nbr = sc.nextInt();
        Employee em[] = new Employee[nbr];
        try {
            /*ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("emp2.dat"));*/
            RandomAccessFile raf = new RandomAccessFile("emp3.dat", "rw");
            for (int index = 0; index < em.length; index++) {
                System.out.println("Entrer le nom : ");
                String name = sc.next();
                System.out.println("Entrer l'adresse : ");
                String address = sc.next();
                System.out.println("Entrer le SSN : ");
                int SSN = sc.nextInt();
                System.out.println("Entrer le numero : ");
                int numero = sc.nextInt();
                 em[index] = new Employee(name, address, SSN, numero);
                 /*obj.writeObject(em);*/
                 raf.writeUTF(name);
                 raf.writeUTF(address);
                 raf.writeUTF(String.valueOf(SSN));
                 raf.writeUTF(String.valueOf(numero));
                 
                
                 
                 
            }
            
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}