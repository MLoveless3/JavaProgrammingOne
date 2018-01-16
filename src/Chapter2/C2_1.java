package Chapter2;

import java.util.Scanner;

/**
 * Program to convert an entered temperature in celsius to farenheight
 *
 * @author Mickey Loveless II
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature in Celsius --> ");
        double celsius = input.nextDouble();

        double farenheight = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + "is " + farenheight + " in farengeight.");
    }

}
