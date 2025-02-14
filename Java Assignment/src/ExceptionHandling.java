import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        do {
            System.out.print("\nEnter the index for element :- ");
            int i=sc.nextInt();
            System.out.print("Enter the divisor :- ");
            int n=sc.nextInt();
            try {

                int[] numbers = {10, 20, 30};
                int result = numbers[i] / n; // This will cause an exception
                System.out.println("Result :- "+result);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds. " + e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("General Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Finally block executed: Cleanup operations if needed.");
                System.out.print("Want to try again ? (0/1) :- ");
                ch=sc.nextInt();

            }
        }while(ch!=0);
    }
}
