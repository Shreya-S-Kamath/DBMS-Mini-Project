public class Menu extends javax.swing.JFrame 
{
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        cappuccino = new javax.swing.JLabel();
        blackcoffee = new javax.swing.JLabel();
        coffee = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("MENU");
        getContentPane().add(l2);
        l2.setBounds(60, 10, 250, 100);

        b1.setText("HOME");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(830, 40, 100, 35);

        cappuccino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccino.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\Cappuccino.jpg")); // NOI18N
        cappuccino.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(cappuccino);
        cappuccino.setBounds(670, 210, 150, 130);

        blackcoffee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackcoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\Black coffee.jpg")); // NOI18N
        blackcoffee.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(blackcoffee);
        blackcoffee.setBounds(400, 210, 150, 130);

        coffee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\coffee.jpg")); // NOI18N
        coffee.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(coffee);
        coffee.setBounds(120, 210, 150, 130);

        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("COFFEE");
        l3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l3);
        l3.setBounds(120, 130, 150, 35);

        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("BLACK COFFEE");
        l4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l4);
        l4.setBounds(400, 130, 150, 35);

        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("CAPPUCCINO");
        l5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l5);
        l5.setBounds(670, 130, 150, 35);

        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("Rs.10");
        l6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l6);
        l6.setBounds(120, 390, 150, 35);

        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setText("Rs.15");
        l7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l7);
        l7.setBounds(400, 390, 150, 35);

        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("Rs.20");
        l8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(l8);
        l8.setBounds(670, 390, 150, 35);

        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya Kamath\\Desktop\\Shreya\\DBMS\\DBMS PROJECT\\2.jpg")); // NOI18N
        l1.setText("jLabel1");
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

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JLabel blackcoffee;
    private javax.swing.JLabel cappuccino;
    private javax.swing.JLabel coffee;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    // End of variables declaration                   
}
