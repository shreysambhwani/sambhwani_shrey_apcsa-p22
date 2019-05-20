 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private AlienHorde horde;
	private Bullets shots;
	private boolean gameOver;
	private boolean game = true;


	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(350,500,50,50,4);
		horde = new AlienHorde(50);
		shots = new Bullets();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		

		if(keys[0] == true && ship.getX()>ship.getSpeed())
		{
			ship.move("LEFT");
		}
		if (keys[1] == true && ship.getX()<(800-ship.getSpeed()-ship.getWidth()))
		{
			ship.move("RIGHT");
		}
		if (keys[2] == true && ship.getY()>ship.getSpeed())
		{
			ship.move("UP");
		}
		if (keys[3] == true && ship.getY()<(600-ship.getSpeed()-ship.getHeight()-20))
		{
			ship.move("DOWN");
		}
		if (keys[4] == true && !gameOver)
		{
			shots.add(new Ammo((ship.getX()+ship.getWidth()/2), ship.getY()-5, 5, 5, 5));
			keys[4]=false;
		}

		if (horde.getList().size()==0) 
		{
			gameOver=true;
			ship.setSpeed(0);
		}
		
		if (gameOver)
		{
			graphToBack.clearRect(0, 0, 800, 600);
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("YOU WON!", 350, 350);
		}
		
		if (horde.touchingShip(graphToBack, ship)) {
			game = false;
		}
		
		if (game == false)
		{
			graphToBack.clearRect(0, 0, 800, 600);
			//setBackground(Color.black);
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("YOU LOSE!", 350, 350);
		}
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

