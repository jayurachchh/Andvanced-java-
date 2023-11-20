import java.awt.*;	
import java.awt.event.*;
import java.applet.*;
class D extends Frame implements ActionListener 
{
	List L1,L2,L3,L4,L5,L6;
	
	//Label L1;
	Button B1,B2;
	Container C1; 
	CardLayout cad;
	Frame f;
	D()
	{ setSize(400,400);

	    C1=new Container();

	    //Panel 1 process
	    L1=new List();

	    L1.add("C");
	    L1.add("FDE");
	    L1.add("ECHM");
	    L1.add("FCA");


	    //Panel 2 process
	    L2=new List();

	    L2.add("CPP");
	    L2.add("BE");
	    L2.add("PHYSICS");
	    L2.add("CPD");


	    //Panel 3 process
	    L3=new List();

	    L3.add("DS");
	    L3.add("DBMS");
	    L3.add("OS");
	    L3.add("MALP");


	    //Panel 4 process
		L4=new List();

	    L4.add(".net");
	    L4.add("FSD");
	    L4.add("CN");
	    L4.add("ADBMS");
	    

	    //Panel 5 process
 		L5=new List();

	    L5.add("JAVA");
	    L5.add("CMT");
	    L5.add("DWPD");
	    L5.add("CNS");
	    

	    //Panel 6 process
	    
	    L6=new List();
	    L6.add("MCAD");
	    L6.add("AJAVA");
	    L6.add("NMA");
	    L6.add("PD");
	   

	    B1=new Button("Next");
	    add(B1);
	    B2=new Button("Home");
	    add(B2);
	    setLayout(new FlowLayout());
	    cad=new CardLayout();
	    C1.setSize(1000,1000);
	    C1.setLayout(cad);
	    C1.add(L1);
	    C1.add(L2);
	    C1.add(L3);
	    C1.add(L4);
	    C1.add(L5);
	    C1.add(L6);
	    add(C1);
	    setVisible(true);
	    B1.addActionListener(this);
	    B2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B1)
		{
			cad.next(C1);
		}

		if(e.getSource()==B2)
		{
				cad.first(C1);
		}
	}
	public static void main(String[] args) 
	{
		new D();	
	}
}