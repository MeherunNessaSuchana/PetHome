import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

@SuppressWarnings("unchecked")
public class Insert extends JFrame
{

	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	JComboBox<String> cb1,cb2,cb3;

	//ImageIcon img;
	private Font f1,f2;
	private Container c;


	Insert()
	{
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);

     	setTitle("INSERT");
     	setBounds(300, 100, 1000,600);
     	setLayout(null);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);
     	f2 = new Font("Courier",Font.PLAIN, 18);

     	l1 = new JLabel();
     	l1.setText("Pet Type:- ");
     	l1.setBounds(100,50,190,50);
   		l1.setFont(f1);
     	l1.setOpaque(true);
     	l1.setForeground(Color.BLACK);
     	l1.setBackground(Color.GRAY);
     	c.add(l1);

     	l2 = new JLabel();
     	l2.setText("Pet Name:- ");
     	l2.setBounds(100,120,190,50);
   		l2.setFont(f1);
     	l2.setOpaque(true);
     	l2.setForeground(Color.BLACK);
     	l2.setBackground(Color.GRAY);
     	c.add(l2);

     	l3 = new JLabel();
     	l3.setText("Any Disease:- ");
     	l3.setBounds(100,190,190,50);
   		l3.setFont(f1);
     	l3.setOpaque(true);
     	l3.setForeground(Color.BLACK);
     	l3.setBackground(Color.GRAY);
     	c.add(l3);


     	/*l4 = new JLabel();
     	l4.setText(":- ");
     	l4.setBounds(100,260,190,50);
   		l4.setFont(f1);
     	l4.setOpaque(true);
     	l4.setForeground(Color.BLACK);
     	l4.setBackground(Color.GRAY);
     	c.add(l4);
     	*/

     	l5 = new JLabel();
     	l5.setText("PickUP Option:- ");
     	l5.setBounds(100,260,190,50);
   		l5.setFont(f1);
     	l5.setOpaque(true);
     	l5.setForeground(Color.BLACK);
     	l5.setBackground(Color.GRAY);
     	c.add(l5);

     	l6 = new JLabel();
     	l6.setText("Delivary Option:- ");
     	l6.setBounds(100,330,190,50);
   		l6.setFont(f1);
     	l6.setOpaque(true);
     	l6.setForeground(Color.BLACK);
     	l6.setBackground(Color.GRAY);
     	c.add(l6);
     	


     	String Pet_Type[]= new String[]{"Dog","Cat","Bird","Fish"};
     	cb1 = new JComboBox(Pet_Type);
     	cb1.setLayout(null);
     	cb1.setBounds(310,50,190,50);
     	cb1.setFont(f2);
		c.add(cb1);


		t1 = new JTextField();
		t1.setBounds(310,120,190,50);
		t1.setFont(f2);
		c.add(t1);


		t2 = new JTextField();
		t2.setBounds(310,190,190,50);
		t2.setFont(f2);
		c.add(t2);

		/*t3 = new JTextField();
		t3.setBounds(310,260,190,50);
		t3.setFont(f2);
		c.add(t3);
		*/

		String pickup[]= new String[]{"Home Pickup","Shop Dropping"};
     	cb2 = new JComboBox(pickup);
     	cb2.setLayout(null);
     	cb2.setBounds(310,260,190,50);
     	cb2.setFont(f2);
		c.add(cb2);

		String delivary[]= new String[]{"Shop Pickup","Home Delivary"};
     	cb3 = new JComboBox(delivary);
     	cb3.setLayout(null);
     	cb3.setBounds(310,330,190,50);
     	cb3.setFont(f2);
		c.add(cb3);

		



		b1= new JButton();
		b1.setText("Submit");
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



     	b2.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				CustomerProfile back = new CustomerProfile();
				back.setVisible(true);
				dispose();
			}
			
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				String pet = String.valueOf(cb1.getSelectedItem()); // pet

				String tF1 = t1.getText(); // pet Name
				String tF2 = t2.getText(); // disease
				//String tF3 = t3.getText(); // exit date

				String pickup = String.valueOf(cb2.getSelectedItem()); // pickup
				String delivary = String.valueOf(cb3.getSelectedItem()); // delivary

				//System.out.println(pickup);


				if (tF1.isEmpty() || tF2.isEmpty() ||
				cb1.getSelectedIndex() == -1 || cb2.getSelectedIndex() == -1 || cb3.getSelectedIndex() == -1 ) 
				{
					JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
							JOptionPane.WARNING_MESSAGE);
				} else 
				{
					try
					 {
						File file = new File("./Data/pet_data.txt");
						if (!file.exists()) 
						{
							file.createNewFile();
						}
						FileWriter fw = new FileWriter(file, true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(bw);

						pw.println("Pet Type: " + cb1);
						pw.println("Pet Name: " + tF1);
						pw.println("Any Disease: " + tF2);
						//pw.println("Exit Date: " + tF3);
						pw.println("Pickup Option: " + cb2);
						pw.println("Delivary Option: " + cb3);
						pw.println("===============================================");
						pw.close();

						//JOptionPane.showMessageDialog(null, "Pet Input Done","Registration Complete", JOptionPane.WARNING_MESSAGE);setVisible(false);
						Payment frame = new Payment();
						frame.setVisible(true);
					} 
					catch (Exception ex) 
					{
						System.out.print(ex);
					}
				}
			}
		});


	}
	

	public static void main(String[] args) 
	{
		new Insert();
	
	}
}