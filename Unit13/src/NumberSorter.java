//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0)
		{
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		for(int i = 0; i < sorted.length; i++)
		{
			sorted[i] = number % 10;
			number /= 10;
		}
		
		//selection sort
		/*for(int i = 0; i < sorted.length; i++)
		{
			int min = i;
			for(int j = i + 1; j < sorted.length; j++)
			{
				if(sorted[j] < sorted[min]) min = j;
			}
			if(min != i)
			{
				int temp = sorted[min];
				sorted[min] = sorted[i];
				sorted[i] = temp;
			}
		}*/
		
		//insertion sort
		for(int i = 1; i < sorted.length; i++)
		{
			int j = i; 
			int val = sorted[i];
			while(j > 0 && val < sorted[j-1])
			{
				sorted[j] = sorted[j-1];
				j--;
			}
			sorted[j] = val;
		}
		return sorted;
	}
}