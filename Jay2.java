import java.awt.*;
import java.applet.*;
/* <applet code="Jay2" height="200" width="300" > </applet> */
class Jay2 extends Applet
{
	/*Jay2()
	{
		Frame f=new Frame();
		f.setSize(20,30);
		f.setVisible(true);
		f.setBackground(Color.red);
	}*/
	 class my extends Frame
	 {
	 	protected void prin()
	 	{
	 		Frame f=new Frame("my Frame");
	 		Label l=new Label();
	 		l.setText("jay");
	 		f.add(l);
	 		f.setVisible(true);
	 	}
	 }
	
	public void paint(Graphics g)
	{
		g.drawString("jay",50,40);
	}
}