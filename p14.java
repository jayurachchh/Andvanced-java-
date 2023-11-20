import java.awt.*;
public class p14 extends Frame
{
	p14()
	{	setSize(300,200);
		setLayout(new BorderLayout());
		Button b=new Button("north");
		add(b,BorderLayout.NORTH);
		Button b1=new Button("south");
		add(b1,BorderLayout.SOUTH);
		Button b2=new Button("east");
		add(b2,BorderLayout.EAST);
		Button b3=new Button("west");
		add(b3,BorderLayout.WEST);
		Button b4=new Button("CENTER");
		add(b4,BorderLayout.CENTER);
		setVisible(true);
	
	}
	public static void main(String args[])
	{
		new p14();
	}
}