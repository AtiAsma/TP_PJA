import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Dev2_Server {
    public static void main(String[] args) {
        String str = null;
        try {
            ServerSocket server = new ServerSocket(9090);
            while (str != null) {
                Socket client = server.accept();
                System.out.println("Server Listening on Port " + client.getPort());

                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                //question 1
                str = in.readLine();
                File repo = new File("C:\\Users\\1\\Documents\\documents1\\m1-s1\\pja\\cours");
                if (repo.exists()) {
                    File[] list = repo.listFiles();
                    out.println(list);
                    for (int i = 1; i <= list.length; i++) {
                        if (list[i].isFile()) {
                            out.println("Le fichier" + i + " : %s%n" + list[i].getName());
                        }

                    }
                } else {
                    out.print("ERROR : directory does not exist");
                }
                //question 2
                str = in.readLine();
                File file = new File("C:\\Users\\1\\Documents\\documents1\\m1-s1\\pja\\cours\\chap_1.txt");
                String line;
                if (file.exists()) {
                    Scanner read = new Scanner (file);
                    while (read.hasNext()) {
                        line = read.nextLine();
                    }
                    out.println(line);
                }else{
                    out.print("ERROR : File does not exist");
                }
                




            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
