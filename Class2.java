import java.io.*;


/**
 * Class2
 */
public class Class2 {

    public static void main(String[] args) throws ClassNotFoundException  {

        Employee em = null;
        
       
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("emp.dat"));
            /*RandomAccessFile raf2 = new RandomAccessFile("emp.dat", "r");*/
            RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
        
            while (raf.getFilePointer() < raf.length()) {
                 
                 em = (Employee) obj.readObject();
                /* System.out.println(raf2.readUTF());*/
                 raf.writeUTF(em.name);
                 raf.writeUTF(em.address);
                 raf.writeUTF(String.valueOf(em.SSN));
                 raf.writeUTF(String.valueOf(em.number));
                 
            }
            obj.close();
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
            return;
        }
        

    

   
}
}
