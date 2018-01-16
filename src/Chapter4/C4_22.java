package Chapter4;

import java.util.Scanner;

/**
 * Program to see if two strings read from the user and displays whether or not
 * the second string is a substring of the first
 *
 * @author Mickey Loveless II
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string --> ");
        String sOne = input.next();

        System.out.print("Enter the second string --> ");
        String sTwo = input.next();

        if (sOne.contains(sTwo)) {
            System.out.println(sTwo + " is a substring of " + sOne + ".");
        } else {
            System.out.println(sTwo + " isn't a substring of " + sOne + ".");
        }
    }
}
