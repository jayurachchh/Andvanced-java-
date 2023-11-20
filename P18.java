import java.awt.*;
import java.awt.event.*;
public class P18 extends Frame implements WindowListener 
{
	P18()
	{
		setVisible(true);
		setSize(300,400);
		addWindowListener(this);
	}	
	public static void main(String[] args) 
	{
		new P18();	
	}
			public void windowClosing(WindowEvent we)
		{
			dispose();
			System.out.println("Window is closed");
		}
		public void windowOpened(WindowEvent we)
		{
			System.out.println("Window Opened");
		}
		public void windowClosed(WindowEvent we)
		{
			System.out.println("Window Closed");
		}
		public void windowActivated(WindowEvent we)
		{
			System.out.println("Window Activeted");
		}

		public void windowDeactivated(WindowEvent we)
		{
			System.out.println("Window Deactivated");
		}
		public void windowIconified(WindowEvent we)
		{
			System.out.println("Window Iconified");
		}

		public void windowDeiconified(WindowEvent we)
		{
			System.out.println("Window Deiconified");
		}
	
}