import java.awt.*;
import java.applet.*;
/* <applet code ="P9" height="200" width="300" > </applet> */
public class P9 extends Applet
{
	Frame f;
	public void init()
	{
		f = new Frame("Frame Window");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is Applet",15,20);
		//g.fillOval(75,10,150,75);

	}

}