package ObjectClasses;

public class Division
{
    int amount = 70;
    int price = 15;
    int sub = amount % price;
    public void Total()
    {
        System.out.println("This sub" + sub);
    }
}
