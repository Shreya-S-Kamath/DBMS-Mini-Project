import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerLogin extends javax.swing.JFrame 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    String mid;
    public ManagerLogin() 
    {
        initComponents();
    }
    public ManagerLogin(String mgr_id)
    {
        initComponents();
        mid=mgr_id;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b1.setText("MANAGE ITEMS");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(670, 420, 200, 35);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "NAME", "QUANTITY"
            }
        ));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 100, 440, 120);

        b2.setText("VIEW ITEMS");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(660, 180, 200, 35);

        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("DETAILS OF ITEMS:");
        getContentPane().add(l2);
        l2.setBounds(100, 30, 200, 35);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ITEMS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 280, 150, 35);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("ITEM NAME");
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l3);
        l3.setBounds(200, 340, 100, 35);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("QUANTITY");
        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l4);
        l4.setBounds(200, 420, 100, 35);

        b3.setText("HOME");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(800, 40, 100, 35);

        b4.setText("BACK");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(40, 480, 100, 35);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(380, 420, 50, 35);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Black Coffee", "Cappuccino" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(380, 340, 200, 35);

        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        l1.setText("jLabel1");
        getContentPane().add(l1);
        l1.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Stock_manager s=new Stock_manager();
        s.setVisible(true);
        this.hide();
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String item=(String)jComboBox1.getSelectedItem();
        int qty=(int)jSpinner1.getValue();
        String id=new String();
        String itemid=new String();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            pst=con.prepareStatement("select * from items;");
            rs=pst.executeQuery();
            while(rs.next())
            {
                if(item.equals(rs.getString(2)))
                {
                    id=rs.getString(1);
                }
            }
            pst=con.prepareStatement("select * from stock_mgr where mgr_id='"+mid+"';");
            rs=pst.executeQuery();
            while(rs.next())
            {
                    itemid=rs.getString("item_id");
            }
            //pst.executeUpdate("update items set stock=stock+'"+qty+"' where item_id='"+id+"';");
            if(itemid.equals(id))
            {
                pst.executeUpdate("update items set stock=stock+'"+qty+"' where item_id='"+itemid+"';");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You can't add this item ");
                
            }
            System.out.println(id+" "+itemid+" "+mid);
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

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String id;
        String item;
        int qty=0;
        DefaultTableModel tb=(DefaultTableModel) table1.getModel();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            pst=con.prepareStatement("select * from items;");
            rs=pst.executeQuery();
            while(rs.next())
            {
                id=rs.getString(1);
                item=rs.getString(2);
                qty=rs.getInt(3);
                tb.addRow(new Object[] {id,item,qty});
            }
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Incorrect credentials");
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
            }
        }   
    }                                  

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTable table1;
    // End of variables declaration                   
}
