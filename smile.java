import java.awt.*;
import java.applet.*;
/*<applet code="smile" width="1000" height="1000"></applet>*/
public class smile extends Applet{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(100,20,250,250);
		g.setColor(Color.black);
		g.fillOval(160,80,35,35);
		g.setColor(Color.black);
		g.fillOval(260,80,35,35);
		g.fillArc(180,120,100,100,180,180);
			
	}
}
