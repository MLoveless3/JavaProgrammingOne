package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate your full total after reading the subtotal and gratuity
 * rate
 *
 * @author Mickey Loveless II
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal and gratuity rate --> ");
        double subTotal = input.nextDouble();
        double rate = input.nextDouble() / 100.0;

        double gratuity = subTotal * rate;
        double finalTotal = subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + ". Making your final total $" + finalTotal + ".");
    }
}
