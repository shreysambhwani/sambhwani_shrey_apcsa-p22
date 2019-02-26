//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;

		
			String player = "";
			do
			{
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			player = keyboard.nextLine();
		
			RockPaperScissors game = new RockPaperScissors(player);	
			out.println(game);
			response = keyboard.nextLine().charAt(0);
			}
			while(response == 'y');
	}
}


