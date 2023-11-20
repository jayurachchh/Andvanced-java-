import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=P8 width="400" height="300"> </applet> */
public class P8 extends Applet implements ActionListener
{
    TextField t,t1,t2,t3;
    Button B1,B2;
    Label lb,lb1,lb2;
    public void init()
    {
        lb =new Label("Enter a  Product Name");
        t =new TextField(10);

         lb1 =new Label("Base Price");
         t1 =new TextField(10);
        
        lb2 =new Label("GST Rate");
         t2 =new TextField(10);

        B1=new Button("Calculate");
        B1.addActionListener(this);
        t3 =new TextField(10);

       
        B2=new Button("Cancel");
        //b2.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(200,300); 
        add(lb);
        add(t);
        add(lb1);
        add(t1);
        add(lb2);
        add(t2);
        add(B1);
        add(t3);
        add(B2);

    }

    public void actionPerformed(ActionEvent ae)
    {

        String s1=t1.getText();
        String s2=t2.getText();
        Float x=Float.parseFloat(s1);
        Float y=Float.parseFloat(s2);
        if(ae.getSource()==B1)
        {
            Float f=x+x*(y/100);
            String s3=""+f;
            t3.setText(s3);
        }
    }
    // public void actionPerformed(ActionEvent a)
    // {
    //     if(a.getSource==B2)
    //     {
    //         finsh();
    //     }
    // }
    public void paint(Graphics g)
    {
        g.drawString("",50,50);
    }
    
}