package Chapter8;

import java.util.Scanner;

/**
 * Program to fill in the sales of four salesman
 *
 * @author Mickey Loveless II
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[4][5];
        int personIndex = 0, dayIndex = 0;
        double total = 0;
        char response;

        do {
            System.out.print("Enter Salesman ID(A,B,C,D) --> ");
            String sSalesPerson = input.next().toUpperCase();
            char salesPerson = sSalesPerson.charAt(0);
            personIndex = indexFinder(salesPerson, sales);

            while (personIndex == -1) {
                System.out.print("Invalid Salesman ID.");
                System.out.print("Renter Salesman ID(A,B,C,D) --> ");
                sSalesPerson = input.next().toUpperCase();
                salesPerson = sSalesPerson.charAt(0);
                personIndex = indexFinder(salesPerson, sales);
            }

            System.out.print("Enter The Day(M,T,W,H,F) --> ");
            String sDay = input.next().toLowerCase();
            char day = sDay.charAt(0);
            dayIndex = indexFinder(day, sales);

            while (dayIndex == -1) {
                System.out.print("Invalid Day.");
                System.out.print("Renter The Day(M,T,W,H,F) --> ");
                sDay = input.next().toLowerCase();
                day = sDay.charAt(0);
                dayIndex = indexFinder(day, sales);
            }

            System.out.print("Please enter amount --> ");
            sales[personIndex][dayIndex] = input.nextDouble();

            System.out.print("Are there more sales(Y or N) --> ");
            String sResponse = input.next().toUpperCase();
            response = sResponse.charAt(0);

            while (response != 'Y' && response != 'N') {
                System.out.println("Invalid continue code.");
                System.out.print("Are there more sales(Y or N) --> ");
                sResponse = input.next().toUpperCase();
                response = sResponse.charAt(0);
            }

        } while (response != 'N');

        System.out.println("Salesman\t  M\t T\t W\t H\t F");
        for (int x = 0; x < sales.length; ++x) {
            switch (x) {
                case 0:
                    System.out.print("\nA\t");
                    break;
                case 1:
                    System.out.print("\nB\t");
                    break;
                case 2:
                    System.out.print("\nC\t");
                    break;
                case 3:
                    System.out.print("\nD\t");
                    break;
                default: ;
                    break;
            }
            for (int y = 0; y < sales[x].length; ++y) {
                System.out.print("\t" + sales[x][y]);
            }
        }

        for (int x = 0; x < sales.length; ++x) {
            for (int y = 0; y < sales[x].length; ++y) {
                total += sales[x][y];
            }
        }

        System.out.printf("\nThe total of all sales is %d", total);
    }

    /**
     * indexFinder
     *
     * @param cIndex the index of where to put the sales amount
     * @param sales the array to fill
     * @return returns the place to put the sales amount
     */
    public static int indexFinder(char cIndex, double[][] sales) {
        int index = -1;

        switch (cIndex) {
            case 'A':
                index = 0;
                break;
            case 'B':
                index = 1;
                break;
            case 'C':
                index = 2;
                break;
            case 'D':
                index = 3;
                break;
            case 'm':
                index = 0;
                break;
            case 't':
                index = 1;
                break;
            case 'w':
                index = 2;
                break;
            case 'h':
                index = 3;
                break;
            case 'f':
                index = 4;
                break;
            default:
                index = -1;
                break;
        }

        return index;
    }
}
