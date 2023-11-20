import java.awt.*;
import java.applet.*;
/*<applet code="ghar" width="1000" height="1000"></applet>*/
public class ghar extends Applet{
	public void paint(Graphics g)
	{  int x[]={235,200,270};
		int y[]={140,200,200};
		g.fillPolygon(x,y,3);
		g.drawLine(235,140,475,140);
		g.drawLine(475,140,500,200);
		g.drawRect(200,200,300,200);
		g.drawLine(270,200,270,400);
	
	}
}