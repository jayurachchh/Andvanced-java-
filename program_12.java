import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program_12 extends JFrame 
{
  JButton b1;
  JLabel l1,l2;
  JTextField ta1,ta2;
  ButtonGroup bg1;
  JRadioButton j1,j2,j3;

void Demo2(String st1,String st2,String st3)
 {
      JDialog j = new JDialog(this,"Dialog",true);
      String s1=""+st1;
      String s2=""+st2;
      j.setLayout(new GridLayout(5,2));
      JLabel l1=new JLabel("name");
      JLabel l2=new JLabel("phone no.");
      JTextField t1= new JTextField();
      JTextField t2=new JTextField();
      JLabel name=new JLabel(""+s2);
      JLabel phone=new JLabel(""+s1);
      JLabel name1=new JLabel("name");
      JLabel phone1=new JLabel("phone");
      JLabel gender1=new JLabel("gender");
      JLabel b = new JLabel(""+st3);
      t1.setText(s1);
      t2.setText(s2);
      j.add(name1);
      j.add(name);
      j.add(phone1);
      j.add(phone);
      j.add(gender1);
      j.add(b);
      j.setSize(200,300);
      j.setVisible(true);
 }
 
 void Demo()
 { 
b1=new JButton("click");
l1=new JLabel("name");
l2=new JLabel("phone no.");
ta1=new JTextField(20);
ta2=new JTextField(20);
bg1=new ButtonGroup();
j1=new JRadioButton("Male");
j2=new JRadioButton("Female");
j3=new JRadioButton("Other");
bg1.add(j1);
bg1.add(j2);
bg1.add(j3);
l1.setBounds(0,0,70,20);
l2.setBounds(0,30,70,20);
ta1.setBounds(70,0,100,20);
ta2.setBounds(70,30,100,20);
j1.setBounds(20,90,90,20);
j2.setBounds(20,120,90,20);
j3.setBounds(20,150,90,20);
b1.setBounds(40,200,100,50);
setLayout(null);
add(b1);
add(l1);
add(l2);
add(ta1);
add(ta2);
add(j1);
add(j2);
add(j3);
setSize(200,400);
setVisible(true);
//b1.addActionListener(this);
}
  public static void main(String []args)
    {
      Program_12 p=new Program_12();
      p.Demo();
    }
   /* public void actionPerformed(ActionEvent e)
    {
      Program_12 p=new Program_12();
      if(j1.isSelected())
      {
      p.Demo2(ta1.getText().toString(),ta2.getText().toString(),"male");
      }
      else if(j2.isSelected())
      {
      p.Demo2(ta1.getText().toString(),ta2.getText().toString(),"female");
        
      }
      else 
      {
      p.Demo2(ta1.getText().toString(),ta2.getText().toString(),"other");     
      }

    }*/
 
}