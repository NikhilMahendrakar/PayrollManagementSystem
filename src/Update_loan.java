import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Update_loan extends JFrame implements ActionListener,ItemListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2;
    Choice c3;
    
    Update_loan(){
        
        setLayout(null);
        c3 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from salary");
            while(rs.next()){
                c3.add(rs.getString("id"));    
            }
           
        }catch(Exception e){ }
       
        JLabel emp = new JLabel("Select Empid");
        emp.setBounds(20,20,100,20);
        add(emp);
        
        c3.setBounds(120,20,200,20);
        add(c3);
        
        l1 = new JLabel("Home Loan");
        t1 = new JTextField(15);
        
        l1.setBounds(20,60,100,20);
        t1.setBounds(120,60,200,20);
        add(l1);
        add(t1);
       
        l2 = new JLabel("persnal Loan");
        t2 = new JTextField(15);
        
        l2.setBounds(20,100,100,20);
        t2.setBounds(120,100,200,20);
        add(l2);
        add(t2);
       
        l3 = new JLabel("Bank");
        t3 = new JTextField(15);
        
        l3.setBounds(20,140,100,20);
        t3.setBounds(120,140,200,20);
        add(l3);
        add(t3);
       
        l4 =new JLabel("IFSC Code");
        t4 = new JTextField(15);
        
        l4.setBounds(20,180,100,20);
        t4.setBounds(120,180,200,20);
        add(l4);
        add(t4);
       
        b1 =new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Delete");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.setBounds(40,280,100,20);
        b2.setBounds(200,280,100,20);
        add(b1);
        add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        c3.addItemListener(this);
        
        getContentPane().setBackground(Color.WHITE);
       
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
           
        String home  = t1.getText();
        String id = c3.getSelectedItem();
        String personal = t2.getText();
        String bank = t3.getText();
        String ifsc = t4.getText();
      
            String qry = "update loans set home="+home+",personal="+personal+",bank='"+bank+"',ifsc='"+ifsc+"'   where id="+c3.getSelectedItem();
       
            try{
                conn c1 = new conn();
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"Loan Updated");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
        
        if(ae.getSource()==b2){
            
            try{
                conn c1 = new conn();
                c1.s.executeUpdate("delete from Loans where id="+c3.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Loan Deleted");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        try{
           conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from loans where id="+c3.getSelectedItem());
            if(rs.next()){
                t1.setText(rs.getString("home"));
                t2.setText(rs.getString("personal"));
                t3.setText(rs.getString("bank"));
                t4.setText(rs.getString("ifsc"));
         
            }
       }catch(Exception ee){
           ee.printStackTrace();
       }
        
        
    }
    
    public static void main(String[] args){
        new Update_loan();
    }
    
}
