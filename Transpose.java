class Transpose
{
    public static void main(String args[])
    {
        int mat[][]={{1,2},{4,5},{7,8}};
        int r=3,c=2;
        int i,j;
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}