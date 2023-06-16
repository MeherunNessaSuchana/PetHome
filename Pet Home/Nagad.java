
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nagad extends JFrame
{
	private Container c;
	private JButton b1,b2,b3,b4,b5;
	private Font f1,f2,f3,f4,f5;
	private JTextField t1;
	private JPasswordField p1;
	ImageIcon imgLogo;
	
	
	public Nagad()
	
	{
		c = this.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
	   
		setTitle("Nagad Payment");
		setBounds(300,100,1000,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imgLogo = new ImageIcon(getClass().getResource("logo.png"));
		this.setIconImage (imgLogo.getImage());
		
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
		f3 = new Font("Arial",Font.BOLD + Font.ITALIC, 18);
     	f4 = new Font("Courier",Font.PLAIN, 20);
		f5  = new Font("Courier",Font.PLAIN, 20);
		
		
	    b1 = new JButton("Nagad Number: "); 
		b1.setBounds (50,100,300,50) ; 
		b1.setFont(f1);
		c.add(b1);
		
		t1 = new JTextField();
		t1.setBounds(375,100,400,50);
		t1.setFont(f2);
		c.add(t1);
		
		
		b2 = new JButton("Enter Your Pin Number: ");
		b2.setBounds (50,200,300,50) ;
		b2.setFont(f2);
		c.add(b2);
		
		p1 = new JPasswordField();
		p1.setBounds(375,200,400,50);
		p1.setEchoChar('*');
		p1.setFont(f2);
		c.add(p1);
		
		
		b3 = new JButton("pay");
		b3.setBounds (300,350,300,80) ;
		b3.setFont(f3);
		c.add(b3);
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				String tF1 = t1.getText(); // User Name 
                String tF2 = p1.getText(); // Password

                if (tF1.isEmpty() || tF2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
                } 
                else 
                {
					JOptionPane.showMessageDialog(null, "Payment Done Successfully", "Payment Confirmation",JOptionPane.PLAIN_MESSAGE);		
					
				CustomerProfile frame = new CustomerProfile();
				frame.setVisible(true);
				
				dispose();	
				}
			}
			
		});
		
		b4 = new JButton("Back");
		b4.setBounds (10,500,100,40);
		b4.setFont(f4);
		c.add(b4);
		
		b4.addActionListener(new ActionListener() {
			
            public void actionPerformed (ActionEvent e)
			{
				PaymentOptions pay = new PaymentOptions();
				pay.setVisible(true);
				
				dispose();
			}
			
        });
		
		
	/*	b5 = new JButton("Exit");
		b5.setBounds (850,500,100,40);
		b5.setFont(f5);
		c.add(b5);
		
		b5.addActionListener(new ActionListener() {
			
            public void actionPerformed (ActionEvent e)
			{
				CustomerProfile frame = new CustomerProfile();
				frame.setVisible(true);
				
				dispose();
			}
			
        });
	*/	
		
	}
	public static void main(String[]args)
	{
		new Nagad();
	}
	
}
