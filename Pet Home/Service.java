

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Service extends JFrame{

	JLabel l1, imagelabel;
	ImageIcon img;
	JButton b1,b2,b3,b4,b5;
	private Font f;
	private Container c;

	Service()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);
		
     	img = new ImageIcon(getClass().getResource("img.png"));
		imagelabel = new JLabel(img);
		imagelabel.setBounds(220,0,780,600);
		c.add(imagelabel);
		

     	f = new Font("Arial",Font.BOLD + Font.ITALIC, 20);

     	setTitle("PET HOME");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

     	l1 = new JLabel();
     	l1.setText("OUR SERVICE");
     	l1.setBounds(20,5,200,50);
   		l1.setFont(f);
     	l1.setOpaque(true);
     	l1.setForeground(Color.WHITE);
     	l1.setBackground(Color.BLACK);
     	c.add(l1);



     	b1= new JButton("DOG");
     	b1.setBounds(20,70,200,100);
     	c.add(b1);

     	b2= new JButton("CAT");
     	b2.setBounds(20,180,200,100);
     	c.add(b2);

     	b3= new JButton("BIRDS");
     	b3.setBounds(20,290,200,100);
     	c.add(b3);

     	b4= new JButton("FISH");
     	b4.setBounds(20,400,200,100);
     	c.add(b4);
		
		b5= new JButton("Back");
     	b5.setBounds(2,520,100,50);
     	c.add(b5);
		
		
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Home home = new Home();
				home.setVisible(true);
				
				dispose();
			}
			
		});
		
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Package1 pack1 = new Package1();
				pack1.setVisible(true);
				
				dispose();
			}
			
		});
		
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Package2 pack2 = new Package2();
				pack2.setVisible(true);
				
				dispose();
			}
			
		});
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Package3 pack3 = new Package3();
				pack3.setVisible(true);
				
				dispose();
			}
			
		});
		
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Package4 pack4 = new Package4();
				pack4.setVisible(true);
				
				dispose();
			}
			
		});


	}
	
}
