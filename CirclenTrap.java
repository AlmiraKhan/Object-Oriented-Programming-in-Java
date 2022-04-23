class Shape
{
    void findArea()
    {
        System.out.println("Shapes are everywhere");
    }
    void display()
    {
        System.out.println("displaying shape names");
    }
}
class Circle extends Shape
{
    void findArea(int r)
    {
        System.out.println("Area:"+(3.14*r*r));
    }
    void display(String str)
    {
        System.out.println(str);
    }
}
class Trapezoid extends Shape
{
    void findArea(int a,int b ,int h)
    {
        System.out.println("Area:"+(a+b)*h/2);
    }
    void display(String str)
    {
        System.out.println(str);
    }
}
class CirclenTrap
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        Trapezoid t = new Trapezoid();

        c.display("Circle");
        c.findArea(2);
        t.display("Trapeziod");
        t.findArea(2,4,2);
        
    }
}