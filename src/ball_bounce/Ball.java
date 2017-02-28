package ball_bounce;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x = 250, y = 250;
	private int xVelocity = -8 , yVelocity = 8;
	private int size = 30;
	private int speed = 8;
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		if(x < 0){
			xVelocity = speed;
			
		}
		else if(x + size > 500){
			xVelocity = -speed;
		}
		
		if(y < 0){
			yVelocity = speed;
		}
		else if (y + size > 500){
			yVelocity = -speed;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(x, y, size, size);
	}
}

