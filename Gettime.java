class Time
{
    int hr;
    int min;
    Time()
    {
       hr=3;
       min=56;
    }
    Time(int hr,int min)
    {
       this.hr=hr;
       this.min=min;
    }
    Time Sum(Time t1)
    {
        Time t2 = new Time();
        int h=t1.hr+hr;
        int m= t1.min+min;
        t2.hr=h+(m/60);
        t2.min=m%60;
        return t2;
       
    }
}


class Gettime 
{
    public static void main(String[] args)
    {
        Time x = new Time(10,45);
        Time y = new Time();
        Time z;
        System.out.print("Hours=");
        z=y.Sum(x);
        System.out.println(z.hr);
        System.out.print("Minutes=");
        z=y.Sum(x);
        System.out.println(z.min);

    }
    
}