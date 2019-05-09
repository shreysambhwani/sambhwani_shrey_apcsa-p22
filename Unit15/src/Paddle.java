//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	 super(10,10);
     speed = 5;
   }
   //add the other Paddle constructors
   public Paddle(int x,int y) {
	  super(x,y);
	  speed = 5;
   }
   public Paddle(int x, int y,int nSpeed) {
	   super(x,y);
	   speed = nSpeed;
   }
   public Paddle(int x, int y,int width,int height) {
	   super(x,y,width,height);
	   speed = 5;
   }
   public Paddle(int x, int y,int width,int height,Color color) {
	   super(x,y,width,height,color);
	   speed = 5;
   }
   public Paddle(int x, int y,int width,int height,int nSpeed) {
	   super(x,y,width,height);
	   speed = nSpeed;
   }
   public Paddle(int x, int y,int width,int height,Color color,int nSpeed) {
	   super(x,y,width,height,color);
	   speed = nSpeed;
   }

   public void setSpeed(int newS) {
	   speed = newS;
   }
	   
  
   public void moveUpAndDraw(Graphics window)
   {
	   setY(getY() + speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY() - speed);
	   draw(window);

   }
   public void moveLeftAndDraw(Graphics window) {
	   setX(getX() -speed);
	   draw(window);
   }
   public void moveRightAndDraw(Graphics window) {
	   setX(getX() + speed);
	   draw(window);
   }
   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	return getX() + "," + getY() + "," +  getWidth() + ","  + getHeight() + "," + getColor().toString() + "," + speed;
	   
   }
}
