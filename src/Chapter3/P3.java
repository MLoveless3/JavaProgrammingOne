package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two numbers read from the user
 *
 * @author Mickey Loveless II
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter two positive numbers --> "); //Getting both numbers
        double numOne = input.nextDouble();
        double numTwo = input.nextDouble();

        if (numOne < numTwo) //Checking if one is less than two
        {
            System.out.println("The first number is less than the second.");
        }

        if (numOne > numTwo) //Checking if one is more than two
        {
            System.out.println("The first number is greater than the second.");
        }

        if (numOne == numTwo) //Checking if one is equal to two
        {
            System.out.println("The first number is equal to the second.");
        }

        if (numOne <= numTwo) //Checking if one is less than or equal to two
        {
            System.out.println("The first number is less than or equal to the second.");
        }

        if (numOne != numTwo) //Checking if one is not equal to two
        {
            System.out.println("The first number is not equal to the second.");
        }

        if (numTwo != 0) //Checking if two is not zero and is dividable
        {
            if ((numOne / numTwo) < 1)//Checking if one divided by two is less than one
            {
                System.out.println("Proper fraction.");
            } else //If it isn't les than one then it isnt a proper fraction
            {
                System.out.println("Improper fraction.");
            }
        } else //If it isn't dividable then display that it isnt dividable
        {
            System.out.println("Cannot divide by zero.");
        }

        if (numOne >= 90) //Finding the number if it were a grade
        {
            System.out.println("A");
        } else if (numOne >= 80) {
            System.out.println("B");
        } else if (numOne >= 70) {
            System.out.println("C");
        } else if (numOne >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((numTwo >= 1) && (numTwo <= 100)) //Checking if it is in range
        {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}
