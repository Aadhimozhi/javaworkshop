import java.io.FileWriter;
import java.io.IOException;

public class oop
{
   public static void main(String[] args)
   {
      try
       {
          FileWriter writer = new FileWriter("file4.txt");
          {
             for (int i = 0; i < 15; i++)
               writer.write(i + "\n");
            System.out.println("number writed");
           
            writer.close();
         }
         
         }
      catch (IOException e)
       {
             System.out.println("error");
             //e.printStackTrace();
      }
         
}
}