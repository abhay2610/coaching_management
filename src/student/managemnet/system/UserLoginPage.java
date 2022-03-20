/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.managemnet.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Abhay
 */
public class UserLoginPage extends javax.swing.JFrame {

    /**
     * Creates new form UserLoginPage
     */
    public UserLoginPage() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_un = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setLayout(null);

        jLabel1.setText("password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 300, 80, 30);
        jPanel1.add(tf_pass);
        tf_pass.setBounds(180, 300, 190, 30);

        jLabel2.setText("user name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 240, 80, 30);
        jPanel1.add(tf_un);
        tf_un.setBounds(180, 240, 190, 30);

        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 370, 90, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhay\\Documents\\NetBeansProjects\\Student Managemnet System\\src\\student\\managemnet\\system\\teacher_icon.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 70, 370, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user=tf_un.getText();
        String pass=tf_pass.getText();
        if(user.contains("abhay2610")&&pass.contains("0000"))
        {
           this.dispose();
           MainPage.main(new String []{});

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_un;
    // End of variables declaration//GEN-END:variables
}
