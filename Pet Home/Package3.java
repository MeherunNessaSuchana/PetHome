

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class Package3 extends JFrame
{
	
	JLabel l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, imagelabel1;
	private JButton b1,b2;
	private Font f, f1;
	private Container c;
	ImageIcon img1;
	
	Package3()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("Packages");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f = new Font("Arial",Font.BOLD + Font.ITALIC, 15);
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 45);
	
		l0 = new JLabel();
     	l0.setText("        Package For Birds ");
     	l0.setBounds(20,75,590,60);
   		l0.setFont(f1);
     	l0.setOpaque(true);
     	l0.setForeground(Color.WHITE);
     	l0.setBackground(Color.BLACK);
     	c.add(l0);

     	l1 = new JLabel();
     	l1.setText(" Per Day Maintanance Charge = BDT 200");
     	l1.setBounds(20,150,310,50);
   		l1.setFont(f);
     	l1.setOpaque(true);
     	l1.setForeground(Color.WHITE);
     	l1.setBackground(Color.BLACK);
     	c.add(l1);
		
		l2 = new JLabel();
     	l2.setText(" Food Types:");
     	l2.setBounds(20,200,310,50);
   		l2.setFont(f);
     	l2.setOpaque(true);
     	l2.setForeground(Color.WHITE);
     	l2.setBackground(Color.BLACK);
     	c.add(l2);
		
		l3 = new JLabel();
     	l3.setText("             Food Type 1 = BDT 200");
     	l3.setBounds(20,250,310,50);
   		l3.setFont(f);
     	l3.setOpaque(true);
     	l3.setForeground(Color.WHITE);
     	l3.setBackground(Color.BLACK);
     	c.add(l3);
		
		l4 = new JLabel();
     	l4.setText("             Food Type 2 = BDT 400");
     	l4.setBounds(20,300,310,50);
   		l4.setFont(f);
     	l4.setOpaque(true);
     	l4.setForeground(Color.WHITE);
     	l4.setBackground(Color.BLACK);
     	c.add(l4);
		
		l5 = new JLabel();
     	l5.setText(" Living Space:");
     	l5.setBounds(20,350,310,50);
   		l5.setFont(f);
     	l5.setOpaque(true);
     	l5.setForeground(Color.WHITE);
     	l5.setBackground(Color.BLACK);
     	c.add(l5);
		
		l6 = new JLabel();
     	l6.setText("             Single Cage = BDT: 300");
     	l6.setBounds(20,400,310,50);
   		l6.setFont(f);
     	l6.setOpaque(true);
     	l6.setForeground(Color.WHITE);
     	l6.setBackground(Color.BLACK);
     	c.add(l6);
		
		l7 = new JLabel();
     	l7.setText("             Shared Cage = BDT: 200");
     	l7.setBounds(20,450,310,50);
   		l7.setFont(f);
     	l7.setOpaque(true);
     	l7.setForeground(Color.WHITE);
     	l7.setBackground(Color.BLACK);
     	c.add(l7);
		
		l8 = new JLabel();
     	l8.setText(" Food Type 1:");
     	l8.setBounds(350,150,250,50);
   		l8.setFont(f);
     	l8.setOpaque(true);
     	l8.setForeground(Color.WHITE);
     	l8.setBackground(Color.BLACK);
     	c.add(l8);
		
		l9 = new JLabel();
     	l9.setText("    -- Customer's given food");
     	l9.setBounds(350,200,250,50);
   		l9.setFont(f);
     	l9.setOpaque(true);
     	l9.setForeground(Color.WHITE);
     	l9.setBackground(Color.BLACK);
     	c.add(l9);
		
		l10 = new JLabel();
     	l10.setText("    -- Water");
     	l10.setBounds(350,250,250,50);
   		l10.setFont(f);
     	l10.setOpaque(true);
     	l10.setForeground(Color.WHITE);
     	l10.setBackground(Color.BLACK);
     	c.add(l10);
		
		l11 = new JLabel();
     	l11.setText(" Food Type 2:");
     	l11.setBounds(350,300,250,50);
   		l11.setFont(f);
     	l11.setOpaque(true);
     	l11.setForeground(Color.WHITE);
     	l11.setBackground(Color.BLACK);
     	c.add(l11);
		
		l12 = new JLabel();
     	l12.setText("    -- Rice");
     	l12.setBounds(350,350,250,50);
   		l12.setFont(f);
     	l12.setOpaque(true);
     	l12.setForeground(Color.WHITE);
     	l12.setBackground(Color.BLACK);
     	c.add(l12);
		
		l13 = new JLabel();
     	l13.setText("    -- Bird Foods");
     	l13.setText("    -- Bird Foods");
     	l13.setBounds(350,400,250,50);
   		l13.setFont(f);
     	l13.setOpaque(true);
     	l13.setForeground(Color.WHITE);
     	l13.setBackground(Color.BLACK);
     	c.add(l13);
		
		l14 = new JLabel();
     	l14.setText("    -- Water");
     	l14.setBounds(350,450,250,50);
   		l14.setFont(f);
     	l14.setOpaque(true);
     	l14.setForeground(Color.WHITE);
     	l14.setBackground(Color.BLACK);
     	c.add(l14);
		
		
		
		
		img1 = new ImageIcon(getClass().getResource("img1.png"));
		imagelabel1 = new JLabel(img1);
		imagelabel1.setBounds(750,100,250,400);
		c.add(imagelabel1);
		
		
		b1= new JButton("Back");
     	b1.setBounds(2,520,100,50);
     	c.add(b1);
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Service service = new Service();
				service.setVisible(true);
				
				dispose();
			}
			
		});
		
		
		b2= new JButton("Exit");
     	b2.setBounds(898,520,100,50);
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
	
	public static void main(String[]args)
	{
		new Package3();
	}
	
}