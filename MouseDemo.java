/*import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {
	MouseDemo() {
		setTitle("MouseEvent Demo");
		setSize(300, 200);
		addMouseListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseDemo();	
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
		System.out.println("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent me) {
		System.out.println("Mouse Exited");
	}
}*/

import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame 
{
	MouseDemo() {
		setTitle("MouseEvent Demo");
		setSize(300, 200);
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me) {
		System.out.println("Mouse Clicked");
	}
	});
		addWindowListener(new WindowAdapter(){
		public void windowIconified(WindowEvent we)
		{
			System.out.println("Window Minized");
		}
	});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseDemo();	
	}
	
	
	
}