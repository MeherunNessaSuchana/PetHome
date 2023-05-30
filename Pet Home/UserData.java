
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class UserData extends JFrame {

    

    //private ImageIcon icon;
    JLabel l1;
    Font f1,f2,f3;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton b1, b2, b3, b4,b5;

    private Container c;

    private String[] column = { "User Name", "Password", "Pho. Number", "Gender", "Date OF Birth", "Email" };
    private String[] rows = new String[6];

    UserData() {
        
        c = this.getContentPane();
        c.setBackground(Color.GRAY);

        setTitle("Pet Home- Customer Login");
        setBounds(300, 100, 1000,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1 = new Font("Arial",Font.BOLD, 50);
        f2 = new Font("Courier",Font.BOLD, 20);
        f3 = new Font("Courier",Font.PLAIN, 15);


        // Title
        l1 = new JLabel();
        l1.setText("User Data");
        l1.setBounds(200, 10, 400, 80);
        l1.setFont(f1);
        l1.setOpaque(true);
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.GRAY);
        c.add(l1);

        // JButtons
        b1 = new JButton("Refresh");
        b1.setBounds(54, 418, 184, 50);
        b1.setFont(f2);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        c.add(b1);

        b2 = new JButton("Delete");
        b2.setBounds(248, 418, 184, 50);
        b2.setFont(f2);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        c.add(b2);

        b3 = new JButton("Add");
        b3.setBounds(442, 418, 184, 50);
        b3.setFont(f2);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        c.add(b3);

        b4 = new JButton("Back");
        b4.setBounds(10,500,100,40);
        b4.setFont(f2);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        c.add(b4);

        b5 = new JButton("Log Out");
        b5.setBounds(880,10,100,20);
        b5.setFont(f3);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        c.add(b5);

        // JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.BLUE);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        String file = "./Data/user_data.txt";
        String temp = "./Data/temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Pho. Numbwr
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); // Gender
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // Date of birth
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Email
                    model.addRow(rows);
                }
            }

        } 
        catch (Exception ex) 
        {
            return;
        }

        // Refresh Button
        b1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e) 
            {

                UserData frame = new UserData();
                frame.setVisible(true);

            }
        });

        // Delete Button
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
             {

                if (table.getSelectionModel().isSelectionEmpty())
                 {
                    JOptionPane.showMessageDialog(null, "Please select data to delete", "Warning!",JOptionPane.WARNING_MESSAGE);
                 }
                 else 
                 {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try 
                    {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) 
                                {
                                    q = i;
                                }
                            }
                        }
                    } 
                    catch (Exception ex)
                    {
                        return;
                    }

                    try 
                    {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } 
                    catch (Exception ex) 
                    {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    UserData frame = new UserData();
                    frame.setVisible(true);
                }

            }
        });

        // Add Button
        b3.addActionListener(new ActionListener()
        {
            
            public void actionPerformed (ActionEvent e)
            {
                AdminAdd add = new AdminAdd();
                add.setVisible(true);
                
                dispose();
            }
            
        });

        // Back Button
        b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                AdminProfile admin = new AdminProfile();
                admin.setVisible(true);

                dispose();
                
            }
        });

        // logout Button
        b5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                Home home = new Home();
                home.setVisible(true);

                dispose();
            }
        });
    }

    public static void main(String[] args) 
    {

        new UserData();
        
    }
}
