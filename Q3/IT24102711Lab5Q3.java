import java.util.Scanner;

public class IT24102711Lab5Q3 {

        public static final double ROOM_CHARGE_PER_DAY = 48000.00;
        public static final int DISCOUNT_3_TO_4_DAYS = 10;
        public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the start date (1-31): ");
            int startDate = scanner.nextInt();
            System.out.print("Enter the end date (1-31): ");
            int endDate = scanner.nextInt();

            if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
                System.out.println("Error: Start date and end date must be between 1 and 31.");
                return;
            }

            if (startDate >= endDate) {
                System.out.println("Error: Start date should be less than the end date.");
                return;
            }

            int daysReserved = endDate - startDate;
            System.out.println("Number of days reserved: " + daysReserved);

            double discount = 0.0;
            if (daysReserved >= 3 && daysReserved <= 4) {
                discount = DISCOUNT_3_TO_4_DAYS;
            } else if (daysReserved >= 5) {
                discount = DISCOUNT_5_OR_MORE_DAYS;
            }

            double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
            double discountAmount = totalAmount * (discount / 100);
            totalAmount -= discountAmount;

            
            System.out.printf("Total amount to be paid after %.0f%% discount: Rs %.2f%n", discount, totalAmount);
        }
    

}