class Matpdt 
{
    public static void main(String args[])
    {
        int ra=3,rb=2,ca=2,cb=3,r=3,c=3;
        int a[][]={{1,2},{4,5},{7,8}};
        int b[][]={{1,2,3},{4,5,6}};
        int pdt[][] = new int[r][c];
        int sum=0;
        int i,j,k;
        if(ca==rb)
        {
            for(i=0;i<ra;i++)
            {
                for(j=0;j<cb;j++)
                {
                    for(k=0;k<ca;k++)
                    {
                        sum=sum+a[i][k]*b[k][j];
                    }                
                    pdt[i][j]=sum;
                    sum=0;
                    
                }
            }
        }
        else
        System.out.println("Multiplication is not possible");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
                System.out.print(pdt[i][j]+"  ");
            System.out.println();
        }
    }
    
}
