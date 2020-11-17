import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Stock_manager extends javax.swing.JFrame 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    String mid;
    public Stock_manager() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b1.setText("HOME");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(830, 30, 100, 35);

        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("MANGAER ID");
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l2);
        l2.setBounds(180, 170, 150, 35);

        l3.setForeground(new java.awt.Color(240, 240, 240));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("PASSWORD");
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l3);
        l3.setBounds(180, 270, 150, 35);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("ENTER MANAGER DETAILS:");
        getContentPane().add(l4);
        l4.setBounds(170, 70, 300, 35);

        b2.setText("LOGIN");
        b2.setVerifyInputWhenFocusTarget(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(620, 400, 100, 35);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t1);
        t1.setBounds(450, 170, 300, 35);

        p1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(p1);
        p1.setBounds(450, 270, 300, 35);

        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String name=t1.getText();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            pst=con.prepareStatement("CALL selectStkMgr();");
            rs=pst.executeQuery();
            while(rs.next())
            {
                if(name.equals(rs.getString(2)))
                {
                    mid=rs.getString(1);
                }
            }
            CallableStatement cs=con.prepareCall("{call p(?,?)}");
            //pst=con.prepareStatement("select * from stock_mgr where mgr_id=? and pwd=?");
            //pst.setString(1, t1.getText());
            //pst.setString(2, p1.getText());
            //cs=pst.executeQuery();
            cs.setString(1, t1.getText());
            cs.setString(2, p1.getText());
            rs=cs.executeQuery();
                if(rs.next())
                {
                    rs.close();
                    pst.close();
                    JOptionPane.showMessageDialog(null,"Login successful");
                    System.out.println(name);
                    new ManagerLogin(name).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect credentials");
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
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

    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField t1;
    // End of variables declaration                   
}
