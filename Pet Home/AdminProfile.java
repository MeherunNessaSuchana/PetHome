import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminProfile extends JFrame
{
	private Container c;
	private JButton b1,b2,b3,b4,b5;
	private Font f1,f2,f3,f4,f5;
	//private ImageIcon icon;
	
	
	
	public AdminProfile()
	
	{
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
	   
		setTitle("Admin profile");
		setBounds(300,100,1000,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
		f3 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f4 = new Font("Courier",Font.PLAIN,10);
		f5 = new Font("Courier",Font.PLAIN,20);
		
		
	    b1 = new JButton("User details"); 
		b1.setBounds (130,100,200,50) ;
		b1.setFont(f1);
		c.add(b1);
		
		
		
		b2 = new JButton("View Packages");
		b2.setBounds (130,200,200,50) ;
		b2.setFont(f2);
		c.add(b2);
		
		
		b3 = new JButton("History");
		b3.setBounds (130,300,200,50) ;
		b3.setFont(f3);
		c.add(b3);
		
		
		
		
		b4 = new JButton("Log Out");
		b4.setBounds (880,10,100,20);
		b4.setFont(f4);
		c.add(b4);
		

		b1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				UserData data = new UserData();
				data.setVisible(true);
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
				Service2 s = new Service2();
				s.setVisible(true);
				dispose();
			}
			
		});
		
		
	}
	public static void main(String[]args)
	{
		new AdminProfile();
	}
	
}