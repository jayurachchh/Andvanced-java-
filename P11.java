import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=P11 height="400" width="300" ></applet>*/
public class P11 extends Frame implements WindowListener
{
	P11()
	{
		setVisible(true);
		setSize(300,200);
		Label l=new Label("Hello java form java window");
		add(l);
		
//  addWindowListener(new WindowAdapter(){
		
		// 	public void windowClosing(WindowEvent we)
		// 	{
		// 		dispose();
		// 		System.out.println("Window is closed");
		// 	}

		// });
		
		addWindowListener(this);
	}
		public void windowClosing(WindowEvent we)
		{
			dispose();
			System.out.println("Window is closed");
		}
		public void windowOpened(WindowEvent we)
		{
			
		}
		public void windowClosed(WindowEvent we)
		{
			
		}
		public void windowActivated(WindowEvent we)
		{
			
		}

		public void windowDeactivated(WindowEvent we)
		{
			
		}
		public void windowIconified(WindowEvent we)
		{
			
		}

		public void windowDeiconified(WindowEvent we)
		{
			
		}
	
 public static void main(String[] args)
 {
 	new P11();
 }
}