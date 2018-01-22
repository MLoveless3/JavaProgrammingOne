package Chapter7;

import java.util.Scanner;

/**
 * Program to print out the grade of students in a class
 *
 * @author Mickey Loveless II
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int best = 0;
        System.out.print("Please enter number of students --> ");
        int[] grades = new int[input.nextInt()];
        System.out.printf("Please enter %d scores --> ", grades.length);
        for (int x = 0; x < grades.length; ++x) {
            grades[x] = input.nextInt();
        }
        for (int x : grades) {
            if (x > best) {
                best = x;
            }
        }

        for (int x = 0; x < grades.length; ++x) {
            String grade = getGrade(grades[x], best);
            System.out.printf("\nStudent %d is %d and grade is %s.", x, grades[x], grade);
        }
    }

    /**
     * getGrade
     *
     * @param grade the grade for the student entered by the user
     * @param best the highest grade in the class
     * @return a string variable of the letter grade
     */
    public static String getGrade(int grade, int best) {
        String sGrade = "";
        if (grade >= (best - 10)) {
            sGrade = "A";
        } else if (grade >= (best - 20)) {
            sGrade = "B";
        } else if (grade >= (best - 30)) {
            sGrade = "C";
        } else if (grade >= (best - 40)) {
            sGrade = "D";
        } else {
            sGrade = "F";
        }
        return sGrade;
    }
}
