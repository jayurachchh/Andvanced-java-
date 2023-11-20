import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class P13 extends Frame implements ActionListener 
{
	TextField T1,T2;
	Button B1;
	int a,b;
	int x;

	P13()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	T1=new TextField();
	T2=new TextField();
	B1=new Button("Click Here");
	add(T1);
	add(T2);
	add(B1);
	B1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		a=Integer.parseInt(T1.getText());
		b=Integer.parseInt(T2.getText());
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				x++;
				System.out.println(x+" ");

			}
				System.out.println(" ");	
		}
		System.out.println(" ");	
		System.out.println(" ");
		System.out.println(" ");
		x=0;
	}
	public static void main(String[] args) 
	{
		new P13();	
	}
}