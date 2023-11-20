import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class P19 extends JFrame implements ActionListener
{			
		
		JLabel L1,L2,L3,L4;
		JTextField T1,T2;
		JButton B1 ;
		ButtonGroup bg1; 
		JRadioButton Rd1,Rd2;
		Choice C1,C2;

	P19()
	{
		
		setSize(200,300);
		setVisible(true);
		L1=new JLabel("Name");
		add(L1);
		T1=new JTextField(20);
		add(T1);
		L2=new JLabel("Mo.No");
		add(L2);
		T2=new JTextField(20);
		add(T2);	
		L3=new JLabel("Gender");
		add(L3);
		C2=new Choice();
        C2.add("Male");
        C2.add("Female");
        add(C2);	
		L4=new JLabel("BirthYear");  
		add(L4);
		C1=new Choice();
        C1.add("2000");
        C1.add("2002");
        C1.add("2003");
        C1.add("2004");
        add(C1);
		B1 =new JButton("Submit");
		add(B1);
		setLayout(null);
		L1.setBounds(50,50,70,20);
		L2.setBounds(50,80,70,20);
		T1.setBounds(100,50,100,20);
		T2.setBounds(100,80,100,20);
		C2.setBounds(100,120,90,20);
		L4.setBounds(50,190,70,20);
		C1.setBounds(130,190,100,20);
		B1.setBounds(70,240,100,50);
		B1.addActionListener(this);

	}	
	public void actionPerformed(ActionEvent ae)
	{
		JDialog d=new JDialog();
		d.add(new Label(T1.getText()));
		d.add(new Label(T2.getText()));
		d.add(new Label(C2.getSelectedItem()));
		d.add(new Label(C1.getSelectedItem()));
		d.setVisible(true);
		d.setSize(300,400);
		d.setLayout(new FlowLayout());

	}
	public static void main(String[] args) 
	{
		new P19();
			
	}
}