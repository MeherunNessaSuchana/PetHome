
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Home extends JFrame
{
	JLabel imagelabel0, welcome;
	ImageIcon img0;
	JButton b1,b2,b3,b4;
	private Container c;
	private Font f;

    Home()
    {

     	c = this.getContentPane();
     	c.setBackground(Color.GRAY);
		
		img0 = new ImageIcon(getClass().getResource("img0.png"));
		imagelabel0 = new JLabel(img0);
		imagelabel0.setBounds(275, 100, 600, 450);
		c.add(imagelabel0);

     	setTitle("PET HOME");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f = new Font("Arial",Font.BOLD + Font.ITALIC, 40);
		
		welcome = new JLabel();
     	welcome.setText("   WELCOME to our PET HOME");
     	welcome.setBounds(250,5,650, 90);
   		welcome.setFont(f);
     	welcome.setOpaque(true);
     	welcome.setForeground(Color.WHITE);
     	welcome.setBackground(Color.BLACK);
     	c.add(welcome);

     	b1 = new JButton("Login/Registar");
     	b1.setBounds(20,200,200,50);
     	c.add(b1);

     	b2 = new JButton("Admin");
     	b2.setBounds(20,50,200,50);
     	c.add(b2);

     	b3 = new JButton("Services");
     	b3.setBounds(20,300,200,50);
     	c.add(b3);

     	b4 = new JButton("About");
     	b4.setBounds(20,450,200,50);
     	c.add(b4);
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				CustomerLogin cuslog = new CustomerLogin();
				cuslog.setVisible(true);
				
				dispose();
			}
			
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);

				dispose();
			}


		});
		
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Service service = new Service();
				service.setVisible(true);
				
				dispose();
			}
			
		});
		
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				About about = new About();
				about.setVisible(true);
				
				dispose();
			}
			
		});
		
		
		
	}
	
}