import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loan_Taken extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c3;
    
    Loan_Taken(){
        
        super("Loan taken");
       
        setLayout(new GridLayout(8,2,20,20));
        c3 = new Choice();
       
        try{
           conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
      
            while(rs.next()){
                c3.add(rs.getString("id"));    
            }
        }catch(Exception e){ }
       
        add(new JLabel("Select Empid"));
        add(c3);
        
        l1 = new JLabel("Home Loan");
        t1 = new JTextField(15);
        add(l1);
        add(t1);
       
        l3 = new JLabel("persnal Loan");
        t3 = new JTextField(15);
        add(l3);
        add(t3);
        
        l4 = new JLabel("Bank");
        t4 = new JTextField(15);
        add(l4);
        add(t4); 
       
        l5 = new JLabel("IFSC Code");
        t5 = new JTextField(15);
        add(l5);
        add(t5);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
       
        add(b1);
        b1.addActionListener(this);
     
        setSize(450,550);
        setLocation(500,200);
        setVisible(true);
       
        
        getContentPane().setBackground(Color.WHITE);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String home  = t1.getText();
        String id = c3.getSelectedItem();
        String personal = t3.getText();
        String bank = t4.getText();
        String ifsc = t5.getText();
        String qry = "insert into loans values("+ id +","+home+","+personal+",'"+bank+"','"+ifsc+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Loan updated");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new  Loan_Taken();
    }
}