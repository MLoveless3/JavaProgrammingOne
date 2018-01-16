package Chapter5;

import java.util.Scanner;

/**
 * Program to tally up votes
 *
 * @author Mickey Loveless II
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesCounter = 0, noCounter = 0;

        System.out.print("Enter y to vote yes, n to vote no, or q to quit voting --> ");
        String sChoice = input.next().toUpperCase();

        char choice = sChoice.charAt(0);

        while (choice != 'Q') {
            if (choice == 'Y') {
                yesCounter++;
            } else if (choice == 'N') {
                noCounter++;
            } else if (choice != 'Q' && choice != 'Y' && choice != 'N') {
                System.out.print("INVALID CODE: Enter y to vote yes, n to vote no, or q to quit voting --> ");
                sChoice = input.next().toUpperCase();

                choice = sChoice.charAt(0);
            }

            System.out.print("Enter y to vote yes, n to vote no, or q to quit voting --> ");
            sChoice = input.next().toUpperCase();

            choice = sChoice.charAt(0);

        }

        System.out.printf("\tYou have %d yes's.", yesCounter);
        System.out.printf("\n\tYou have %d no's.", noCounter);
    }
}
