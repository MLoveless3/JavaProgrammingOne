package Chapter4;

import java.util.Scanner;

/**
 * Program to display the grade and major of a student
 *
 * @author Mickey Loveless II
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters (the first for major and the second for year --> ");
        String sInput = input.next().toUpperCase();

        char major = sInput.charAt(0);
        char status = sInput.charAt(1);

        if (status != '1' && status != '2' && status != '3' && status != '4') {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        switch (major) {
            case 'M':
                System.out.print("Mathematics ");
                break;

            case 'C':
                System.out.print("Computer Science ");
                break;

            case 'I':
                System.out.print("Information Technology ");
                break;

            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }

        switch (status) {
            case '1':
                System.out.print("Freshman");
                break;

            case '2':
                System.out.print("Sophmore");
                break;

            case '3':
                System.out.print("Junior");
                break;

            case '4':
                System.out.print("Senior");
                break;
        }
    }
}
