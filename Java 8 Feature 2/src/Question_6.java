import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter 1st Date (DD/MM/YYYY):- ");
        LocalDate firstDate = LocalDate.parse(sc.nextLine(),dateFormatter);

        System.out.print("Enter 2nd Date (DD/MM/YYYY):- ");
        LocalDate secondDate = LocalDate.parse(sc.nextLine(),dateFormatter);

        if(firstDate.isBefore(secondDate))
            System.out.println("1st Date is before the 2nd Date");
        else
            System.out.println("1st Date is after the 2nd Date");

//        System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime UKTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime JapanTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("India Current Time :- "+IndiaTime);
        System.out.println("UK Current Time :- "+UKTime);
        System.out.println("Japan Current Time :- "+JapanTime);

    }
}
