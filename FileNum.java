import java.io.*;
import java.util.*;
public class FileNum 
{
    public static void main(String args[]) throws IOException
    {
        String file;
        Scanner filename = new Scanner(System.in);
        System.out.println("Enter the file name");
        file=filename.nextLine();

        //File ob =  new File(file);
        //Scanner f = new Scanner(ob);

        FileReader f = new FileReader(file);
        BufferedReader bf = new BufferedReader(f);


        int min,max,sum;
        int temp;
        String k;
        int count=1;
        //if(f.hasNextInt())
        //{
            min=max=sum=Integer.parseInt(bf.readLine());
            while((k=bf.readLine()) !=null)
            {
                temp=Integer.parseInt(k);
                if(temp<min)
                    min=temp;
                if(temp>max)
                    max=temp;

                sum=sum+temp;
                count++;

            }
            System.out.println("Minimum:"+min+"\nMaximum:"+max+"\nRange:"+(max-min)+"\nAverage:"+sum/count);
        //}
        filename.close();
            f.close();
    }
    
}