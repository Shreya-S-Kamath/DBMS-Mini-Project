import javax.swing.JOptionPane;

public class CustomerOrders extends javax.swing.JFrame 
{
    int cid=0;
    public CustomerOrders() 
    {
        initComponents();
    }
    public CustomerOrders(int cust_id)
    {
        initComponents();
        cid=cust_id;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("PLACE NEW ORDERS");
        getContentPane().add(l2);
        l2.setBounds(240, 170, 200, 35);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("VIEW PREVIOUS ORDERS");
        getContentPane().add(l3);
        l3.setBounds(240, 280, 200, 35);

        b1.setText("PLACE ORDERS");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(580, 170, 150, 35);

        jButton2.setText("VIEW ORDERS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 280, 150, 35);

        b3.setText("HOME");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(820, 50, 100, 35);

        b4.setText("BACK");
        b4.setToolTipText("");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(40, 450, 100, 35);

        b5.setText("LOGOUT");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(820, 460, 100, 35);

        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        JOptionPane.showMessageDialog(null,"Thankyou! Visit Again");
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Login l=new Login();
        l.setVisible(true);
        this.hide();
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        new PlaceOrders(cid).setVisible(true);        // TODO add your handling code here:
    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new ViewOrders(cid).setVisible(true);
    }                                        

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        JOptionPane.showMessageDialog(null,"Thank you! Visit again");
        Home h=new Home();
        h.setVisible(true);
        this.hide();
    }                                  

    public static void main(String args[]) 
    {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    // End of variables declaration                   
}
