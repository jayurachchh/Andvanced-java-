import java.awt.*;
public class P14 extends Frame  
{
	Button B1,B2,B3,B4,B5;
	P14()
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new BorderLayout());

		B1=new Button("NORTH");
		add(B1,BorderLayout.NORTH);

		B2=new Button("SOUTH");
		add(B2,BorderLayout.SOUTH);

		B3=new Button("EAST");
		add(B3,BorderLayout.EAST);

		B4=new Button("WEST");
		add(B4,BorderLayout.WEST);

		B5=new Button("CENTER");
		add(B5,BorderLayout.CENTER);
	}
	public static void main(String[] args) 
	{
		new P14();
		
	}
	
}