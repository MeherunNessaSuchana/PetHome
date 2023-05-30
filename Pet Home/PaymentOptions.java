

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentOptions extends JFrame
{
	private Container c;
	private JButton b1,b2,b3,b4;
	private Font f1,f2,f3,f4;
	
	
	
	public PaymentOptions()
	
	{
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
	   
		setTitle("Payment Options");
		setBounds(300,100,1000,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
		f3 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f4 = new Font("Courier",Font.PLAIN, 20);
		
		
		
	    b1 = new JButton("Payment Options"); 
		b1.setBounds (390,150,200,50) ; 
		b1.setFont(f1);
		c.add(b1);
		
		
		
		b2 = new JButton("Nagad");
		b2.setBounds (250,250,200,50) ;
		b2.setFont(f2);
		c.add(b2);
		
		
		b3 = new JButton("Bkash");
		b3.setBounds (500,250,200,50) ;
		b3.setFont(f3);
		c.add(b3);
		
		
		b4 = new JButton("Back");
		b4.setBounds (10,500,100,40);
		b4.setFont(f4);
		c.add(b4);
		
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Nagad n = new Nagad();
				n.setVisible(true);
				
				dispose();
			}
			
		});
		
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Bikash b = new Bikash();
				b.setVisible(true);
				
				dispose();
			}
			
		});
		
			
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Payment pay = new Payment();
				pay.setVisible(true);
				
				dispose();
			}
			
		});
		
	}
	public static void main(String[]args)
	{
		new Payment();
	}
	
}