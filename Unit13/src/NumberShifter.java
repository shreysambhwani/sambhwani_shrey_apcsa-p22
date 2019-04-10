//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	static int[] arr;
	public static int[] makeLucky7Array( int size)
	{
		arr = new int[size];
		for(int i = 0; i < size; i++)
		{
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		return arr;
	}
	
	public static void shiftEm(int[] array)
	{
		//selection sort
		/*for(int i = 0; i < array.length-1; i++)
		{
			int seven = i;
			for(int j = i+1; j < array.length; j++)
			{
				if(array[j] == 7) seven = j;
			}
			if(seven != i)
			{
				int temp = array[i];
				array[i] = array[seven];
				array[seven] = temp;
			}
		}*/
		
		//insertion sort
		for(int i = 1; i < array.length; i++)
		{
			int val = array[i];
			int j = i;
			while(j > 0 && val == 7)
			{
				array[j] = array[j-1]; //shift other things back to make space
				j--;
			}
			array[j] = val; //insertion happens here
		}
	}
}