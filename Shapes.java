class Shapes
{
    public static void main(String args[])
    {
        Shape s = new Shape();
        s.findArea(12,10);
        s.findArea(10F,20F);
        s.findArea(5.00);
        s.findArea(10,5,12);

    }
}
class Shape
{
    int a,b,c;
    void findArea(float a,float b)
    {
        System.out.println("Area of Triangle is");
        System.out.println(a*b/2);
    }
    void findArea(int a,int b)
    {
        System.out.println("Area of Rectangle is");
        System.out.println(a*b);
    }
    void findArea(double a)
    {
        System.out.println("Area of Circle is");
        System.out.println(3.14*a*a);
    }
    void findArea(int a,int b,int c)
    {
        System.out.println("Area of Trapezoid is");
        System.out.println(c*((a+b)/2));
    }
    
}