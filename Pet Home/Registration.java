
/*
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

@SuppressWarnings("unchecked")

public class Registration extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	JComboBox cb1;

	//ImageIcon img;
	private Font f1,f2;
	private Container c;


	Registration()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("Pet Home- REGISTRATION");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	//setVisible(true);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Courier",Font.PLAIN, 18);

     	l1 = new JLabel();
     	l1.setText("Name:- ");
     	l1.setBounds(100,50,190,50);
   		l1.setFont(f1);
     	l1.setOpaque(true);
     	l1.setForeground(Color.BLACK);
     	l1.setBackground(Color.GRAY);
     	c.add(l1);

     	l2 = new JLabel();
     	l2.setText("Mobile num:- ");
     	l2.setBounds(100,120,190,50);
   		l2.setFont(f1);
     	l2.setOpaque(true);
     	l2.setForeground(Color.BLACK);
     	l2.setBackground(Color.GRAY);
     	c.add(l2);

     	l3 = new JLabel();
     	l3.setText("Date of Birth:- ");
     	l3.setBounds(100,190,190,50);
   		l3.setFont(f1);
     	l3.setOpaque(true);
     	l3.setForeground(Color.BLACK);
     	l3.setBackground(Color.GRAY);
     	c.add(l3);

     	l4 = new JLabel();
     	l4.setText("Gender:- ");
     	l4.setBounds(100,260,190,50);
   		l4.setFont(f1);
     	l4.setOpaque(true);
     	l4.setForeground(Color.BLACK);
     	l4.setBackground(Color.GRAY);
     	c.add(l4);

     	l5 = new JLabel();
     	l5.setText("Email:- ");
     	l5.setBounds(100,330,190,50);
   		l5.setFont(f1);
     	l5.setOpaque(true);
     	l5.setForeground(Color.BLACK);
     	l5.setBackground(Color.GRAY);
     	c.add(l5);

     	l6 = new JLabel();
     	l6.setText("Password:- ");
     	l6.setBounds(100,400,190,50);
   		l6.setFont(f1);
     	l6.setOpaque(true);
     	l6.setForeground(Color.BLACK);
     	l6.setBackground(Color.GRAY);
     	c.add(l6);


		t1 = new JTextField();
		t1.setBounds(310,50,190,50);
		t1.setFont(f2);
		c.add(t1);


		t2 = new JTextField();
		t2.setBounds(310,120,190,50);
		t2.setFont(f2);
		c.add(t2);

		t3 = new JTextField();
		t3.setBounds(310,190,190,50);
		t3.setFont(f2);
		c.add(t3);

		String[] petType ={"Male","Female","Others"};
     	cb1 = new JComboBox(petType);
     	cb1.setLayout(null);
     	cb1.setBounds(310,260,190,50);
     	cb1.setSelectedIndex(0);
     	cb1.setFont(f2);
		c.add(cb1);

		t4 = new JTextField();
		t4.setBounds(310,330,190,50);
		t4.setFont(f2);
		c.add(t4);

		t5 = new JTextField();
		t5.setBounds(310,400,190,50);
		t5.setFont(f2);
		c.add(t5);


		b1= new JButton();
		b1.setText("Submit");
		b1.setBounds(730,500,200,40);
		b1.setFont(f1);
		b1.setForeground(Color.WHITE);
     	b1.setBackground(Color.BLACK);
     	c.add(b1);

     	b2= new JButton();
		b2.setText("Back");
		b2.setBounds(50,500,200,40);
		b2.setFont(f1);
		b2.setForeground(Color.WHITE);
     	b2.setBackground(Color.BLACK);
     	c.add(b2);
		
		b2.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				Customer_Login cuslog = new Customer_Login();
				cuslog.setVisible(true);
				
				dispose();
			}
			
		});

		b1.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent ae)
			{
				String tF1 = t1.getText().toLowerCase(); // User Name
                String tF2 = t2.getText(); // num
                String tF3 = t3.getText(); // dob
                String tF4 = t4.getText(); // email
                String tF5 = t5.getText(); // pass

                String gen = String.valueOf(cb1.getSelectedItem()); //gender

                if (tF1.isEmpty() || tF2.isEmpty() || tF3.isEmpty() || tF4.isEmpty()
                            || tF5.isEmpty() || ((cb1.getSelectedIndex()) == 0))
                    {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                else
                {
                	try {
                            File file = new File("C:\\Users\\tanmo\\OneDrive\\Desktop\\New folder (2)\\Project\\Project\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            //LocalDateTime myDateObj = LocalDateTime.now();
                            //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            //String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + tF1);
                            pw.println("Password : " + tF5);
                            pw.println("Number : " + tF2);
                            pw.println("Gender : " + gen);
                            pw.println("Date of Birth : " + tF3);
                            pw.println("Email : " + tF4);
                            pw.println("===============================================");
                            pw.close();

                        } 
                    catch (Exception ex) 
                    	{
                            System.out.print(ex);
                        }
    				JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Customer_Login frame = new Customer_Login();
                        frame.setVisible(true);

                    }  
                }  
            });        
		}


	public static void main(String[] args) 
	{

        Registration frame = new Registration();

        frame.setVisible(true);
    }
}
*/

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

