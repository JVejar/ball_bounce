package ball_bounce;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x = 250, y = 250;
	private int xVelocity = -1 , yVelocity = 0;
	
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 30, 30);
	}
}
