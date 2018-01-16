package Chapter6;

import java.util.Scanner;

/**
 * Program to convert from one currency to another
 *
 * @author Mickey Loveless II
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollarAmount = 0.0, converted = 0.0;
        boolean conti = false;

        System.out.print("How many Euros wil a dollar buy --> ");
        double euros = input.nextDouble();
        System.out.print("How many Pound Sterling wil a dollar buy --> ");
        double poundSterling = input.nextDouble();
        System.out.print("How many Yen wil a dollar buy --> ");
        double yen = input.nextDouble();

        do {
            conti = false;

            System.out.print("Please enter the dollar amount you wish to convert --> ");
            dollarAmount = input.nextDouble();

            System.out.print("Please enter what you want to convert to (E for Euros, P for Pounds, and Y for Yen) --> ");
            String sInput = input.next().toUpperCase();
            char con = sInput.charAt(0);

            switch (con) {
                case 'E':
                    converted = Convert(dollarAmount, euros);
                    break;

                case 'P':
                    converted = Convert(dollarAmount, poundSterling);
                    break;

                case 'Y':
                    converted = Convert(dollarAmount, yen);
                    break;
            }

            switch (con) {
                case 'E':
                    System.out.printf("\nWith $%.2f you can get %.2f in Euros.\n", dollarAmount, converted);
                    break;

                case 'P':
                    System.out.printf("With $%.2f you can get %.2f in Pounds.\n", dollarAmount, converted);
                    break;

                case 'Y':
                    System.out.printf("With $%.2f you can get %.2f in Yen.\n", dollarAmount, converted);
                    break;
            }

            System.out.print("Are there more conversions(yes or no): ");
            String yayOrNay = input.next().toUpperCase();

            if (!(yayOrNay.contains("YES")) && !(yayOrNay.contains("NO"))) {
                while (!(yayOrNay.contains("YES")) && !(yayOrNay.contains("NO"))) {
                    System.out.print("Are there more conversions(yes or no): ");
                    yayOrNay = input.next().toUpperCase();

                    if (yayOrNay.contains("YES")) {
                        conti = true;
                    } else {
                        conti = false;
                    }
                }
            }

            if (yayOrNay.contains("YES")) {
                conti = true;
            } else if (yayOrNay.contains("NO")) {
                conti = false;
            }

        } while (conti);
    }

    /**
     * Convert
     *
     * @param dollar How much the user wants converted
     * @param type the type of currency they want to convert to
     * @return a double variable of how much they have in their desired currency
     */
    public static double Convert(double dollar, double type) {
        if (dollar > 100) {
            dollar = dollar - (dollar * 0.05);
        } else {
            dollar = dollar - (dollar * 0.10);
        }

        return (dollar * type);
    }
}
