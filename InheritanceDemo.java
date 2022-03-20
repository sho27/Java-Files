class Foam
{
    public Foam()
    {
        System.out.println("This is foam class");
    }
}

class Wood extends Foam
{
    public Wood()
    {
        System.out.println("This is wood class");
    }
}

class Duster extends Wood{
    public Duster()
    {
        System.out.println("This is duster class");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) 
    {
        Duster obj = new Duster();
    }
}
