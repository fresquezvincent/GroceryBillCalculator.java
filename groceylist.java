import java.util.Scanner;



class GroceryBillCalculator {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        double coupon;

        double week1, week2, week3, week4;

        double monthlyTotal, weeklyAverage;

        double discountedMonthly, discountedWeekly;



        // Prompt for coupon amount

        System.out.print("Enter coupon amount as a decimal (example: .10): ");

        coupon = input.nextDouble();



        // Validate coupon value

        if (coupon <= 0 || coupon > 1) {

            coupon = 0.10;

            System.out.println("Invalid coupon entered. Coupon set to 10% by default.");

        }



        // Prompt for weekly grocery bills

        System.out.print("Enter grocery bill for week 1: ");

        week1 = input.nextDouble();



        System.out.print("Enter grocery bill for week 2: ");

        week2 = input.nextDouble();



        System.out.print("Enter grocery bill for week 3: ");

        week3 = input.nextDouble();



        System.out.print("Enter grocery bill for week 4: ");

        week4 = input.nextDouble();



        // Calculate totals and averages

        monthlyTotal = week1 + week2 + week3 + week4;

        weeklyAverage = monthlyTotal / 4;



        discountedMonthly = monthlyTotal - (monthlyTotal * coupon);

        discountedWeekly = discountedMonthly / 4;



        // Display results

        System.out.println("\n--- Grocery Bill Summary ---");

        System.out.printf("Monthly Total (No Coupon): $%.2f%n", monthlyTotal);

        System.out.printf("Weekly Average (No Coupon): $%.2f%n", weeklyAverage);



        System.out.println("\n--- With Coupon Applied ---");

        System.out.printf("Monthly Total (With Coupon): $%.2f%n", discountedMonthly);

        System.out.printf("Weekly Average (With Coupon): $%.2f%n", discountedWeekly);



        input.close();

    }

}

