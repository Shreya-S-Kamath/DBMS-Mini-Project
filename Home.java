public class Home extends javax.swing.JFrame 
{
    public Home() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(111, 78, 55));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(0, 0, 0)));

        l1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("COFFEE SHOP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 100);

        jPanel2.setBackground(new java.awt.Color(111, 78, 55));

        b1.setBackground(new java.awt.Color(79, 52, 33));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("MENU");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(79, 52, 33));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("CUSTOMER LOGIN");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(79, 52, 33));
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("MANAGER LOGIN");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 200, 500);

        l3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(240, 240, 240));
        l3.setText("WELCOME TO COFFEE SHOP !!!");
        getContentPane().add(l3);
        l3.setBounds(450, 130, 500, 35);

        l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\1.jpg")); // NOI18N
        l2.setText("                                 ");
        getContentPane().add(l2);
        l2.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Menu m=new Menu();
        m.setVisible(true);
        this.hide();
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        CustomerLogin cl=new CustomerLogin();
        cl.setVisible(true);
        this.hide();
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        Stock_manager s=new Stock_manager();
        s.setVisible(true);
        this.hide();
    }                                  

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    // End of variables declaration                   
}
