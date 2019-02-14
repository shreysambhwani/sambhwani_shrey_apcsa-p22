//(c) A+ Computer Science
//www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a word :: ");
		String word = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven(word);
		System.out.println(test.toString());
		
	}
}