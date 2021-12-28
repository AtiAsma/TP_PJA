import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Dev2_client {
    public static void main(String[] args)  {
        try {
            Socket client = new Socket("localHost", 9090);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            //question 1
            Scanner sc = new Scanner(System.in);
             out.println("List cours");
             out.flush();
             String str = in.readLine();
             
             //question 2
             out.println("Get chap_1");
             out.flush();
             String str2 = in.readLine();
             //question 3
             out.println("Quit");
 
 
 
        } catch (Exception e) {
            
        }
     }
    
}
