package Chapter6;

import java.util.Scanner;

/**
 *Program to check for a valid password
 * 
 * @author Mickey Loveless II
 */
public class C6_18 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a password --> ");
		String password = input.next();
		
		if(Check(password))
		{
			System.out.println("VALID");
		}
		else
		{
			System.out.println("INVALID");
		}
	}
    
    /**
     * Check
     * 
     * @param pw the password to be checking
     * @return a boolean of if the password entered is valid
     */
	public static boolean Check(String pw)
	{
		boolean isGood = false, length = false, lettersDigs = false, twoDigs = false;
		int counter = 0;
		
		if(pw.length() >= 8)
		{
			length = true;
		}
		else
		{
			System.out.println("Password must have at least eight characters");
		}
		for(int x = 0; x < pw.length(); ++x)
		{
			if(Character.isLetterOrDigit(pw.charAt(x)))
			{
				counter++;
			}
		}
		if(counter >= pw.length())
		{
			lettersDigs = true;
			counter = 0;
		}
		if(!lettersDigs)
		{
			System.out.println("Password must be only letters and digits");
		}
		for(int x = 0; x < pw.length(); ++x)
		{
			if(Character.isDigit(pw.charAt(x)))
			{
				counter++;
			}
		}
		if(counter >= 2)
		{
			twoDigs = true;
		}
		else
		{
			System.out.println("Password must have at least two digits");
		}
		if(length && lettersDigs && twoDigs)
		{
			isGood = true;
		}
		return isGood;
	}
}
