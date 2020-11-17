import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomerLogin extends javax.swing.JFrame 
{
    public CustomerLogin() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        s1 = new javax.swing.JSeparator();
        b3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("PHONE");
        l3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(l3);
        l3.setBounds(180, 180, 150, 35);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("CITY");
        l4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(l4);
        l4.setBounds(180, 260, 150, 35);

        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("NAME");
        l2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(l2);
        l2.setBounds(180, 110, 150, 35);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t1);
        t1.setBounds(490, 110, 300, 35);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t2);
        t2.setBounds(490, 180, 300, 35);

        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t3);
        t3.setBounds(490, 260, 300, 35);

        b1.setText("REGISTER");
        b1.setBorder(new javax.swing.border.MatteBorder(null));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(560, 340, 100, 35);

        l5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("Login if you are an existing customer:");
        getContentPane().add(l5);
        l5.setBounds(170, 440, 300, 35);

        b2.setText("LOGIN");
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(560, 440, 100, 35);

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Register if you are a new customer:");
        getContentPane().add(l1);
        l1.setBounds(170, 40, 300, 35);

        s1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(s1);
        s1.setBounds(128, 402, 700, 10);

        b3.setText("HOME");
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(850, 20, 100, 35);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Login l=new Login ();
        l.setVisible(true);
        this.hide();
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        JFrame f;  
        f=new JFrame();
        String name=t1.getText();
        String phone=t2.getText();
        String city=t3.getText();
        
        if(name.equals("") || phone.equals("") || city.equals(""))
        {
                JOptionPane.showMessageDialog(null,"All fields are required");
        }
        else
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
                Statement s=c.createStatement();
                ResultSet rs=s.executeQuery("select * from customer;");
                while(rs.next())
                {
                    if(name.equals(rs.getString(2)) && phone.equals(rs.getLong(3)))
                    {
                        //JOptionPane.showMessageDialog(null,"Already registered!");
                    }
                }
                s.execute("Insert into CUSTOMER(customer_name,phone,city) values ('"+name+"','"+phone+"','"+city+"')");
                JOptionPane.showMessageDialog(f,"Registered successfully");
                c.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Already registered!");
                System.out.println(e);
            }   
        }           
    }                                  
    
   
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JSeparator s1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration                   
}
