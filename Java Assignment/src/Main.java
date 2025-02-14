import java.util.Scanner;
// import Math.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public double area()
    {
        System.out.print("Enter the radius :- ");
        double radius= sc.nextDouble();
        return radius*radius*Math.PI;
    }
    public static double cir()
    {
        System.out.print("Enter the radius :- ");
        double radius= sc.nextDouble();
        return 2*radius*Math.PI;
    }
    public static void main(String[] args) {

        Main main = new Main();

        int ch=0;
        do
        {
            System.out.println("\n\n******* Menu *******\n");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            System.out.print("Choose an option (1-3): ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Area of circle :- "+ main.area());
                    break;
                case 2:
                    System.out.println("Circumference of circle :- "+ cir());
                    break;
                case 3:
                    System.out.println("Exited Menu");
                    break;
                default:
                    System.out.println("Wrong Choice !! Try Again !!");
            }
        }while(ch!=3);
    }
}