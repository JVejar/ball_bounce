package ball_bounce;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	
	Ball ball = new Ball();
	
	public GamePanel(){
		Timer time = new Timer(50, this);
		time.start();
	}
	
	private void update(){
		ball.update();
	}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 500);
		
		ball.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}
}
