class Complex
{
    float real;
    float img;

    Complex()
    {
        real=3;
        img=6;
    }
    Complex(float real, float img)
    {
        this.real=real;
        this.img=img;
    }
    Complex sum(Complex c)
    {
        Complex c1 = new Complex();
        c1.real=c.real+real;
        c1.img=c.img+img;
        return c1;
    }
}
class Cnum
{
    public static void main(String args[])
    {
        Complex num1 = new Complex();
        Complex num2 = new Complex(10.3F,2.1F);
        Complex num3;
        num3=num1.sum(num2);
        System.out.println(num3.real+"+i"+num3.img);
    }
}