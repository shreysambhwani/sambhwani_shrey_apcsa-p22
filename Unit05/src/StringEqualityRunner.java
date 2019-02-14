//(c) A+ Computer Science
//www.apluscompsci.com

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a word :: ");
		String wordOne = keyboard.nextLine();
		
		out.print("Enter another word :: ");
		String wordTwo = keyboard.nextLine();
		
		StringEquality test = new StringEquality(wordOne, wordTwo);
		test.checkEquality();
		System.out.println(test.toString());
		
	}
}