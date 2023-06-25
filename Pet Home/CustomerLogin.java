
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class CustomerLogin extends JFrame
{
	
	JLabel l1,l2,l3,l4,l5;
	private JButton b1,b2,b3;
	JTextField t1;
	JPasswordField p1;
	ImageIcon imgLogo;

	private Font f1,f2,f3;
	private Container c;


	CustomerLogin()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("Pet Home- Customer Login");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setResizable(false);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imgLogo = new ImageIcon(getClass().getResource("logo.png"));
		this.setIconImage (imgLogo.getImage());

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

     	l3 = new JLabel();
     	l3.setText("If you don't have any account:- ");
     	l3.setBounds(500,495,200,50);
   		l3.setFont(f3);
     	l3.setOpaque(true);
     	l3.setForeground(Color.BLACK);
     	l3.setBackground(Color.GRAY);
     	c.add(l3);


     	t1 = new JTextField();
		t1.setBounds(210,110,160,30);
		t1.setFont(f2);
		c.add(t1);

		p1 = new JPasswordField();
		p1.setBounds(210,190,160,30);
		p1.setEchoChar('*');
		c.add(p1);

		b1= new JButton();
		b1.setText("Sign Up");
		b1.setBounds(730,500,200,40);
		b1.setFont(f1);
		b1.setForeground(Color.WHITE);
     	b1.setBackground(Color.BLACK);
		b1.setFocusable(false);
     	c.add(b1);

     	b2= new JButton();
		b2.setText("Back");
		b2.setBounds(50,500,200,40);
		b2.setFont(f1);
		b2.setForeground(Color.WHITE);
     	b2.setBackground(Color.BLACK);
		b2.setFocusable(false);
     	c.add(b2);

     	b3= new JButton();
		b3.setText("Login");
		b3.setBounds(400,150,200,40);
		b3.setFont(f1);
		b3.setForeground(Color.WHITE);
     	b3.setBackground(Color.BLACK);
		b3.setFocusable(false);
     	c.add(b3);
	

		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e)
			{
				Registration reg = new Registration();
				reg.setVisible(true);
				
				dispose();
			}
			
		});

		
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

                String tF1 = t1.getText(); // User Name 
                String tF2 = p1.getText(); // Password

                if (tF1.isEmpty() || tF2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
                else 
                {

                	String username = t1.getText();
                    String password = p1.getText();
                    String filePath = "./Data/user_data.txt";

                    boolean isMatchFound = false;

                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                    if (line.startsWith("User Name:")) {
                    String fileUsername = line.substring("User Name:".length()).trim();
                    String filePassword = reader.readLine().substring("Password:".length()).trim();

                    if (username.equals(fileUsername) && password.equals(filePassword)) 
                    {
                        isMatchFound = true;
                        setVisible(false);
                        CustomerProfile CsF = new CustomerProfile();
                        CsF.setVisible(true);
                        break;
                    }
                }
            }
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }

        //JOptionPane.showMessageDialog(null, "Username and Password incorrect!!", "Warning!",JOptionPane.WARNING_MESSAGE);

        System.out.println("Username and password match found: " + isMatchFound);
    }
}




					/*
                    try 
                    {


                        String userNameS = "User Name : " + tF1;
                        String passwordS = "Password : " + tF2;
                        BufferedReader reader = new BufferedReader(new FileReader("./Data/user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) 
                        {
                            String line = Files.readAllLines(Paths.get("./Data/user_data.txt")).get(i);
                            if (line.equals(userNameS)) 
                            {
                                String line2 = Files.readAllLines(Paths.get("./Data/user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) 
                                {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Pet Home",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Home frame = new Home();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } 
                    catch (Exception ex) 
                    {
                    	ex.printStackTrace();

                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }*/
        });
        
	
	}

	public static void main(String[] args) 
	{
		new CustomerLogin();
	}

}
