class Employee
{
    int sal;
    Employee(int sal)
    {
        this.sal=sal;
    }
    void display()
    {
        System.out.println("name of class is employee");
    }
    void calcSalary()
    {
        System.out.println("salary is "+sal);
    }
}
class Engineer extends Employee
{
    int esal;
    Engineer(int sal, int esal)
    {
        super(sal);
        this.esal=esal; 


    }
    void calSalary()
    {
        super.calcSalary();
        System.out.println("SAlary of employee "+esal);

    }

}
class Inh2
{
    public static void main(String args[])
    {
        Engineer ob = new Engineer(2000000,90);
        ob.calSalary();
        ob.display();
    }
}