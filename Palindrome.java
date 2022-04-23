class Palindrome
{
    public static void main(String args[])
    {
        String s ="Malayalam";
        s=s.toLowerCase();
        int i,flag=1;
        int n=s.length();
        for(i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            { 
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}