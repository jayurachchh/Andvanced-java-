import java.awt.*;
import java.applet.*;
/*<applet code=All width="400" height="300"> </applet> */
public class All extends Applet
{
	TextField Uname,Pass;
	Button B1,B2;
	TextArea a1;
	Checkbox c1,c2;
	CheckboxGroup g1;
	Choice c;
	List l;
	public void init()
	{
		Label lb =new Label("Enter a Name");
		Uname =new TextField(10);
		Label lb1 =new Label("Password");
		Pass =new TextField(10);
		Pass.setEchoChar('*');
		B1=new Button("Login");
		//B1.set(30,40);
		B2=new Button("Cancel");
		a1=new TextArea("Enter the Text",5,26,12);
		a1.getColumns();
		c1=new Checkbox("male",true);
		c2=new Checkbox("Female");
		//g1=new CheckboxGroup();
		c=new Choice();
		c.add("abc");
		c.add("def");
		l =new List(5);
		l.add("Select List Iteam");
		l.add("abc");
		l.add("def");
		l.add("xyz");
		l.add("ert");
		l.add("asd");
		l.add("abc");
		l.add("abc");
		l.add("abc");
		l.select(0); 
		add(lb);
		add(Uname);
		add(lb1);
		add(Pass);
		add(B1);
		add(B2);
		add(a1);
		add(c1);
		add(c2);
		//add(g1);
		add(c);
		add(c);
		add(l);
	}
	public void paint(Graphics g)
	{
		g.drawString("",20,20);
	}
}