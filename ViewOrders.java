import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ViewOrders extends javax.swing.JFrame 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    int cid=0;
    public ViewOrders() 
    {
        initComponents();
    }
    public ViewOrders(int cust_id)
    {
        initComponents();
        cid=cust_id;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b4.setText("BACK");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(60, 460, 100, 35);

        b3.setText("HOME");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(830, 40, 100, 35);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "ITEM NAME", "QUANTITY", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 90, 452, 340);

        b1.setText("VIEW");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(800, 390, 100, 35);

        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
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
        new CustomerOrders(cid).setVisible(true);
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int oid=0;
        String id=new String();
        int qty;
        int amount;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            DefaultTableModel tb=(DefaultTableModel) table1.getModel();
            pst=con.prepareStatement("select * from orders where customer_id='"+cid+"';");
            rs=pst.executeQuery();
            while(rs.next())
            {
                oid=rs.getInt(1);
                id=rs.getString(3);
                qty=rs.getInt(4);
                amount=rs.getInt(5);                
                tb.addRow(new Object[] {oid,id,qty,amount});
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
                new ViewOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JTable table1;
    // End of variables declaration                   
}
