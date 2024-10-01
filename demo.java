import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
       
            Scanner reader = new Scanner("file1.txt");
            while (reader.hasNextLine())
            {
                String data =reader.nextLine();
                System.out.println(data);
                reader.close();
            }
        }
      
    }