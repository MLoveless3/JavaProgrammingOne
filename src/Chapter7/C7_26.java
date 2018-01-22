package Chapter7;

import java.util.Scanner;

/**
 * Program to see if two arrays are strictly identical
 *
 * @author Mickey Loveless II
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some numbers --> ");
        int[] array1 = new int[input.nextInt()];
        for (int x = 0; x < array1.length; ++x) {
            array1[x] = input.nextInt();
        }
        System.out.print("Please enter some numbers --> ");
        int[] array2 = new int[input.nextInt()];
        for (int x = 0; x < array2.length; ++x) {
            array2[x] = input.nextInt();
        }
        if (identical(array1, array2)) {
            System.out.println("The two lists are strictly identical.");
        } else {
            System.out.println("The two lists aren't strictly identical.");
        }
    }

    /**
     * identical
     *
     * @param ar1 the first array
     * @param ar2 the second array
     * @return a boolean variable of whether they are or are not strictly
     * identical
     */
    public static boolean identical(int[] ar1, int[] ar2) {
        return java.util.Arrays.equals(ar1, ar2);
    }
}
