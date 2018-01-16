package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string obtained from the user
 *
 * @author Mickey Loveless II
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a String --> ");
        String user = input.next();

        System.out.printf("%s reversed is %s.", user, (new StringBuffer(user).reverse().toString()));
    }

}
