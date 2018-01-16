package Chapter3;

import java.util.Scanner;

/**
 * Program to play heads or tails
 *
 * @author Mickey Loveless II
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Heads or Tails!!");
        System.out.println("A 0 is heads and a 1 is tails.");
        System.out.print("Please enter your guess. Either a 0 or 1 --> ");

        int guess = input.nextInt();

        int coin = (int) (Math.random() * 2);

        if (guess == coin) {
            System.out.println("You were right!!");
        } else {
            System.out.println("You were wrong.");
        }
    }

}
