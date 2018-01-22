package Chapter7;

import java.util.Scanner;

/**
 * Program to average an array of entered numbers
 *
 * @author Mickey Loveless II
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the array --> ");
        int[] list = new int[input.nextInt()];

        fill(list);

        System.out.println("The average is " + average(list));

        show(list);
    }

    /**
     * fill
     *
     * @param arr the array to fill
     */
    public static void fill(int[] arr) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your numbers --> ");
        for (int x = 0; x < arr.length; ++x) {
            arr[x] = input.nextInt();
        }
    }

    /**
     * average
     *
     * @param arr the array to be averaged
     * @return a double of the average of the array
     */
    public static double average(int[] arr) {
        double sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return (double) (sum / arr.length);
    }

    /**
     * show
     *
     * @param arr the array to show
     */
    public static void show(int[] arr) {
        System.out.print("The whole array is ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
