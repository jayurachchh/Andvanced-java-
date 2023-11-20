import java.awt.*;

class Canvasj extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(75,10,150,75);
	}
}
class Jay3 extends Frame
{

	Jay3()
	{
		super("welcome canvas");
		Canvasj j=new Canvasj();
		j.setSize(20,30);
		j.setBackground(Color.blue);
		add(j);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		Jay3 j3=new Jay3();
	}

}