class A
{
    int i;
    public A(int i)
    {
        this.i = i;
        System.out.println("in A class: " + i);
    }
}

class B extends A
{
    public B(int j) 
    {
        super(j);
        System.out.println("In B class");
    }
}

public class ThisSuperDemo 
{
    public static void main(String args[]) {
        B obj = new B(5);
    }
}
