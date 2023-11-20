import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class K extends JFrame implements ActionListener
 {  Label l1,l2,l3,l4;
    Label l10=new Label("hello");
    Button b;
    TextField tf1,tf2,tf3,tf4;
    Choice c;
   K(){
        l1=new Label("Name");
        l2=new Label("Phone No.");
        l3=new Label("Gender");
        c=new Choice();
        c.add("2000");
        c.add("2002");
        c.add("2003");
        c.add("2004");
        tf1=new TextField(20);
        tf2=new TextField(20);
        tf3=new TextField(20);
        b=new Button("click this");
        b.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setVisible(true);
        setSize(500,500);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(c);
        add(b);
        add(l10);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JDialog db=new JDialog();
        db.add(new Label(tf1.getText()));
        db.add(new Label(tf2.getText()));
        db.add(new Label(tf3.getText()));
        db.add(new Label(c.getSelectedItem()));
        db.setVisible(true);
        db.setSize(200,200);
        db.setLayout(new FlowLayout());

    }
     public static void main(String args[])
     {
      new K();  
     }
    
}