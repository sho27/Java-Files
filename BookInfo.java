class Book 
{
    int price;
    String name;

    public Book(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }

    public void display() 
    {
        System.out.println("Book Name : " + name + "\nPrice :" + price);
    }
}
public class BookInfo 
{
    public static void main(String args[])
    {
        Book obj = new Book("Java", 400);
        obj.display();
    }
}
