import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=P12 height="400" width="300" ></applet> */
public class P12 extends Applet implements ActionListener
{
	Button B1;
	TextField T1;
	int a;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
		B1=new Button("Genrate");
		T1=new TextField();
		add(B1);
		B1.addActionListener(this);	
		add(T1);
	}
	public void actionPerformed(ActionEvent ae)
	{
			String s1=T1.getText();
			 a= Integer.parseInt(s1);
			 if(ae.getSource()==B1)
			 {

			 }
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);

		int x=0;
		int y=50;
		for(int i=1; i<=a;i++)
		{
			g.fillOval(x,y,40,40);
			y=y+50;
		}
	}
}