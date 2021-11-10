import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Class3
 */
public class Class3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();
        try {
            RandomAccessFile raf = new RandomAccessFile("empdirect.dat","rw");
            System.out.println("Entrer le numero de l'employee : ");
			int n = sc.nextInt();
            if (em.getNumber()==n) {
                System.out.print(raf.readUTF());
                
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
