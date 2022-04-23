class Shape
{
    String name;
    Shape(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    

}
class Circle extends Shape implements Area
{
    double radius;
    Circle(double r, String n)
    {
        super(n);
        radius=r;
        
    }
    public double findArea()
    {
        return (3.14*radius*radius);
    }
}
class Square extends Shape implements Area
{
    double side;
    Square(double s,String n)
    {
        super(n);
        side=s;
    }
    public double findArea()
    {
        return(side*side);
    }
}
class Cylinder extends Circle implements Volume
{
    double height;
    Cylinder(double h,double r,String n)
    {
        super(r,n);
        height=h;
    }

    public double findVolume()
    {
        return (3.14*radius*radius*height);
    }
    
}
class Sphere extends Circle implements Volume
{
   Sphere(double r, String n) 
   {
    super(r,n);
   }

   public double findVolume()
   {
       return (1.33*3.14*radius*radius*radius);
   }
}
class Cube extends Square implements Volume
{
    Cube(double s,String n)
    {
        super(s,n);
    }
    public double findVolume()
    {
        return (side*side*side);
    }
}
class Glome extends Sphere
{
    Glome(double r,String n)
    {
        super(r,n);
    }
    public double findVolume()
    {
        return (4.9298*radius*radius*radius*radius);
    }
}
interface Area
{
    double findArea();

}
interface Volume
{
    double findVolume();
}

class ShapeMain
{
    public static void main(String args[])
    {
        Glome g = new Glome(10,"Glome");
        Cube c = new Cube(10,"Cube");
        Sphere s = new Sphere (10,"Sphere");
        Cylinder cyl = new Cylinder (10,10,"Cylinder");
        Circle cir = new Circle(10,"Circle");
        Square sq = new Square(10,"Square");

        System.out.println(cir.getName() +" area :"+ cir.findArea()); 
        System.out.println(sq.getName() +" area :"+ sq.findArea()); 
        System.out.println(g.getName() +" volume: "+g.findVolume()); 
        System.out.println(s.getName() +" volume: "+s.findVolume()); 
        System.out.println(cyl.getName() +" volume: "+cyl.findVolume()); 
        System.out.println(c.getName() +" volume: "+c.findVolume()); 
    }
}