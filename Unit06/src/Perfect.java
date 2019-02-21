//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int num) {
	   setNumber(num);
   }
	
   
   public void setNumber(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		
		int sum = 0;
		
		for (int x = 1; x < number; x++) {
			if (number%x == 0) {
				sum = sum + x;
			}
		}
		
		//if sum equals num return true
		if (sum == number) {
			return true;
		}

		return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect";
		}
		
		return number + " is not perfect";
		
	}
}