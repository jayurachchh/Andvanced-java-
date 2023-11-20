import java.awt.*;
import java.awt.*;
import java.awt.event.*;
public class Program_9 extends Frame implements ActionListener{//Applet{
     CardLayout crd;
     Panel p1,p2,p3,p4,p5,p6;
     List ls1,ls2,ls3,ls4,ls5,ls6;
     Label l1;
     Container c;
     Button b1;
    // public void paint(Graphics g)
    void Demo()
    {
  c=new Container();
    p1=new Panel();
    p2=new Panel();
    p3=new Panel();
    p4=new Panel();
    p5=new Panel();
    p6=new Panel();
    b1=new Button("home");
    ls1=new List();
    ls1.add("C");
    ls1.add("FDE");
    ls1.add("ECHM");
    ls1.add("FCA");
    ls2=new List();
    ls2.add("CPP");
    ls2.add("BE");
    ls2.add("Physics");
    ls2.add("CPD");
    ls3=new List();
    ls3.add("DS");
    ls3.add("MicroProcessor");
    ls3.add("OS");
    ls3.add("DBMS");
    ls4=new List();
    ls4.add(".Net");
    ls4.add("FSD");
    ls4.add("CN");
    ls4.add("ADBMS");
    ls5=new List();
    ls5.add("Java");
    ls5.add("CMT");
    ls5.add("DWPD");
    ls5.add("CNS");
    ls6=new List();
    ls6.add("Android Devlopment");
    ls6.add("Advanced Java");
    ls6.add("NMA");
    ls6.add("PD");
    add(b1);
 
    p1.add(ls1);
    p2.add(ls2);
    p3.add(ls3);
    p4.add(ls4);
    p5.add(ls5);
    p6.add(ls6);
    setLayout(new FlowLayout());
    crd=new CardLayout();
    setSize(200,200);
    c.setSize(200,200);
    c.setLayout(crd);
    c.add(p1);
    c.add(p2);
    c.add(p3);
    c.add(p4);
    c.add(p5);
    c.add(p6);
    add(c);
    setVisible(true);
    b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
    crd.next(c); 
    }
   public static void  main(String []args)
    {
    Program_9 p=new Program_9();
    p.Demo(); 
    }
}