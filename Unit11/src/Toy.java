//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		setCount(0);
		setName("");
	}

	public Toy( String nm )
	{
		setName(nm);
		if(!nm.equals("")) setCount(1);
		
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return this.getName() + " " + this.getCount();
	}
}