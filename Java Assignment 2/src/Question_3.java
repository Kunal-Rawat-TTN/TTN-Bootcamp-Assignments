import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine().trim();

        System.out.print("Enter word to find: ");
        String wordToFind = sc.nextLine();

        String line;
        int count = 0;

        try
        {
            FileReader file = new FileReader(fileName);
            BufferedReader br = new BufferedReader(file);
            while ((line = br.readLine()) != null)
            {
                String words[] = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Number of words present : " + count);

    }
}

