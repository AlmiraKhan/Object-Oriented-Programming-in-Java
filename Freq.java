class Freq
{
    public static void main(String args[])
    {
        String s="MissiSsippi";
    int i,dup,j;
    int n=s.length();
    char[] arr=s.toCharArray();//change
    int[] fr = new int[n];
    for(i=0;i<n;i++)
    {
        fr[i]=1;
    }
    for(i=0;i<n;i++)
    {
        dup=1;
        for(j=i+1;j<n;j++)
        {
            if(arr[j]==arr[i])
            {
                dup++;
                fr[j]=0;
            }
        }
        if(fr[i]!=0)
        {
            fr[i]=dup;
        }
    }
    
        for(i=0;i<n;i++)
        { 
            if(fr[i]!=0)
            {
                System.out.println("Character "+arr[i]+" appears "+fr[i]+" times ");
            }
        }  

    }
    

}

