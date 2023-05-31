

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment extends JFrame 
{
	JButton b2;
	private Font f1;
    private JTextField entryDateField;
    private JTextField exitDateField;
    private JCheckBox foodType1CheckBox;
    private JCheckBox foodType2CheckBox;
    private JRadioButton singleSpaceRadioButton;
    private JRadioButton sharedSpaceRadioButton;
    private JLabel totalPaymentLabel;
	private Container c;

    public Payment() 
	{
		
		c = this.getContentPane();
     	c.setBackground(Color.GRAY);
		
        setTitle("Payment System");
        setBounds(300, 100, 1000, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
		setVisible(true);
		
		f1 = new Font("Arial",Font.BOLD + Font.ITALIC, 20);

        JLabel entryDateLabel = new JLabel("Entry Date (dd-MM-yyyy):");
        entryDateLabel.setBounds(50, 50, 150, 30);
        c.add(entryDateLabel);

        entryDateField = new JTextField();
        entryDateField.setBounds(200, 50, 150, 30);
        c.add(entryDateField);

        JLabel exitDateLabel = new JLabel("Exit Date (dd-MM-yyyy):");
        exitDateLabel.setBounds(50, 100, 150, 30);
        c.add(exitDateLabel);

        exitDateField = new JTextField();
        exitDateField.setBounds(200, 100, 150, 30);
        c.add(exitDateField);

        JLabel foodLabel = new JLabel("Food:");
        foodLabel.setBounds(50, 150, 100, 30);
        c.add(foodLabel);

        foodType1CheckBox = new JCheckBox("Food Type 1 (200 Taka)");
        foodType1CheckBox.setBounds(200, 150, 200, 30);
        c.add(foodType1CheckBox);

        foodType2CheckBox = new JCheckBox("Food Type 2 (400 Taka)");
        foodType2CheckBox.setBounds(400, 150, 200, 30);
        c.add(foodType2CheckBox);

        JLabel spaceLabel = new JLabel("Space:");
        spaceLabel.setBounds(50, 200, 100, 30);
        c.add(spaceLabel);

        singleSpaceRadioButton = new JRadioButton("Single Space (300 Taka)");
        singleSpaceRadioButton.setBounds(200, 200, 200, 30);
        c.add(singleSpaceRadioButton);

        sharedSpaceRadioButton = new JRadioButton("Shared Space (200 Taka)");
        sharedSpaceRadioButton.setBounds(400, 200, 200, 30);
        c.add(sharedSpaceRadioButton);

        ButtonGroup spaceGroup = new ButtonGroup();
        spaceGroup.add(singleSpaceRadioButton);
        spaceGroup.add(sharedSpaceRadioButton);

        JButton totalPaymentButton = new JButton("Show Total Payment");
        totalPaymentButton.setBounds(200, 250, 200, 30);
        c.add(totalPaymentButton);

        totalPaymentLabel = new JLabel("Total Payment: ");
        totalPaymentLabel.setBounds(200, 300, 200, 30);
        c.add(totalPaymentLabel);

        JButton payButton = new JButton("Pay");
        payButton.setBounds(200, 350, 200, 30);
        c.add(payButton);

        totalPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalPayment();
            }
        });

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e)
			{
				PaymentOptions pay = new PaymentOptions();
				pay.setVisible(true);
				
				dispose();
			}
			
        });
		
		
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
				Insert back = new Insert();
				back.setVisible(true);
				dispose();
			}
			
		});
		

    }

    private void calculateTotalPayment() 
	{
        String entryDateStr = entryDateField.getText();
        String exitDateStr = exitDateField.getText();

        int foodCost =0;
		if (foodType1CheckBox.isSelected())
		{
			foodCost += 200;
		}
		else if (foodType2CheckBox.isSelected())
		{
			foodCost += 400;
		}
		    int spaceCost = 0;
    if (singleSpaceRadioButton.isSelected()) {
        spaceCost = 300;
    } else if (sharedSpaceRadioButton.isSelected()) {
        spaceCost = 200;
    }

    int totalPayment = calculateDateDifference(entryDateStr, exitDateStr) * (foodCost + spaceCost);

    totalPaymentLabel.setText("Total Payment: " + totalPayment + " Taka");
	}

private int calculateDateDifference(String entryDateStr, String exitDateStr) {
    try {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date entryDate = dateFormat.parse(entryDateStr);
        Date exitDate = dateFormat.parse(exitDateStr);

        long diff = exitDate.getTime() - entryDate.getTime();
        long days = diff / (24 * 60 * 60 * 1000);

        return (int) days;
    } catch (ParseException e) {
        return 0;
    }
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new Payment();
    });
}

}
