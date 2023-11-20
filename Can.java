import java.awt.*;
import java.applet.*;
/* <applet code="Can" height="200" width="300" > </applet> */
class Can extends Applet
{
	Frame f;
	public void init()
	{
		f = new Frame("jay");
		f.setSize(90,100);
		Label lb=new Label("in the frame");
		f.add(lb);
		f.setVisible(true);
		//f.setBackground(Color.red);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("jay",15,20);
	}


}

