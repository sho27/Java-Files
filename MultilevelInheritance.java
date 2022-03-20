class A
{
    public A()
    {
        System.out.println("In A Class");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("In B class");
    }
}

class C extends B
{
    public C()
    {
        System.out.println("In C class");
    }
}

public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        C obj = new C();
    }
}
