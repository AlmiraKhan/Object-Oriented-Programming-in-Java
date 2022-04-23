class Prime 
{
    public static void main(String args[])
    {
        int num=11,i,flag=1;
        if(num==1)
            System.out.println("1 is neither prime nor consonant");
        else
        {
            for(i=2;i<num/2;i++)
            {
                if(num%i==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.println(num+" is a prime number");
            else
            System.out.println(num+" is not a prime number");
        }
    }
    
}
