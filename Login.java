import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    int cid=0;
    public Login() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("ENTER LOGIN DETAILS:");
        getContentPane().add(l2);
        l2.setBounds(150, 50, 300, 35);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("NAME:");
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l3);
        l3.setBounds(150, 140, 100, 35);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("PHONE:");
        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l4);
        l4.setBounds(150, 260, 100, 35);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t1);
        t1.setBounds(370, 150, 300, 35);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t2);
        t2.setBounds(370, 260, 300, 35);

        b1.setText("LOGIN");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(560, 370, 100, 35);

        b2.setText("BACK");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(40, 460, 100, 35);

        b3.setText("HOME");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(840, 30, 100, 35);

        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String name=t1.getText();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            pst=con.prepareStatement("select * from customer;");
            rs=pst.executeQuery();
            while(rs.next())
            {
                if(name.equals(rs.getString(2)))
                {
                    cid=rs.getInt(1);
                }
            }
            pst=con.prepareStatement("select * from CUSTOMER where customer_name=? and phone=?");
            pst.setString(1,t1.getText());
            pst.setString(2,t2.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null,"Login successful");
                new CustomerOrders(cid).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect credentials");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Incorrect credentials");
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }        
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        CustomerLogin cl=new CustomerLogin();
        cl.setVisible(true);
        this.hide();
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration                   
}
