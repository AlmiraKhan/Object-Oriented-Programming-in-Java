interface Operations
{
    double area();
    double volume();
    float PI = 3.14F;

    
}
class Cylinder implements Operations
{
    double height,radius;
    Cylinder(double h,double r)
    {
        height=h;
        radius=r;
    }
    public double area()
    {
        return (2*PI*radius)*(radius+height);
    }
    public double volume()
    {
        return (3.14*radius*radius*height);

    }

}
class OpMain
{
    public static void main(String args[])
    {
        Cylinder c = new Cylinder(10,10);
        System.out.println("Area:"+c.area()+" Volume:"+c.volume());
    }
}
