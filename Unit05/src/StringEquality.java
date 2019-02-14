//(c) A+ Computer Science
//www.apluscompsci.com


import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one; 
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.compareTo(wordTwo)==0){
			return true;
		}

		return false;
	}

	public String toString()
	{
		if (checkEquality()) {
			return wordOne + " has the same letters as " + wordTwo;
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}