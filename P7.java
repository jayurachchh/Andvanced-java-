import java.awt.*;
import java.applet.*;
/*<applet code=P7 width="400" height="300"> </applet> */
public class P7 extends Applet
{
	TextField Uname,Pass;
	Button B1,B2;
	public void init()
	{
		Label lb =new Label("Enter a Name");
		Uname =new TextField(10);
		Label lb1 =new Label("Password");
		Pass =new TextField(10);
		Pass.setEchoChar('*');
		B1=new Button("Login");
		B2=new Button("Cancel");
		add(lb);
		add(Uname);
		add(lb1);
		add(Pass);
		add(B1);
		add(B2);

	}
	public void paint(Graphics g)
	{
		g.drawString("this is a Login Form",50,50);
	}
	
}