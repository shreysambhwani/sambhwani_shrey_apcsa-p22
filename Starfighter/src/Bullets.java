//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Bullets
{
	private List<Ammo> ammo;
	private boolean canmove = true;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i< ammo.size(); i++)
		{
			ammo.get(i).draw(window);
		}
	}
	
	public int getSize()
	{
		return ammo.size();
	}

	public void moveEmAll()
	{
		if(canmove)
		{
			canmove = false;
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override 
				public void run()
				{
					canmove = true;
					timer.cancel();
				}
			}, 10);
			for (int i=0; i<ammo.size(); i++)
			{
				ammo.get(i).move("UP");
			}
		}
	}

	public void cleanEmUp()
	{
		for (int i=0; i<ammo.size(); i++)
		{
			if (ammo.get(i).getX()<=ammo.get(i).getSpeed())
			{
				ammo.remove(i);
				i--;
			}
		}
	}
	
	public void clear()
	{
		ammo=new ArrayList<Ammo>();
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}