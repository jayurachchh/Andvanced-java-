import java.awt.event.*;
import java.awt.*;
public class P16 extends Frame implements MouseListener 
{
		P16()
		{
			setVisible(true);
			setSize(300,400);
			Button B1=new Button("Click Me");
			add(B1);
			B1.addMouseListener(this);
		}
		public static void main(String[] args) 
		{
			new P16();		
		}
		public void mouseClicked(MouseEvent m)
		{
			System.out.println("Mouse Clicked");
		}
		public void mouseExited(MouseEvent m)
		{
			System.out.println("Mouse Exited");	
		}
		public void mouseReleased(MouseEvent m)
		{
			System.out.println("Mouse Released");
		}
		public void mouseEntered(MouseEvent m)
		{
			System.out.println("Mouse Entered");
		}
		public void mousePressed(MouseEvent m)
		{
			System.out.println("Mouse Pressed");
		}
}