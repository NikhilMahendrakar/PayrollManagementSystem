import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project extends JFrame implements ActionListener {
       
    private static JLabel backgroundImageLabel;
    project(){
        
        JLabel background;
        setSize(2000,1100);
        ImageIcon img = new ImageIcon("payroll.jpeg");
        getContentPane().setBackground(Color.white);
         
        backgroundImageLabel = new JLabel(new ImageIcon(getClass().getResource("/icon/payroll.jpeg")));
        backgroundImageLabel.setBounds(0,0,1900,1000);
        
        add(backgroundImageLabel);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
       
        
        JMenu m1 = new JMenu("Add");
        m1.setForeground(Color.BLUE);
        m1.setFont(new Font("monospaced",Font.PLAIN,25));
    
        JMenuItem t1 = new JMenuItem("New Employee");
    
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,20));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/New.png")));
        

    
        JMenuItem t2 = new JMenuItem("Salary");
        t2.setForeground(Color.blue);
        t2.setFont(new Font("monospaced",Font.PLAIN,20));
        t2.setMnemonic('S');
        t2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/schedreport.png")));
        t2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
      
        JMenuItem t3 = new JMenuItem("Take Attendence");

        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,20));
        t3.setMnemonic('T');
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.PNG")));
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        
        
        JMenuItem t4 = new JMenuItem("Loan Taken");

        t4.setForeground(Color.blue);
        t4.setFont(new Font("monospaced",Font.PLAIN,20));
        t4.setMnemonic('H');
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/BRANCH.PNG")));
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
     
        
        m1.add(t1);
        m1.add(t2);
        m1.add(t3);
        m1.add(t4);
        
        mb.add(m1);
    
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        
        JMenu edit =new JMenu("Update");
        edit.setForeground(Color.BLUE);
        edit.setFont(new Font("monospaced",Font.PLAIN,25));
   
        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,20));
        s1.setMnemonic('U');
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/EditOpen.png")));
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
    
        edit.add(s1);
    
        JMenuItem s2 = new JMenuItem("Update Employee");
   
        s2.setForeground(Color.blue);
        s2.setFont(new Font("monospaced",Font.PLAIN,20));
        s2.setMnemonic('M');
        s2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        edit.add(s2);
        
        JMenuItem s3 = new JMenuItem("Update Loan");
   
        s3.setForeground(Color.blue);
        s3.setFont(new Font("monospaced",Font.PLAIN,20));
        s3.setMnemonic('G');
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        edit.add(s3);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        
        JMenu rep =new JMenu("Queries");
        rep.setForeground(Color.blue);
        rep.setFont(new Font("monospaced",Font.PLAIN,25));
    
        mb.add(rep);
        JMenuItem p1 = new JMenuItem("Generate PaySlip");
   
    
        p1.setForeground(Color.blue);
        p1.setFont(new Font("monospaced",Font.PLAIN,20));
        p1.setMnemonic('P');
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        rep.add(p1);
        
        JMenuItem p4 = new JMenuItem("Generate LoanSlip");
   
    
        p4.setForeground(Color.blue);
        p4.setFont(new Font("monospaced",Font.PLAIN,20));
        p4.setMnemonic('F');
        p4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        p4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        rep.add(p4);
        
        JMenuItem p2 = new JMenuItem("List Attendence");
   
        p2.setForeground(Color.blue);
        p2.setFont(new Font("monospaced",Font.PLAIN,20));
        p2.setMnemonic('L');
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        rep.add(p2);
        
        JMenuItem p3 = new JMenuItem("List Employee");
      
        p3.setForeground(Color.blue);
        p3.setFont(new Font("monospaced",Font.PLAIN,20));
        p3.setMnemonic('R');
        p3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/newinvoice.png")));
        p3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        rep.add(p3);
        
        p1.addActionListener(this);
        p2.addActionListener(this);
        p3.addActionListener(this);
        p4.addActionListener(this);
     
        JMenu m8=new JMenu("Exit");
        m8.setForeground(Color.blue);
        m8.setFont(new Font("monospaced",Font.PLAIN,25));
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.blue));
        m8i1.setFont(new Font("monospaced", Font.PLAIN,20));
        m8i1.setMnemonic('X');
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/exit.PNG")));
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        m8i1.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
      
        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Take Attendence"))
            new TakeAttendence().setVisible(true);
        else if(msg.equals("Loan Taken"))
            new Loan_Taken().setVisible(true);
        else if(msg.equals("Update Loan"))
            new Update_loan().setVisible(true);
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Generate PaySlip"))
            new pay_slip().setVisible(true);
         else if(msg.equals("Generate LoanSlip"))
            new loan_slip().setVisible(true);
        else if(msg.equals("List Attendence"))
            new List_Attendence().setVisible(true);
    }
    
    public static void main(String[] args){
        new project().setVisible(true);
    }
    
}
