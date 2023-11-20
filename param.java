import java.awt.*;
import java.applet.*;
/*<applet code="Param" width="200" height="300">
<param name="ab" value="xyz"/>
</applet>*/
public class Param extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello India",30,30);
		String str = getParameter("ab");
		g.drawString(str,60,60);
	}
} 