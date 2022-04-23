class Rect
{
    int length,breadth;
    Rect()
    {
        length=10;
        breadth=2;
    }
    
    Rect(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    
    void peri()
    {
        int p=2*(length+breadth);
        System.out.println(p);

    }
    void area()
    {
        int a=length*breadth;
        System.out.println(a);
    }
    int sameArea(Rect r)
    {
        System.out.println(r.length);
        System.out.println(length);
        if(r.length*r.breadth ==length*breadth)
            return 1;
        return 0;

    }
}
class Rectangle
{
    public static void main(String args[])
    {
        Rect r1 = new Rect(5,4);
        System.out.println("Rectangle 1:");
        r1.area();
        r1.peri();
        Rect r2 = new Rect();
        System.out.println("Rectangle 2:");
        r2.area();
        r2.peri();
        if(r1.sameArea(r2)==1)
            System.out.println("Area of two rectangles are same");
        else
        System.out.println("Area of two rectangles are not same");

    }
}