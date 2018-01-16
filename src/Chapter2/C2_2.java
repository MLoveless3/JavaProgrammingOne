package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the area and volume of a cylinder with a radius that is
 * user entered
 *
 * @author Mickey Loveless II
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the cylinders Radius and Length --> ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = Math.pow(radius, 2) * PI;

        System.out.println("Your area is " + area);
        System.out.println("Your volume is " + (area * length));
    }

}
