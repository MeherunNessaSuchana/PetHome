

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame
{
	JLabel l0;
	private Font f, f1;
	private Container c;
	private JButton b1, b2, b3;
	ImageIcon imgLogo;
	
	About()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);
		
	setTitle("             About");
    setBounds(300, 100, 1000,600);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	f = new Font("Arial",Font.BOLD + Font.ITALIC, 30);
	f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 50);
	
	imgLogo = new ImageIcon(getClass().getResource("logo.png"));
	this.setIconImage (imgLogo.getImage());
	
	l0 = new JLabel();
    l0.setText("About");
    l0.setBounds(400,150,600,100);
    l0.setFont(f1);
    l0.setOpaque(true);
    l0.setForeground(Color.WHITE);
    l0.setBackground(Color.BLACK);
    c.add(l0);
	
	
	b2 = new JButton("Animal Rights");
    b2.setBounds(400,300,600,100);
	b2.setFocusable(false);
    c.add(b2);
		
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				AnimalRights right = new AnimalRights();
				right.setVisible(true);
				
				dispose();
			}
			
		});
		
	b3 = new JButton("Contribution");
    b3.setBounds(400,450,600,100);
	b3.setFocusable(false);
    c.add(b3);
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Contribution contribution = new Contribution();
				contribution.setVisible(true);
				
				dispose();
			}
			
		});
	
	b1= new JButton("Back");
    b1.setBounds(2,520,100,50);
	b1.setFocusable(false);
    c.add(b1);
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Home home = new Home();
				home.setVisible(true);
				
				dispose();
			}
			
		});
		
	}
	
}
