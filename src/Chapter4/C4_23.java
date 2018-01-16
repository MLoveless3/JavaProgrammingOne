package Chapter4;

import java.util.Scanner;

/**
 * Program to calculate the pay and taxes of a given employee
 *
 * @author Mickey Loveless II
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter name --> ");
        String name = input.next();

        System.out.print("Please enter hours worked --> ");
        double hoursWorked = input.nextDouble();

        System.out.print("Please enter hourly payrate --> ");
        double payRate = input.nextDouble();

        System.out.print("Please enter federal withholding rate --> ");
        double fedWithTax = input.nextDouble();

        System.out.print("Please enter state witholding rate --> ");
        double staWithTax = input.nextDouble();

        double grossPay = payRate * hoursWorked;
        double fedTax = fedWithTax * grossPay;
        double stateTax = staWithTax * grossPay;

        System.out.printf("\nEmployee Name: %s", name);

        System.out.printf("\nHours Worked: %.2f", hoursWorked);

        System.out.printf("\nHourly Pay Rate: %.2f", payRate);

        System.out.printf("\nGross Pay: %.2f", grossPay);

        System.out.printf("\nDeductions: ");
        System.out.printf("\n\t Federal Withholding (%.2f): %.2f", (fedWithTax * 100), fedTax);
        System.out.printf("\n\t State Withholding (%.2f): %.2f", (staWithTax * 100), stateTax);
        System.out.printf("\n\t Total Deductions: %.2f", (stateTax + fedTax));
        System.out.printf("\n Net Pay: %.2f", grossPay - (stateTax + fedTax));
    }
}
