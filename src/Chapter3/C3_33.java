package Chapter3;

import java.util.Scanner;

/**
 * Program to determine which is the better deal out of two packages given a
 * weight and price from the user
 *
 * @author Mickey Loveless II
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the weight and price of the first package --> ");
        double weightOne = input.nextDouble();
        double priceOne = input.nextDouble();

        System.out.print("Please enter the weight and price of the second package -->");
        double weightTwo = input.nextDouble();
        double priceTwo = input.nextDouble();

        double totalOne = weightOne / priceOne;
        double totalTwo = weightTwo / priceTwo;

        if (totalOne < totalTwo) {
            System.out.println("Package one is the better deal.");
        } else {
            System.out.println("Package two is the better deal.");
        }
    }
}
