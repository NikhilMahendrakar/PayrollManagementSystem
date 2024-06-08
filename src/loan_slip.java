import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loan_slip extends JFrame implements ActionListener{

    Choice c1;
    JTextArea t1;
    JButton b1;

    loan_slip(){
        
        setSize(800,700);
        setLocation(400,150);
        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from loans");
            while(rs.next()){
                c1.add(rs.getString("id"));
            }
        }catch(Exception e) { }
    
        setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Select id"));
        p1.add(c1);
        add(p1,"North");
        // c1.addItemListener(this);
    
        t1 = new JTextArea(30,80);
        JScrollPane jsp = new JScrollPane(t1);
     
        Font f1 = new Font("arial",Font.BOLD,20);
        t1.setFont(f1);
        
        b1 = new JButton("Generate Loan Slip");
    
        add(b1,"South");
        add(jsp,"Center");
        b1.addActionListener(this);
    
    }
   
    public void actionPerformed(ActionEvent e) {
     
        try{
            conn c = new conn();
         
            ResultSet rs = c.s.executeQuery("select * from employee where id="+c1.getSelectedItem());
          
            rs.next();
            String name = rs.getString("name");
            rs.close();
            
            ResultSet rf = c.s.executeQuery("select * from loans where id="+c1.getSelectedItem());
            rf.next();
            String bank = rf.getString("bank");
            String ifsc = rf.getString("ifsc");
            rf.close();
            
            
            ResultSet rg = c.s.executeQuery("select * from salary where id="+c1.getSelectedItem());
            rg.next();
            double hra = rg.getDouble("hra");
            double da  = rg.getDouble("da");
            double med  = rg.getDouble("med");
            double pf  = rg.getDouble("pf");
            double basic = rg.getDouble("basic_salary");
            rg.close();
            
            rs = c.s.executeQuery("select * from loans where id="+c1.getSelectedItem());
            
            double total=0;
            double gross=0;
            double net=0;
            double paid=0;
            double remaing=0;
            
            java.util.Date d1 = new java.util.Date();
            int month = d1.getMonth();
            t1.setText(" ----------------   LOAN SLIP FOR THE MONTH OF "+month+" ,2020  ------------------------");
            t1.append("\n");
  
            if(rs.next()){
          
                t1.append("\n     Employee ID "+rs.getString("id"));
                t1.append("\n     Employee Name "+name);
 
                t1.append("\n----------------------------------------------------------------");
                t1.append("\n");

                double home = rs.getDouble("home");
                t1.append("\n                  HOME LOAN        : "+home);
                double personal  = rs.getDouble("personal");
                t1.append("\n                  PERSONAL LOAN          : "+personal);
                t1.append("\n                  BANK Name     : "+bank);
                t1.append("\n                  IFSC Code     : "+ifsc);
                
                gross = hra+da+med+pf+basic;
                net = gross - pf;
                
                total = home+personal;
                
                paid=total/60;
                
                remaing=total-paid;

                t1.append("\n-------------------------------------------------------");
                t1.append("\n");
 
                t1.append("\n                 TOTAL LOAN :"+total+"    \n ");
                t1.append("\n                 PAID AMMOUNT :"+paid+"    \n ");
                t1.append("\n                 REMAING LOAN :"+remaing+"    \n ");
                t1.append("\n -------------------------------------------------");
                t1.append("\n");
                t1.append("\n");    
                t1.append("\n");
                t1.append("   (  Signature  )      ");

            }
        }catch(Exception ee) {
            ee.printStackTrace();
        }
 
   
    }
    public static void main(String[] args){
        new loan_slip().setVisible(true);
    }
}
