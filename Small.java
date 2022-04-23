class Small
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int i,n=arr.length;
        int smallest,small2;
        if(arr[0]<arr[1])
        {
            smallest=arr[0];
            small2=arr[1];
        }
        else
        {
            smallest=arr[1];
            small2=arr[0];
        }

        for(i=2;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                small2=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<small2 && arr[i]>smallest)
                small2=arr[i];
            
            
        }
        System.out.println("The second smallest element is "+ small2);
    }
    
}
