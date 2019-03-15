//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		do{
			System.out.println("Enter a word :: ");
			response = keyboard.nextLine();
			TriangleWord.printTriangle(response);
			
			System.out.println("Do you want to enter more sample output?");
			response = keyboard.nextLine();
		} while(response.equals("y"));
	}
}