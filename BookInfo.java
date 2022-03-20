class Book 
{
    int price;
    String name;

    public Book() 
    {
        name = null;
        price = 0;
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
        Book obj = new Book();
        obj.display();
    }
}
