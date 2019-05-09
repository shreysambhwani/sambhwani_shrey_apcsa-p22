import java.awt.Color;
import java.awt.Graphics;
public class PongEx extends Block
{
	private int health;
	
	public PongEx() {
		super(20,20);
		setHealth(1);
	}
	public PongEx(int x, int y) {
		super(x,y);
		setHealth(1);
	}
	public PongEx(int x, int y, int Health) {
		super(x,y);
		setHealth(Health);
	}
	public PongEx(int x, int y, int width, int height) {
		super(x,y,width,height);
		setHealth(1);
	}
	public PongEx(int x, int y, int width, int height, int Health) {
		super(x,y,width,height);
		setHealth(Health);
	}
	public PongEx(int x, int y, int width, int height, Color color,int Health) {
		super(x,y,width,height,color);
		setHealth(Health);
	}
	
	public void getHit() {
		health--;
		checkIfDead();
	}
	public boolean checkIfDead() {
		if(health <= 0) {
			return true;
		} else {
			super.setColor(new Color(255,128,255));
			return false;
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int h) {
		health = h;
	}
	public void Draw(Graphics window) {
		   if(!checkIfDead())
			      draw(window);
	 }

	
}