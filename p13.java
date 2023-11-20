import java.awt.*;
import java.applet.*;
import java.awt.event.*;

 public class p13 extends Frame implements ActionListener
 {   TextField t1,t2;
     Button b;
     static int count;

     p13()
     {  setLayout(new GridLayout());
        setSize(1000,1000);
        t1=new TextField(10);
        t2=new TextField(10);
        b=new Button("click this");
        setVisible(true);
        add(t1);
        add(t2);
        add(b);
         b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
     { 
        int n=Integer.parseInt(t1.getText());
        int m=Integer.parseInt(t2.getText());
        
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++) 
            {
                count++;
                System.out.print(count+" ");

           }
           System.out.println(" ");
            
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        count=0;
     }
     public static void main(String args[])
     {
        new p13();
     }
 }