import java.io.*;
import java.util.StringTokenizer;
class Intsum
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter integers:");  
        String s=System.console().readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        int sum=0,x;
        System.out.println("Entered integers:-");
        while (st.hasMoreTokens()) 
        {
            x=Integer.parseInt(st.nextToken());
            System.out.print(x);
            sum+=x;
        }
        System.out.println("sum="+sum);
    }
}