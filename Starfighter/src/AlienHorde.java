//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int first = 30;
		for(int i = 0; i< size/2; i++)
		{
			aliens.add(new Alien(first, 0));
			first += 75;
		}
		int second = 30;
		for(int i = size/2; i< aliens.size(); i++) 
		{
			aliens.add(new Alien(second, 20));
			second += 75;
		}
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i< aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{

		for (int i=0; i<aliens.size(); i++)
		{
			Alien current=aliens.get(i);
			if (i==0 || aliens.get(i-1).getY()!=current.getY()
					|| current.getX()+aliens.get(i-1).getWidth()+50<aliens.get(i-1).getX()
					|| current.getX()>aliens.get(i-1).getX()+aliens.get(i-1).getWidth()+50)
			{
				if (current.getSpeed()>0 && current.getX()>=800-current.getWidth()-current.getSpeed()
						|| current.getSpeed()<0 && current.getX()<=-current.getSpeed())
				{
					current.setSpeed(-current.getSpeed());
					current.setY(current.getY()+current.getHeight());
				}
				else current.setX(current.getX()+current.getSpeed());
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i =0; i<shots.size(); i++)
		{
			Ammo shot = shots.get(i);
			for (int j=0; j<aliens.size(); j++)
			{
				Alien alien = aliens.get(j);
				if(shot.getX() < (alien.getX() + alien.getWidth() + Math.abs(shot.getSpeed()))
							&& shot.getX() >= (alien.getX() - shot.getWidth() - Math.abs(shot.getSpeed()))
							&& shot.getX()<=alien.getX()+alien.getWidth()
							&& shot.getY()<(alien.getY()+alien.getHeight())
							&& (shot.getY()+shot.getHeight())>alien.getY())
				{
					aliens.remove(j);
					shots.remove(i);
					j--;
					i--;
				}
			}
		}
	}
	
	public boolean touchingShip(Graphics window, Ship ship)
	{
		boolean touching = false;
		for (Alien al : aliens)
		{
			if ( ((ship.getX() >= al.getX() && ship.getX() <= al.getX()+30)
					|| (ship.getX()+50 >= al.getX() && ship.getX()+50 <= al.getX()+30))
					&& ((ship.getY()+25 >= al.getY() && ship.getY()+25 <= al.getY()+30)
					|| (al.getY() <= ship.getY() && ship.getY() <= al.getY()+30)) )
			{
				touching = true;
			}
		}
		return touching;
	}

	public String toString()
	{
		return "";
	}
}