import java.io.File;
public class main
{
    public static void main(String[] args)
    
        {
         try {
            File obj  = new File("file1.txt");
            if (obj.createNewFile()){
                 System.out.println("file is created sucessfully");
            }
            else{
                System.out.println("file already exists");
            }
         }
        catch (Exception e)
         {
            System.out.println("an error in program");
         }

    }
}