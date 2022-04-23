class Employee
{
    String name,address;
    int age,phone,salary=78000;

    Employee(int age,int phone,int salary,String name,String address)
    {
        this.name=name;
        this.address=address;
        this.age=age;
    }

    void printSalary()
    {
        System.out.println(salary);
    }
}
class Officer extends Employee
{
    String spec;
    Officer(int age,int phone,int salary,String name,String address,String spec)
    {
       super(age, phone, salary, name, address);
       this.spec=spec;

    }
    void display()
    {
        System.out.println("Age="+age);
    }

}
class Manager extends Employee
{
    String dept;
    Manager(int age,int phone,int salary,String name,String address,String dept)
    {
        super(age, phone, salary, name, address);
        this.dept=dept;
    }
    void display()
    {
        System.out.println("Age="+age);
    }
    

}
class Inh1
{
    public static void main(String args[])
    {
        Officer ob1 = new Officer(23,97783076,32000,"Almira","koz","spec");
        Manager ob2 = new Manager(23,97783076,32000,"Almira","koz","spec");
        ob1.display();
        ob1.printSalary();
        ob2.display();
        ob2.printSalary();
    }
}