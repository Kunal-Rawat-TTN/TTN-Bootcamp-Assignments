import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
class User
{
    String firstName;
    String lastName;
    int age;
    long phoneNumber;

    public User(String firstName, String lastName, int age, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User Details\n\nFirst Name :- "+firstName+"\nLast Name :- "+lastName+"\nAge :- "+age+"\nPhone Number :- "+phoneNumber+"\n\n";
    }
}

public class Question_2
{
    public static void userSave(User user)
    {
        try (FileWriter fileWriter = new FileWriter("userDetail.txt", true)) {
            fileWriter.write(user.toString() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ch="";
        do {
            //Inputting First Name
            System.out.print("\nEnter First Name: ");
            String firstName = sc.nextLine();

            //Inputting Last Name
            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            //Inputting Age
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            //Inputting Phone Number
            System.out.print("Enter Phone Number: ");
            long phoneNumber = sc.nextLong();
            sc.nextLine(); //wasn't able to take QUIT input
            User user = new User(firstName,lastName, age, phoneNumber);

            userSave(user);

            System.out.print("\nDo you want to continue creating users? (Type QUIT to exit)");
            ch=sc.nextLine();
        }while(!ch.equals("QUIT"));
    }
}
