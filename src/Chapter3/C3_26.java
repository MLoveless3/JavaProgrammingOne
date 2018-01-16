package Chapter3;

import java.util.Scanner;

/**
 * Program to display whether a read in number is divisible by 5 and 6, 5 or 6,
 * or 5 or 6 but not both
 *
 * @author Mickey Loveless II
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter any whole number --> ");

        int user = input.nextInt();

        if (((user % 5) == 0.0) && ((user % 6) == 0.0)) {
            System.out.println("Is " + user + " divisible by 5 & 6? Yes");
        } else {
            System.out.println("Is " + user + " divisible by 5 & 6? No");
        }

        if (((user % 5) == 0.0) || ((user % 6) == 0.0)) {
            System.out.println("Is " + user + " divisible by 5 or 6? Yes");
        } else {
            System.out.println("Is " + user + " divisible by 5 or 6? No");
        }

        if (((user % 5) == 0.0) && ((user % 6) == 0.0) ^ ((user % 5) == 0.0) || ((user % 6) == 0.0)) {
            System.out.println("Is " + user + " divisible by 5 or 6, but not both? Yes");
        } else {
            System.out.println("Is " + user + " divisible by 5 or 6, but not both? No");
        }
    }
}
