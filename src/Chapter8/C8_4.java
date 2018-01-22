package Chapter8;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to display find the sum of the work hours of seven employees after a
 * week
 *
 * @author Mickey Loveless II
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] workHours = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 8, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9}};

        int[] sums = addRows(workHours);
        System.out.println("             Su   M    T    W    Th   F   Sa   Total");
        for (int x = 0; x < workHours.length; ++x) {
            System.out.printf("\nEmployee %d %s %d", x + 1, Arrays.toString(workHours[x]), sums[x]);
        }
    }

    /**
     * addRows
     *
     * @param hours the array of employee hours
     * @return and array of the sums
     */
    public static int[] addRows(double[][] hours) {
        int[] sumArray = new int[8];
        for (int x = 0; x < sumArray.length; ++x) {
            for (int y = 0; y < hours[x].length; ++y) {
                sumArray[x] += hours[x][y];
            }
        }
        return sumArray;
    }
}
