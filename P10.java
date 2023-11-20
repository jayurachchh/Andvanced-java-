import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=P10 height="400" width="300"> </applet>*/
public class P10 extends Applet implements ActionListener
{
	List L1,L2;
	Button B1,B2,B3;
	TextField T1;
	public void init()
	{
		setLayout(new FlowLayout());
		L1=new List(10,false);
		L2=new List(10,false);
		B1=new Button("Move to List1");
		B2=new Button("Move to List2");
		T1=new TextField(10);
		B3=new Button("Add Iteam");
		L1.add("ABC");
		L1.add("DEF");
		L2.add("XYZ");
		L2.add("MNO");
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		add(L1);
		add(B1);
		add(B2);
		add(L2);
		add(T1);
		add(B3);
	}
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==B3)
    	{
    		String s1=T1.getText();
    		L1.add(s1);
    	}
    	// move list 1 
    	if(ae.getSource()==B1)
    	{
    		String s2=L2.getSelectedItem(); 
    		L1.add(s2);
    	}
    	// move list 2
    	if(ae.getSource()==B2)
    	{
    		String s3=L1.getSelectedItem(); 
    		L2.add(s3);
    	}
    }
}