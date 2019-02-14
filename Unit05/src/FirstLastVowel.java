//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		a = a.toUpperCase();
		String vowels = "AEIOU";
	   
	   if (vowels.contains(a.substring(0,1))||vowels.contains(a.substring(a.length()-1))) {
		   return "yes";
	   }
	   
	   return "no";
	}
}