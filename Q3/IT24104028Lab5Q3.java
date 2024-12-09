import java.util.Scanner;

public class IT24104028Lab5Q3 {
    
    private static final double ROOM_CHARGE_PER_DAY = 48000.0;
    private static final int DISCOUNT_FOR_3_4_DAYS = 10;
    private static final int DISCOUNT_FOR_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        
        int numberOfDays = endDate - startDate;

       
        int discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_FOR_3_4_DAYS;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_FOR_5_OR_MORE_DAYS;
        }

      
        double totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalCost * discountRate / 100.0;
        double amountToPay = totalCost - discountAmount;

       
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + amountToPay);
    }
}
