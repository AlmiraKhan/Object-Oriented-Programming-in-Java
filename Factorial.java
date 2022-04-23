class Recursion
{
    int factorial(int num)
    {
        if(num<=1)
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
    }
}
class Factorial
{
    public static void main(String args[])
    {
        Recursion r = new Recursion();
        //System.out.println("Enter num:"+ args[0]);
        System.out.println("The factorial is:"+r.factorial(0));
    }
}