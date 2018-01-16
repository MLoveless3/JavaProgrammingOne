package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, scissors against the computer
 *
 * @author Mickey Loveless II
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userScore = 0, compScore = 0, user, comp;

        while (userScore < (compScore + 2) || compScore > (userScore + 2)) {
            System.out.print("\n Please enter 0 for scissors, 1 for rock, or 2 for paper --> ");
            user = input.nextInt();

            comp = (int) (Math.random() * 3);

            System.out.println(comp);

            if (user > comp) {
                System.out.println("You win!!");
                userScore++;
                System.out.printf("\n Your Score: %d | Computer Score: %d", userScore, compScore);
            } else if (user < comp) {
                System.out.println("You lose.");
                compScore++;
                System.out.printf("Your Score: %d | Computer Score: %d", userScore, compScore);
            } else if (user == comp) {
                System.out.println("You Tie.");
                System.out.printf("Your Score: %d | Computer Score: %d", userScore, compScore);
            }
        }
    }
}
