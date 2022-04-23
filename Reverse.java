class Reverse
{
    public static void main(String args[])
    {
        String s1="helloo";
        String s2= new String("");
        int i,n=s1.length();
        for(i=n-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
}