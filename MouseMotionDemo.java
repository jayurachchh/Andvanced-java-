import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Frame implements MouseMotionListener,MouseListener {
	Label l;
	int x;
	int y;
	MouseMotionDemo() {
		l = new Label("Label");
		setTitle("MouseEvent Motion Demo");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(300, 200);
		add(l);
		addMouseMotionListener(this);
		addMouseListener(this);
		l.addMouseListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseMotionDemo();	
	}
	
	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		l.setText("Mouse Moving, X: " + x + ", Y: " + y);
	}
	
	public void mouseDragged(MouseEvent me) {
		System.out.println("Mouse Draged");
	}
	public void mouseClicked(MouseEvent me) {
		System.out.println("Mouse Clicked");
	}
	
	public void mouseReleased(MouseEvent me) {
		System.out.println("Mouse Released");
	}
	
	public void mousePressed(MouseEvent me) {
		System.out.println("Mouse Pressed");
	}
	
	public void mouseEntered(MouseEvent me) {
		if(me.getSource()==l)
		{
			System.out.println("Mouse Entered in Label");
		}	
		else
		{
			System.out.println("Mouse Entered in Frame");
		}
	}
	
	public void mouseExited(MouseEvent me) {
		if(me.getSource()==l)
		{
			System.out.println("Mouse Exited in Label");
		}	
		else
		{
			System.out.println("Mouse Exited in Frame");
		}
	}
}