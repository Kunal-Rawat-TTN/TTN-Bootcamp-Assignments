import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();

        System.out.print("Enter text (type XDONE to finish): ");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("XDONE")) {
                break;
            }
            inputText.append(input).append("\n");
        }

        System.out.println("You entered:\n" + inputText);
    }

}
