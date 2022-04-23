import java.util.Random;
class ThreadA  extends Thread
{
   public void run()
   {
       int num;
       Random r = new Random();
       num = (int)(100*r.nextDouble());
       if(num%2 == 0)
       {
           ThreadB tb = new ThreadB(num);
           tb.start();
       }
       else
       {
        ThreadC tc = new ThreadC(num);
        tc.start();
       }
       try
       {
          Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }

   } 
}
class ThreadB  extends Thread
{
    int n;
    ThreadB(int num)
    {
        n = num;
    }
   public void run()
   {
    System.out.println("Square of "+n+"="+(n*n));
   } 
}
class ThreadC  extends Thread
{
    int n;
    ThreadC(int num)
    {
        n=num;
    }
   public void run()
   {
       System.out.println("Cube of "+n+"="+(n*n*n));
   } 
}
 class Thread3
 {
     public static void main(String args[]) throws Exception
     {
         new ThreadA().start();

     }
     
 }
