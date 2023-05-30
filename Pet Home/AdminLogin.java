

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminLogin extends JFrame
{
	
	JLabel l1,l2,l3,l4,l5;
	private JButton b1,b2,b3;
	JTextField t1;
	JPasswordField p1;

	private Font f1,f2,f3;
	private Container c;


	AdminLogin()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("Pet Home- Admin Login");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setResizable(false);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	f1 = new Font("Arial",Font.BOLD, 20);
     	f2 = new Font("Courier",Font.BOLD, 20);
     	f3 = new Font("Courier",Font.PLAIN, 15);

     	l1 = new JLabel();
     	l1.setText("User Name:- ");
     	l1.setBounds(50,100,150,50);
   		l1.setFont(f1);
     	l1.setOpaque(true);
     	l1.setForeground(Color.BLACK);
     	l1.setBackground(Color.GRAY);
     	c.add(l1);

     	l2 = new JLabel();
     	l2.setText("Password:- ");
     	l2.setBounds(50,180,150,50);
   		l2.setFont(f1);
     	l2.setOpaque(true);
     	l2.setForeground(Color.BLACK);
     	l2.setBackground(Color.GRAY);
     	c.add(l2);


     	t1 = new JTextField();
		t1.setBounds(210,110,160,30);
		t1.setFont(f2);
		c.add(t1);

		p1 = new JPasswordField();
		p1.setBounds(210,190,160,30);
		p1.setEchoChar('*');
		c.add(p1);

	/*	b1= new JButton();
		b1.setText("Sign Up");
		b1.setBounds(730,500,200,40);
		b1.setFont(f1);
		b1.setForeground(Color.WHITE);
     	b1.setBackground(Color.BLACK);
     	c.add(b1);
		
	*/

     	b2= new JButton();
		b2.setText("Home");
		b2.setBounds(50,500,200,40);
		b2.setFont(f1);
		b2.setForeground(Color.WHITE);
     	b2.setBackground(Color.BLACK);
     	c.add(b2);

     	b3= new JButton();
		b3.setText("Login");
		b3.setBounds(200,300,200,40);
		b3.setFont(f1);
		b3.setForeground(Color.WHITE);
     	b3.setBackground(Color.BLACK);
     	c.add(b3);

		
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Home home = new Home();
				home.setVisible(true);
				
				dispose();
			}
			
		});

		b3.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				String tF1 = t1.getText(); // Admin Name
                String tF2 = p1.getText(); // Password

                if (tF1.isEmpty() || tF2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
                } 
                else 
                {

                    try {

                        String userName = "Name : " + tF1;
                        String password = "Password : " + tF2;
                        BufferedReader reader = new BufferedReader(new FileReader("./Data/admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("./Data/admin_data.txt")).get(i);
                            if (line.equals(userName)) {
                                String line2 = Files.readAllLines(Paths.get("./Data/admin_data.txt")).get((i + 1));
                                if (line2.equals(password)) {
                                    //JOptionPane.showMessageDialog(null, "Admin Login Successful.", "Pet Home",JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    AdminProfile frame = new AdminProfile();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } 
                    catch (Exception ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }




			}









		});
		
        
	}

	public static void main(String[] args) 
	{
		new AdminLogin();
	}

}