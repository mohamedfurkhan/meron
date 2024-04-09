
package calculator;


import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
class simple extends JFrame implements ActionListener
{
    
    JTextField tf1=new JTextField(20);
    JTextField tf2=new JTextField(20);
    JTextField tf3=new JTextField(20);
public simple()
{
   setTitle("Calculator");
   setSize(700,500);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
   getContentPane().setBackground(Color.yellow);
   JLabel l1=new JLabel("NUMBER1");
   l1.setBounds(150,100,80,50);
   add(l1);
   //JTextField tf1=new JTextField(5);
   tf1.setBounds(250,100,80,50);
   add(tf1);
   JLabel l2=new JLabel("NUMBER2");
   l2.setBounds(150,200,80,50);
   add(l2);
   //JTextField tf2=new JTextField(5);
   tf2.setBounds(250,200,80,50);
   add(tf2);
   JLabel l3=new JLabel("RESULT");
   l3.setBounds(150,300,80,50);
   add(l3);
   //JTextField tf3=new JTextField(5);
   tf3.setBounds(250,300,80,50);
   add(tf3);
   JButton b1=new JButton("ADD");
   b1.setBounds(150,400,80,50);
   add(b1);
   JButton b2=new JButton("SUB");
   b2.setBounds(250,400,80,50);
   add(b2);
   JButton b3=new JButton("MUL");
   b3.setBounds(350,400,80,50);
   add(b3);
   JButton b4=new JButton("DIV");
   b4.setBounds(450,400,80,50);
   add(b4);
   setLayout(null);
   setVisible(true);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    int x,y,s;
    String s1;
    x=Integer.parseInt(tf1.getText());
    y=Integer.parseInt(tf2.getText());
    
    if(e.getActionCommand()=="ADD")
    {
        getContentPane().setBackground(Color.red);
        s=x+y;
        s1=String.valueOf(s);
        tf3.setText(s1); 
    }
    if(e.getActionCommand()=="SUB")
    {  
        getContentPane().setBackground(Color.green);
        s=x-y;
        s1=String.valueOf(s);
        tf3.setText(s1); 
    }
    if(e.getActionCommand()=="MUL")
    {
        getContentPane().setBackground(Color.pink);
        s=x*y;
        s1=String.valueOf(s);
        tf3.setText(s1); 
    }
    if(e.getActionCommand()=="DIV")
    {
        getContentPane().setBackground(Color.blue);
        s=x/y;
        s1=String.valueOf(s);
        tf3.setText(s1); 
    }
}
}


public class Calculator {

    public static void main(String[] args) {
        // TODO code application logic here
        simple ob=new simple();
    }
    
}
