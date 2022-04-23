class CommLineArg
{
    public static void main(String args[])
    {
        String temp;
        

        for(int j=0;j<args.length-1;j++)
        {
            for(int k=0;k<args.length-j-1;k++)
            {
                if(args[k].compareTo(args[k+1])>0)
                {
                    temp=args[k+1];
                    args[k+1]=args[k];
                    args[k]=temp;
                }
                
            }
        }
        for(int i=0;i<args.length;i++)
        {
            System.out.print(args[i]);
        }
    }
    
}