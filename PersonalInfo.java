class Person 
{
    int age;
    String name, address;

    public Person(int age, String name, String address) 
    {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void display() 
    {
        System.out.println("Name : " + name + "\nAge :" + age + "\nAddress: " + address);
    }
}

public class PersonalInfo 
{
    public static void main(String args[])
    {
        Person obj = new Person(30, "Amit", "Karnal");
        obj.display();
    }
}
