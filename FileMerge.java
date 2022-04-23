import java.io.*;
public class FileMerge
{
    public static void main(String args[]) 
    {
        try
        {

            FileReader a = new FileReader("f1.txt");
            FileReader b = new FileReader("f2.txt");
            FileWriter c = new FileWriter("f.txt");
            int k;
            while((k=a.read())!= -1)
            {
                c.write(k);
            }
            c.write('\n');
            while((k=b.read())!= -1)
            {
                c.write(k);
            }
            System.out.println("Files are merged ");

            b.close();
            a.close();
            c.close();
        }
        catch(IOException e)
        {
            System.out.println("Error in handling files");
        }
        
       
        
    }

}