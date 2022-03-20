
package student.managemnet.system;

public class MainPage extends javax.swing.JFrame {

  
    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jb_addteacher = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jButton1.setText("ADD STUDENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 300, 140, 40);

        jButton2.setText("ADD NEW COURSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 500, 130, 30);

        jb_addteacher.setText("ADD TEACHER");
        jb_addteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addteacherActionPerformed(evt);
            }
        });
        getContentPane().add(jb_addteacher);
        jb_addteacher.setBounds(50, 300, 120, 40);

        jButton4.setText("COURSE ASSIGN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 300, 140, 40);

        jButton3.setText("FEE DETAILS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 490, 110, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 200, 110, 100);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 380, 130, 120);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 200, 140, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhay\\Documents\\NetBeansProjects\\Student Managemnet System\\src\\student\\managemnet\\system\\teacher_icon.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 50, 340, 160);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 400, 110, 90);

        jButton5.setText("LOG OUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(420, 500, 100, 30);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 400, 110, 100);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 20, 0, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_addteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addteacherActionPerformed
        this.dispose();
        AddTeacher.main(new String[]{});
    }//GEN-LAST:event_jb_addteacherActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        FeeDetail.main(new String[]{});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        CourseAssign.main(new String[]{});
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       CourseDetails.main(new String[]{});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       AddStudent.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        UserLoginPage.main(new String []{});
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jb_addteacher;
    // End of variables declaration//GEN-END:variables
}
