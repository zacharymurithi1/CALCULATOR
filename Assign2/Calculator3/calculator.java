
/**
 * Write a description of class calculator here.
 *
 * @author (Murugu Zachary Murithi)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class calculator extends JFrame implements ActionListener{
    static JFrame f;
    static JTextField l;



   String s0,s1,s2;
   
   calculator()
    {
        // initialise instance variables
       s0=s1=s2="";
    }

    public static void main(String args[])
    {
        f=new JFrame("Calculator");
        calculator c=new calculator();
        l=new JTextField(20);
        l.setEditable(false);
        //create no buttons and operators
       JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btadd,btsub,
       btmut,btdiv,bteql,btc,btpt,btbracketl, btbracketr, btoff,btback;
       //create number buttons
      bt0=new JButton("0");
      bt1=new JButton("1");
      bt2=new JButton("2");
      bt3=new JButton("3");
      bt4=new JButton("4");
      bt5=new JButton("5");
      bt6=new JButton("6");
      bt7=new JButton("7");
      bt8=new JButton("8");
      bt9=new JButton("9");
      
      //create the equals buttons
      bteql=new JButton("=");
      //Operator buttons
      btadd=new JButton("+");
      btsub=new JButton("-");
      btmut=new JButton("*");
      btdiv=new JButton("/");
      btc=  new JButton("C");
      btpt=new JButton(".");
      btbracketl=new JButton("(");
      btbracketr=new JButton(")");
      btoff=new JButton("OFF");
      btback=new JButton("<<");
      //Panel 
      JPanel P1= new JPanel();
      
    //Action listener
    btmut.addActionListener(c);
    btdiv.addActionListener(c);
    btadd.addActionListener(c);
    btsub.addActionListener(c);
    
    bt9.addActionListener(c);
    bt8.addActionListener(c);
    bt7.addActionListener(c);
    bt6.addActionListener(c);
    bt5.addActionListener(c);
    bt4.addActionListener(c);
    bt3.addActionListener(c);
    bt2.addActionListener(c);
    bt1.addActionListener(c);
    bt0.addActionListener(c);
    
    btpt.addActionListener(c);
    btc.addActionListener(c);
    bteql.addActionListener(c);
    btbracketl.addActionListener(c);
    btbracketr.addActionListener(c);
    btoff.addActionListener(c);
    btback.addActionListener(c);
    //adding elemeemts to the panel
    P1.add(l);
    P1.add(btadd);
    P1.add(bt1);
    P1.add(bt2);
    P1.add(bt3);
    P1.add(btsub);
    P1.add(bt4);
    P1.add(bt5);
    P1.add(bt6);
    P1.add(bt7);
    P1.add(bt8);
    P1.add(bt9);
    P1.add(btdiv);
    P1.add(btmut);
    P1.add(btpt);
    P1.add(bt0);
    P1.add(btc);
    P1.add(bteql);
    P1.add(btbracketl); 
    P1.add(btbracketr);
    P1.add(btoff);
    P1.add(btback);
    //Panel Background
    P1.setBackground(Color.red);
  
    //adding the panel to the frame
    f.add(P1);
    f.setSize(250,300);
    f.show();
}
 
public void actionPerformed(ActionEvent e){
    String s=e.getActionCommand();
    if ((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)== '.'){
        if(!s1.equals(""))
        s2=s2+s;
        else
        s0=s0+s;
        
        l.setText(s0+s1+s2);
    }
    else if(s.charAt(0)=='C'){
        s0=s1=s2="";
        l.setText(s0+s1+s2);
    }
    else if(s.charAt(0)=='C'){
        s0=s1=s2="";
        disable();
    }
    
    else if (s.charAt(0)=='='){
        double te;
        
        if(s1.equals("+"))
        te=(Double.parseDouble(s0)+ Double.parseDouble(s2));
else if(s1.equals("+"))
te=(Double.parseDouble(s0)+Double.parseDouble(s2));
else if(s1.equals("-"))
  te=(Double.parseDouble(s0)+ Double.parseDouble(s2));
else if(s1.equals("/"))
te=(Double.parseDouble(s0)+ Double.parseDouble(s2));
else
te=(Double.parseDouble(s0) * Double.parseDouble(s2));

l.setText(s0+s1+s2+"=" +te);

//convert it to string
s0=Double.toString(te);
s1=s2="";
}
else{
    if(s1.equals("")|| s2.equals(""))
    s1=s;
    else{
        double te;
        if(s1.equals("+"))
        te=(Double.parseDouble(s0) + Double.parseDouble(s2));
        else if(s1.equals("-"))
 te=(Double.parseDouble(s0) - Double.parseDouble(s2));
        else if(s1.equals("/"))
 te=(Double.parseDouble(s0) / Double.parseDouble(s2));
        else 
 te=(Double.parseDouble(s0) * Double.parseDouble(s2));
       
 //convert to string
 s0=Double.toString(te);
 s1=s;
 s2="";
}
l.setText(s0+s1+s2);
}
}
}
   