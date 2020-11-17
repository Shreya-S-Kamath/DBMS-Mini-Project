import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlaceOrders extends javax.swing.JFrame 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    int cid=0;
    public PlaceOrders() 
    {
        initComponents();
    }
    public PlaceOrders(int cust_id)
    {
        initComponents();
        cid=cust_id;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        b4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STORE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 90, 100, 35);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEM");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 160, 100, 35);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Black Coffee", "Cappuccino" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(290, 160, 200, 35);

        b1.setText("ADD");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(680, 160, 100, 35);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("ENTER ORDER DETAILS:");
        getContentPane().add(l3);
        l3.setBounds(90, 30, 300, 35);

        b2.setText("HOME");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(840, 30, 100, 35);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(570, 160, 50, 35);

        b3.setText("BACK");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(50, 480, 100, 35);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION", "ITEM", "QUANTITY", "PRICE", "TOTAL"
            }
        ));
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 320, 470, 120);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("ORDER DETAILS");
        getContentPane().add(l4);
        l4.setBounds(140, 260, 200, 35);

        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("GRAND TOTAL");
        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l5);
        l5.setBounds(680, 330, 150, 35);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(t1);
        t1.setBounds(680, 390, 150, 35);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mangalore", "Kasargod" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(290, 90, 200, 35);

        b4.setText("LOGOUT");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(840, 480, 100, 35);

        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        l1.setText("ADD");
        getContentPane().add(l1);
        l1.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String location=(String)jComboBox1.getSelectedItem();
        String item=(String)jComboBox2.getSelectedItem();
        int qty=(int)jSpinner1.getValue();
        String sid=new String();
        String id=new String();
        int price=0;
        int stock=0;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP?useSSL=false","root","");
            pst=con.prepareStatement("select * from store;");
            rs=pst.executeQuery();
            while(rs.next())
            {
                if(location.equals(rs.getString(2)))
                {
                    sid=rs.getString(1);
                }
            }
            pst=con.prepareStatement("select * from items;");
            rs=pst.executeQuery();
            while(rs.next())
            {
                if(item.equals(rs.getString(2)))
                {
                    id=rs.getString(1);
                    stock=rs.getInt(3);
                    price=rs.getInt(4);
                }
            }
            if(qty<=stock)
            {
                
            
            int amt=price*qty;
            pst.execute("insert into items_from(item_id,store_id) values('"+id+"','"+sid+"')");
            pst.execute("insert into orders(customer_id,item_id,quantity,amount) values('"+cid+"','"+id+"','"+qty+"','"+amt+"')");
            pst.executeUpdate("update items set stock=stock-'"+qty+"' where item_id='"+id+"';");
            DefaultTableModel tb=(DefaultTableModel) table1.getModel();
            tb.addRow(new Object[] {location,item,qty,price,amt});
            
            int sum=0;
            for(int i=0;i<table1.getRowCount();i++)
            {
                sum+=(int)(table1.getValueAt(i,4));
            }
            t1.setText(sum+".00");
            JOptionPane.showMessageDialog(null,"Order placed");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Item out of stock");
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

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        new CustomerOrders(cid).setVisible(true);
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        JOptionPane.showMessageDialog(null,"Thank you! Visit Again");
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField t1;
    private javax.swing.JTable table1;
    // End of variables declaration                   
}
