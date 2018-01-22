package Chapter7;

import java.util.Scanner;

/**
 * Program to find the smallest number in an array
 *
 * @author Mickey Loveless II
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.print("Please enter ten numbers --> ");
        for (int x = 0; x < nums.length; ++x) {
            nums[x] = input.nextDouble();
        }
        System.out.println("The smalles number is: " + min(nums));
    }

    /**
     * min
     *
     * @param array the array of elements
     * @return a double of the smallest number in the array
     */
    public static double min(double[] array) {
        double minimum = array[0];
        for (double x : array) {
            if (x < minimum) {
                minimum = x;
            }
        }
        return minimum;
    }

}
