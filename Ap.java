import java.awt.*;
import java.applet.*;
/* <applet code="Ap" height="200" width="300" > </applet> */
public class Ap extends Applet
{
	Frame f;
	Canvas c;
	public void init()
	{
		f = new Frame("Frame Window");
		f.setSize(800,800);
		f.setVisible(true);
		//f.fillOval(75,10,150,75);
		//f.setBackground(Color.yellow);
		c=new Canvas();
		c.setSize(20,30);
		add(c);
		c.setVisible(true);
		//c.fillOval(75,10,150,75);

	}

	public void paint(Graphics g)
	{
		g.drawString("This is Applet",15,20);
		//g.fillOval(75,10,150,75);

	}


}