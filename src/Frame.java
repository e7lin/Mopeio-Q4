import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;


public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	//declaring variables
	Random rnd = new Random();
	
	
	//creating objects and object arrays  (STEP 1)
	

	public void paint(Graphics g) { //The code under this method paints the objects
		super.paintComponent(g);
	


	}
	
	
	
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	public Frame() {
		//creating cactus objects with for loops, necessary for array of objects
		
		
		JFrame f = new JFrame("Mopeio");
		f.setSize(new Dimension(1000, 500));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
			System.out.println(arg0.getKeyCode());
			//arrow keys are used for moving pony up and down
			/*if(arg0.getKeyCode() == 38) {
				pony1.up();
			}
			if(arg0.getKeyCode() == 40) {
				pony1.down();
			}
			if(arg0.getKeyCode() == 72) { //press h to show hitboxes
				hitbox = !hitbox;
			}
			if(arg0.getKeyCode() == 83) { //press s to increase score by 10, for testing
				score+=10;
			}
			if(arg0.getKeyCode() == 82) { //press r to restart after losing
				reset(3);
				energy = 5;
				score = 0;
			}
			if(arg0.getKeyCode() == 80) { //does the same thing as r but score is set ot 0, should only be used at start of game
				reset(3);
				energy = 5;
				pause = false;
				score = 0;
			}*/
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
