interface P 
{
   int A=1111;
   void displayA(); 
}
interface P1 extends P
{
    int B=2222;
    void displayB(); 
}
interface P2 extends P
{
    int C=3333;
    void displayC(); 
}
interface P12 extends P1,P2
{
    int D=4444;
    void displayD(); 
}
class Q implements P12
{
    
    public void displayA()
    {
          System.out.println("Constant A :"+A);
    }
    public void displayB()
    {
          System.out.println("Constant B :"+B);
    }
    public void displayC()
    {
          System.out.println("Constant C :"+C);
    }
    public void displayD()
    {
          System.out.println("Constant D :"+D);
    }
}
class PMain
{
   public static void main(String args[])
   {
      Q ob = new Q();
      
      ob.displayA();
      ob.displayB();
      ob.displayC();
      ob.displayD();
   }
}