@SuppressWarnings("unchecked")
public class Registration extends JFrame {
	JLabel l1, l2, l3, l4, l5, l6;
	JButton b1, b2;
	JTextField t1, t2, t3, t4, t5;
	JComboBox<String> cb1;
	Font f1, f2;
	
	private Container c;

	Registration() {
		c = this.getContentPane();
		c.setBackground(Color.GRAY);

		setTitle("Pet Home- REGISTRATION");
		setBounds(300, 100, 1000, 600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f1 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
		f2 = new Font("Courier", Font.PLAIN, 18);

		l1 = new JLabel();
		l1.setText("Name:- ");
		l1.setBounds(100, 50, 190, 50);
		l1.setFont(f1);
		l1.setOpaque(true);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.GRAY);
		c.add(l1);

		l2 = new JLabel();
		l2.setText("Mobile num:- ");
		l2.setBounds(100, 120, 190, 50);
		l2.setFont(f1);
		l2.setOpaque(true);
		l2.setForeground(Color.BLACK);
		l2.setBackground(Color.GRAY);
		c.add(l2);

		l3 = new JLabel();
		l3.setText("Date of Birth:- ");
		l3.setBounds(100, 190, 190, 50);
		l3.setFont(f1);
		l3.setOpaque(true);
		l3.setForeground(Color.BLACK);
		l3.setBackground(Color.GRAY);
		c.add(l3);

		l4 = new JLabel();
		l4.setText("Gender:- ");
		l4.setBounds(100, 260, 190, 50);
		l4.setFont(f1);
		l4.setOpaque(true);
		l4.setForeground(Color.BLACK);
		l4.setBackground(Color.GRAY);
		c.add(l4);

		l5 = new JLabel();
		l5.setText("Email:- ");
		l5.setBounds(100, 330, 190, 50);
		l5.setFont(f1);
		l5.setOpaque(true);
		l5.setForeground(Color.BLACK);
		l5.setBackground(Color.GRAY);
		c.add(l5);

		l6 = new JLabel();
		l6.setText("Password:- ");
		l6.setBounds(100, 400, 190, 50);
		l6.setFont(f1);
		l6.setOpaque(true);
		l6.setForeground(Color.BLACK);
		l6.setBackground(Color.GRAY);
		c.add(l6);

		t1 = new JTextField();
		t1.setBounds(310, 50, 190, 50);
		t1.setFont(f2);
		c.add(t1);

		t2 = new JTextField();
		t2.setBounds(310, 120, 190, 50);
		t2.setFont(f2);
		c.add(t2);

		t3 = new JTextField();
		t3.setBounds(310, 190, 190, 50);
		t3.setFont(f2);
		c.add(t3);

		String[] petType = {"Male", "Female", "Others"};
		cb1 = new JComboBox<>(petType);
		cb1.setLayout(null);
		cb1.setBounds(310, 260, 190, 50);
		cb1.setSelectedIndex(0);
		cb1.setFont(f2);
		c.add(cb1);
		t4 = new JTextField();
		t4.setBounds(310, 330, 190, 50);
		t4.setFont(f2);
		c.add(t4);

		t5 = new JTextField();
		t5.setBounds(310, 400, 190, 50);
		t5.setFont(f2);
		c.add(t5);

		b1 = new JButton();
		b1.setText("Submit");
		b1.setBounds(730, 500, 200, 40);
		b1.setFont(f1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		c.add(b1);

		b2 = new JButton();
		b2.setText("Back");
		b2.setBounds(50, 500, 200, 40);
		b2.setFont(f1);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		c.add(b2);

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin cuslog = new CustomerLogin();
				cuslog.setVisible(true);
				dispose();
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String tF1 = t1.getText().toLowerCase(); // User Name
				String tF2 = t2.getText(); // num
				String tF3 = t3.getText(); // dob
				String tF4 = t4.getText(); // email
				String tF5 = t5.getText(); // pass

				String gen = String.valueOf(cb1.getSelectedItem()); // gender

				if (tF1.isEmpty() || tF2.isEmpty() || tF3.isEmpty() || tF4.isEmpty() || tF5.isEmpty()
						|| cb1.getSelectedIndex() == -1) { // Changed the condition here
					JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
							JOptionPane.WARNING_MESSAGE);
				} else {
					try {
						File file = new File("./Data/user_data.txt");
						if (!file.exists()) {
							file.createNewFile();
						}
						FileWriter fw = new FileWriter(file, true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(bw);

						pw.println("User Name: " + tF1);
						pw.println("Password: " + tF5);
						pw.println("Number: " + tF2);
						pw.println("Gender: " + gen);
						pw.println("Date of Birth: " + tF3);
						pw.println("Email: " + tF4);
						pw.println("===============================================");
						pw.close();

						JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
								"Registration Complete", JOptionPane.WARNING_MESSAGE);
						setVisible(false);
						CustomerLogin frame = new CustomerLogin();
						frame.setVisible(true);
					} catch (Exception ex) {
						System.out.print(ex);
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		Registration frame = new Registration();
		frame.setVisible(true);
	}
}





