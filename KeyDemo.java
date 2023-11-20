import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener {
	TextField tf,tf1;
	KeyDemo() {
		tf = new TextField(20);
		tf1 = new TextField(20);
		setTitle("KeyEvent Demo");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 200);
		add(tf);
		add(tf1);
		tf.addKeyListener(this);
		addKeyListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyDemo();	
	}
	
	public void keyPressed(KeyEvent ke) {
		System.out.println(ke.getKeyChar() + " is Pressed...");
	}
	
	public void keyReleased(KeyEvent ke) {
		System.out.println(ke.getKeyChar() + " is Released...");
	}
	
	public void keyTyped(KeyEvent ke) {
		System.out.println(ke.getKeyChar() + " is Typed...");
	}
}