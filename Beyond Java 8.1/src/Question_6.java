import java.util.Scanner;
enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}
public class Question_6 {
    static String processOrderStatus(OrderStatus orderStatusValue)
    {
        return switch (orderStatusValue)
        {
            case PENDING-> {
                System.out.println("This statement is just used to show yield as per the question ");
                yield  "Order is awaiting confirmation.";
            }
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED ->"Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED ->"Refund has been issued for the order.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the status :- ");
        OrderStatus orderStatusValue= OrderStatus.valueOf(sc.nextLine().toUpperCase());
        String orderStatusMessage=processOrderStatus(orderStatusValue);
        System.out.println(orderStatusMessage);
    }
}
