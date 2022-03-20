package student.managemnet.system;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class FeeDetail extends javax.swing.JFrame {
DataBaseStudent db;
public FeeDetail() {
        initComponents();
        db=new DataBaseStudent();
        jp_details.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jp_details = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_coursefee = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_studentname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_course = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_sid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(1000, 2000));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("FEE DETAILS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 0, 140, 40);

        jp_details.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " STUDENT FEE DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 12))); // NOI18N
        jp_details.setLayout(null);

        jLabel2.setText("STATUS :");
        jp_details.add(jLabel2);
        jLabel2.setBounds(10, 80, 100, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jp_details.add(jTextField1);
        jTextField1.setBounds(310, 230, 130, 30);

        jLabel4.setText("COURSE FEE :");
        jp_details.add(jLabel4);
        jLabel4.setBounds(380, 130, 90, 30);

        tf_coursefee.setEditable(false);
        jp_details.add(tf_coursefee);
        tf_coursefee.setBounds(480, 130, 250, 30);

        jLabel5.setText("AMOUNT :");
        jp_details.add(jLabel5);
        jLabel5.setBounds(210, 230, 100, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jp_details.add(jTextField4);
        jTextField4.setBounds(110, 80, 250, 30);

        jLabel6.setText("REMAINING  FEE:");
        jp_details.add(jLabel6);
        jLabel6.setBounds(10, 130, 100, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jp_details.add(jTextField5);
        jTextField5.setBounds(110, 130, 250, 30);

        jLabel9.setText("STUDENT NAME :");
        jp_details.add(jLabel9);
        jLabel9.setBounds(10, 30, 100, 30);

        tf_studentname.setEditable(false);
        jp_details.add(tf_studentname);
        tf_studentname.setBounds(110, 30, 250, 30);

        jLabel10.setText("PHONE :");
        jp_details.add(jLabel10);
        jLabel10.setBounds(390, 30, 90, 30);

        tf_phone.setEditable(false);
        jp_details.add(tf_phone);
        tf_phone.setBounds(480, 30, 250, 30);

        jLabel11.setText("COURSE :");
        jp_details.add(jLabel11);
        jLabel11.setBounds(390, 80, 90, 30);

        tf_course.setEditable(false);
        jp_details.add(tf_course);
        tf_course.setBounds(480, 80, 250, 30);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jp_details.add(jTextField10);
        jTextField10.setBounds(110, 180, 250, 30);

        jLabel12.setText("SUBMITTED FEE:");
        jp_details.add(jLabel12);
        jLabel12.setBounds(10, 180, 100, 30);

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton4.setText("ADD ");
        jp_details.add(jButton4);
        jButton4.setBounds(330, 293, 100, 40);

        jPanel1.add(jp_details);
        jp_details.setBounds(40, 180, 740, 489);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " FEE RECORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 12))); // NOI18N
        jPanel3.setLayout(null);

        jLabel8.setText("STUDENT ID :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 40, 90, 30);
        jPanel3.add(tf_sid);
        tf_sid.setBounds(120, 40, 210, 30);

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(340, 40, 100, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(140, 60, 450, 90);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 90, 30);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void loadFields() 
{
    String sid = tf_sid.getText();
try{
    PreparedStatement stmt=db.createStatement("select * from student where student_id=? ");
    stmt.setString(1,sid);
    ResultSet rs=stmt.executeQuery();
    if(rs.next())
    {
        tf_studentname.setText(rs.getString(1));
        tf_course.setText(rs.getString(9));
        tf_coursefee.setText(rs.getString(14));
        tf_phone.setText(rs.getString(5));
    }
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null,ex.toString());
}
     
}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
      
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
        loadFields();
        jp_details.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MainPage.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jp_details;
    private javax.swing.JTextField tf_course;
    private javax.swing.JTextField tf_coursefee;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_sid;
    private javax.swing.JTextField tf_studentname;
    // End of variables declaration//GEN-END:variables
}
