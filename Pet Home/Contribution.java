

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Contribution extends JFrame
{
	JLabel l0, l1, l2, l3, l4;
	private Font f, f1;
	private Container c;
	private JButton b1,b2;
	ImageIcon imgLogo;
	
	Contribution()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("Contribution");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		imgLogo = new ImageIcon(getClass().getResource("logo.png"));
		this.setIconImage (imgLogo.getImage());
		
		f = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 30);
	
		l0 = new JLabel();
     	l0.setText("Contribution");
     	l0.setBounds(100,50,600,50);
   		l0.setFont(f1);
     	l0.setOpaque(true);
     	l0.setForeground(Color.WHITE);
     	l0.setBackground(Color.BLACK);
     	c.add(l0);

     	l1 = new JLabel();
     	l1.setText("TANMOY DAS, ID: 22-49422-3");
     	l1.setBounds(100,125,600,50);
   		l1.setFont(f);
     	l1.setOpaque(true);
     	l1.setForeground(Color.WHITE);
     	l1.setBackground(Color.BLACK);
     	c.add(l1);
		
		l2 = new JLabel();
     	l2.setText("S. M. ABID HOSSAIN MAHID, ID: 22-49419-3");
     	l2.setBounds(100,200,600,50);
   		l2.setFont(f);
     	l2.setOpaque(true);
     	l2.setForeground(Color.WHITE);
     	l2.setBackground(Color.BLACK);
     	c.add(l2);
		
		l3 = new JLabel();
     	l3.setText("FATEMA BINTE ISLAM NEHA, ID: 22-49411-3");
     	l3.setBounds(100,275,600,50);
   		l3.setFont(f);
     	l3.setOpaque(true);
     	l3.setForeground(Color.WHITE);
     	l3.setBackground(Color.BLACK);
     	c.add(l3);
		
		l4 = new JLabel();
     	l4.setText("MEHERUN NESSA SUCHANA, ID: 22-49405-3");
     	l4.setBounds(100,350,600,50);
   		l4.setFont(f);
     	l4.setOpaque(true);
     	l4.setForeground(Color.WHITE);
     	l4.setBackground(Color.BLACK);
     	c.add(l4);
		
		
		b1= new JButton("Back");
     	b1.setBounds(2,520,100,50);
		b1.setFocusable(false);
     	c.add(b1);
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				About about = new About();
				about.setVisible(true);
				
				dispose();
			}
			
		});
		
		
		b2= new JButton("Exit");
     	b2.setBounds(898,520,100,50);
		b2.setFocusable(false);
     	c.add(b2);
		
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Home home = new Home();
				home.setVisible(true);
				
				dispose();
			}
			
		});
		
	}
	
	
}
