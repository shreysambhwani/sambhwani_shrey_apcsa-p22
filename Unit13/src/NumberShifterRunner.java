
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		int len = (int)(Math.random() * 20) + 1;
		
		int[] arr = NumberShifter.makeLucky7Array(len);
		
		System.out.println(Arrays.toString(arr));
		
		NumberShifter.shiftEm(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}

