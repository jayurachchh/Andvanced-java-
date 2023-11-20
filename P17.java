import java.awt.*;
import java.awt.event.*;

public class P17 extends Frame implements MouseListener,MouseMotionListener 
{
	int a;
	int b;
	Label L1;
	P17()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		L1=new Label("Click Me");
		setSize(300,400);
		setVisible(true);
		add(L1);
		addMouseListener(this);
		addMouseMotionListener(this);
		L1.addMouseListener(this);
	}	
	public static void main(String[] args) 
	{
		new P17();
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me)
	{
		a=me.getX();
		b=me.getY();
		L1.setText("X:"+a+"Y:"+b);
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed");
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==L1)
		{
			System.out.println("Mouse Entered in label");
		}
		else
		{
			System.out.println("Mouse Entered in Frame");
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==L1)
		{
			System.out.println("Mouse Exited in label");
		}
		else
		{
			System.out.println("Mouse Exited in Frame");
		}
	}
	

}