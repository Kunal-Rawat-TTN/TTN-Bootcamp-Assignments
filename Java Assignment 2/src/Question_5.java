abstract class Drinks
{
    abstract int getPrice();
}

class Coffee extends Drinks
{
    int getPrice()
    {
        return 100;
    }
}
class Tea extends Drinks
{
    int getPrice()
    {
        return 20;
    }
}
class ColdDrink extends Drinks
{
    int getPrice()
    {
        return 40;
    }
}

class Shop
{
    public static Drinks getDrinks(String type)
    {
        if(type.trim().equalsIgnoreCase("Coffee"))
        {
            return new Coffee();
        }
        else if(type.trim().equalsIgnoreCase("Tea"))
        {
            return new Tea();
        }
        else if(type.trim().equalsIgnoreCase("Cold Drink"))
        {
            return new ColdDrink();
        }
        else
            return null;
    }
}
public class Question_5 {
    public static void main(String[] args) {
        Drinks d1= Shop.getDrinks("Coffee");
        Drinks d2= Shop.getDrinks("Cold Drink");
        Drinks d3= Shop.getDrinks("Tea");
        System.out.println("Price of Tea :- "+d3.getPrice());
        System.out.println("Price of Cold Drink :- "+d2.getPrice());
        System.out.println("Price of Coffee :- "+d1.getPrice());
    }
}
