import java.io.*;

public class Count 
{
    public static void main(String args[]) throws IOException
    {
        FileReader f=new FileReader("f.txt");
        int nc=0,nl=0,nw=0,x;
        char c;
        while ((x=f.read())!=-1) 
        {
            c=(char)x;
            if(c=='\n')
                nl++;
            else if(c==' ')
                nw++;
            else
                nc++;
        }
        nl++;
        nw=nw+nl;
        nc=nc-nl+1;
        System.out.println("no.of lines:"+nl);
        System.out.println("no.of words:"+nw);
        System.out.println("no.of characters:"+nc);
    }  
}
