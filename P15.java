import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class P15 extends Frame implements ActionListener 
{
	List L1,L2,L3,L4,L5,L6;
	Panel P1,P2,P3,P4,P5,P6;
	//Label L1;
	Button B1;
	Container C1; 
	CardLayout cad;
	Frame f;
	P15()
	{

	    C1=new Container();

	    //Panel 1 process
	    P1=new Panel();
	    L1=new List();

	    L1.add("C");
	    L1.add("FDE");
	    L1.add("ECHM");
	    L1.add("FCA");
	    P1.add(L1);

	    //Panel 2 process
	    P2=new Panel();
	    L2=new List();

	    L2.add("CPP");
	    L2.add("BE");
	    L2.add("PHYSICS");
	    L2.add("CPD");
	    P2.add(L2);

	    //Panel 3 process
	    P3=new Panel();
	    L3=new List();

	    L3.add("DS");
	    L3.add("DBMS");
	    L3.add("OS");
	    L3.add("MICROPROCESSER");
	    P3.add(L3);

	    //Panel 4 process
	    P4=new Panel();
		L4=new List();

	    L4.add(".net");
	    L4.add("FSD");
	    L4.add("CN");
	    L4.add("ADBMS");
	    P4.add(L4);

	    //Panel 5 process
	    P5=new Panel();
 		L5=new List();

	    L5.add("JAVA");
	    L5.add("CMT");
	    L5.add("DWPD");
	    L5.add("CNS");
	    P5.add(L5);

	    //Panel 6 process
	    P6=new Panel();

	    L6=new List();

	    L6.add("MCAD");
	    L6.add("AJAVA");
	    L6.add("NMA");
	    L6.add("PD");
	    P6.add(L6);

	    B1=new Button("Next");
	    add(B1);
	    setLayout(new FlowLayout());
	    cad=new CardLayout();
	    C1.setSize(300,200);
	    C1.setLayout(cad);
	    C1.add(P1);
	    C1.add(P2);
	    C1.add(P3);
	    C1.add(P4);
	    C1.add(P5);
	    C1.add(P6);
	    add(C1);
	    setVisible(true);
	    B1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		cad.next(C1);
	}
	public static void main(String[] args) 
	{
		new P15();	
	}
}