//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,5,5,10);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 5, 5, 10);
	}

	public Ammo(int x, int y, int w, int h, int s)
	{
		setX(x);
		setY(y);
		setSpeed(s);
		setWidth(w);
		setHeight(h);
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		if (direction.equals("UP"))
		   {
			   setY(getY()-getSpeed());
		   }
		   else if (direction.equals("DOWN"))
		   {
			   setY(getY()+getSpeed());
		   }
		   else if (direction.equals("LEFT"))
		   {
			   setX(getX()-getSpeed());
		   }
		   else if (direction.equals("RIGHT")) 
		   {
			   setX(getX()+getSpeed());
		   }
	}

	public String toString()
	{
		return "";
	}
}