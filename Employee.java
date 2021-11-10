import java.io.Serializable;

/**
 * Employee
 */
public class Employee implements Serializable  {

    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public Employee(){}

    public Employee(String name, String address, int SSN, int number){
        this.name=name;
        this.address=address;
        this.SSN=SSN;
        this.number=number;
    }
    
    public void mailCheck()
    {
       System.out.println("Mail de verification de " + name + " " + address);
    }

    public int getNumber(){
        return this.number;
    }
 
}