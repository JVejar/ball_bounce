package ball_bounce;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pong extends JFrame{
	
	public Pong(){
		setSize(507, 533);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new GamePanel());
		setVisible(true); 
	}
	
	public static void main(String[] args){
		new Pong();
	}
}
