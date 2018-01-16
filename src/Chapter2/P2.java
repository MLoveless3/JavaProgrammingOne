package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total cost of the meal after reading the cost of the
 *
 * @author Mickey Loveless II
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price of your drink --> ");
        double drinkAmount = input.nextDouble();

        System.out.print("Please enter the price of your meal --> ");
        double mealAmount = input.nextDouble();

        System.out.print("Please enter the price of your dessert --> ");
        double dessertAmount = input.nextDouble();

        double foodAmount = drinkAmount + mealAmount + dessertAmount;
        double tax = foodAmount * 0.10;
        double tip = (foodAmount + tax) * 0.15;
        double totalCost = foodAmount + tax + tip;

        System.out.println("Total food amount --> $" + foodAmount);
        System.out.println("Your tax is --> $" + tax);
        System.out.println("Your tip is --> $" + tip);
        System.out.println("Total cost is --> $" + totalCost);
    }
}
