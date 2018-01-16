package Chapter4;

import java.util.Scanner;

/**
 * Program to display the highest bidder after reading calculating the cost for
 * each bidder
 *
 * @author Mickey Loveless II
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first bidder --> ");
        String firstBid = input.next();

        System.out.print("Enter the hours needed --> ");
        int firstHours = (int) input.nextDouble();

        System.out.print("Enter the charge per hour --> $");
        double firstCPH = input.nextDouble();

        System.out.print("Enter the second bidder --> ");
        String secondBid = input.next();

        System.out.print("Enter the hours needed --> ");
        int secondHours = (int) input.nextDouble();

        System.out.print("Enter the charge per hour --> $");
        double secondCPH = input.nextDouble();

        double firstCost = firstHours * firstCPH;
        double secondCost = secondHours * secondCPH;

        if (firstCost < secondCost) {
            System.out.printf("\n The winner is %s with a total cost of $%.2f.", firstBid, firstCost);
        } else if (firstCost > secondCost) {
            System.out.printf("\n The winner is %s with a total cost of $%.2f.", secondBid, secondCost);
        } else if (firstCost == secondCost) {
            if (firstHours < secondHours) {
                System.out.printf("\n The winner is %s with a cost of $%.2f with %d hours.", firstBid, firstCost, firstHours);
            } else if (firstHours > secondHours) {
                System.out.printf("\n The winner is %s with a cost of $%.2f with %d hours.", secondBid, secondCost, secondHours);
            } else if (firstHours == secondHours) {
                System.out.printf("\n %s and %s have identical bids. With %d hours, $%.2f cost per hour, and $%.2f total cost.", firstBid, secondBid, firstHours, firstCPH, firstCost);
            }
        }
    }
}
