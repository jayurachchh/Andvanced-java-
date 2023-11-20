import java.awt.*;
import java.applet.*;
/*<applet code="Arc" width="200" height="300">

</applet>*/
public class Arc extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=70; i<=115;i+=5)
		{
		g.fillArc(100,i,200,300,50,75);
	switch(i)
	{
		case 70:
			g.setColor(Color.black);
			break;

		case 75:
			g.setColor(Color.black);
			break;
			
		case 80:
			g.setColor(Color.blue);
			break;

		case 85:
			g.setColor(Color.green);
			break;

		case 90:
			g.setColor(Color.yellow);
			break;

		case 95:
			g.setColor(Color.red);
			break;

		case 100:
			g.setColor(Color.orange);
			break;	

			default: g.setColor(Color.white);
			break;
     }
   }
  } 
} 