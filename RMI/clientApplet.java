import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.rmi.*;


public class clientApplet extends JFrame implements ActionListener
{
     JButton b1,b2; JTextField t1,t2;
  
    clientApplet()
   {
      b1=new JButton("Submit");
      b2=new JButton("clear");
      JLabel l1=new JLabel("celcius value");
JLabel l2=new JLabel("Farenheit  value");
   JPanel p=new JPanel(new GridLayout(3,2));
  

       t1=new JTextField(3);    t2=new JTextField(3);
     p.add(l1); p.add(t1);   p.add(l2);   p.add(t2);
     p.add(b1);   p.add(b2);
      b1.addActionListener(this);b2.addActionListener(this);

      Container c=getContentPane();
      
       c.add(p);


    }

    public void actionPerformed(ActionEvent ae) 
    {
      try
{    convert_interface ref=(convert_interface) Naming.lookup("rmi://localhost/covertsion");
       if (ae.getSource()==b1)
      {
        double d1=Double.parseDouble(t1.getText());
        double d2=ref.convert_temp(d1);
        t2.setText(d2+"");
      }
   else {       t1.setText("");  t2.setText("");
               
        }
    }
        catch(Exception e){}
     }

      
  public static void main(String args[]) throws Exception
  {
            clientApplet ob=new clientApplet();
            ob.setVisible(true);
            ob.setSize(200,300);

   }
}


