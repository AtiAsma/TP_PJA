import java.io.*;


/**
 * Class2
 */
public class Class2 {

    public static void main(String[] args)  {

        Employee em = null;
        
       
        try {
            
            RandomAccessFile raf2 = new RandomAccessFile("emp.dat", "r");
            RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
        
            while (raf.getFilePointer() < raf.length()) {
                 System.out.println(raf2.readUTF());
                 raf.writeUTF(em.name);
                 raf.writeUTF(em.address);
                 raf.writeUTF(String.valueOf(em.SSN));
                 raf.writeUTF(String.valueOf(em.number));
                 
            }
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
            return;
        }
        

    

   
}
}