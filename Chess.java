import java.awt.*;
import java.applet.*;
/*<applet code="Chess" width="1000" height="1000"></applet>*/
public class Chess extends Applet{
		
	public void paint(Graphics g)
	{	g.setColor(Color.black);
		
		int chess[][]=new int[8][];
		int top=0,left=0;

		for(int row=0;row<9;row++)
		{ if(row%2==0)
			{
			for(int col=0;col<9;col++)
			{
				if(col%2==0 )
				{
					
					g.drawRect(left,top,60,60);
				}
				else
				{
					g.setColor(Color.black);
					g.fillRect(left,top,60,60);
				}
				left+=60;
			}}
			else
				{for(int col=0;col<9;col++)
			{
				if(col%2==0 )
				{
					g.setColor(Color.black);
					g.fillRect(left,top,60,60);
				}
				else
				{
				
					g.drawRect(left,top,60,60);

				}
			left+=60;}
			}left=0;
			top+=60;
			
	}
}
}