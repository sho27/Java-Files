class Student 
{
    int id, age;
    String name;

    public Student() 
    {
        id = 1;
        age = 10;
    }

    public Student(int id, int age, String name)
    {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void display() 
    {
        System.out.println("id : " + id + "\nAge :" + age + "\nName :" + name);
    }
}
public class StudentInfo 
{
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.display();

        Student obj1 = new Student(2, 12, "Ridham");
        obj1.display();
    }
}
