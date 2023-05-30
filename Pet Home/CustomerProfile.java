
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


  

   public class CustomerProfile extends JFrame
   {
	private Container c;
	private JButton b1,b2,b3,b4,b5;
	private Font f1,f2,f3,f4;
	//private ImageIcon icon;
	
	
	
	public CustomerProfile()
	
	{
		c = this.getContentPane();
		c.setBackground(Color.GRAY);
		
		
	//icon = new ImageIcon(getStatus());
	   
		setTitle(" Customer profile");
		setBounds(300,100,1000,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Courier",Font.BOLD +Font.ITALIC, 20);
		f3 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f4 = new Font("Courier",Font.PLAIN,10);
		
	    b1 = new JButton("User Defined"); 
		b1.setBounds (400,150,200,50) ;
		b1.setFont(f1);
		c.add(b1);
		
		
		
		b2 = new JButton("Default Packages");
		b2.setBounds (400,250,200,50) ;
		b2.setFont(f2);
		c.add(b2);
		
		
		b4 = new JButton("Log Out");
		b4.setBounds (880,10,100,20);
		b4.setFont(f4);
		c.add(b4);
		
	    	

		b1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				Insert insert = new Insert();
				insert.setVisible(true);
				dispose();
			}
			
		});



		b4.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				Home back = new Home();
				back.setVisible(true);
				dispose();
			}
			
		});

		b2.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				Service1 s = new Service1();
				s.setVisible(true);
				dispose();
			}
			
		});





		
		
		
	}
	public static void main(String[]args)
	{
		new CustomerProfile();
	}
	
}
