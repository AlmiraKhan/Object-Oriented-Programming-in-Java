import java.io.*;
public class FileCount 
{
    public static void main(String args[]) throws IOException
    {
        FileReader f = new FileReader("f1.txt");
        int c=0,l=0,w=0,temp;
        
        while((temp = f.read())!= -1)
        {
            //ch=(char)temp;
  
            if(temp==' ' || temp=='\n')
                w++;
            if(temp=='\n')
                l++;
      
            c++;

        }
        l++;
        w++;
        System.out.println("Words:"+w+"\nLines:"+l+"\nCharacters:"+c);
        f.close();
    }
    
}
