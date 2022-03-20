package student.managemnet.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CourseDetails extends javax.swing.JFrame {
     DataBaseCourse db;
     DefaultTableModel model;
    public CourseDetails() {
        initComponents();
         db =new DataBaseCourse();
        model =new  DefaultTableModel();
          try{
         String  sql="select * from course ";
         model=db.showRecord(sql); 
         tab_course.setModel(model);
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
private void clearAll() 
{
   
    tf_coursename.setText("");
    tf_courseid.setText("");
    tf_coursefee.setText("");
    tf_courseduration.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tab_course = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_courseduration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_coursename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_courseid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_coursefee = new javax.swing.JTextField();
        jb_add = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jb_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tab_course.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tab_course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_courseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_course);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("COURSE ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 110, 30);

        jLabel2.setText("COURSE DURATION :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 220, 130, 30);
        jPanel1.add(tf_courseduration);
        tf_courseduration.setBounds(150, 220, 250, 30);

        jLabel4.setText("COURSE NAME :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 110, 30);
        jPanel1.add(tf_coursename);
        tf_coursename.setBounds(150, 70, 250, 30);

        jLabel5.setText("COURSE ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 120, 120, 30);
        jPanel1.add(tf_courseid);
        tf_courseid.setBounds(150, 120, 250, 30);

        jLabel6.setText("COURSE FEE :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 170, 120, 30);
        jPanel1.add(tf_coursefee);
        tf_coursefee.setBounds(150, 170, 250, 30);

        jb_add.setText("ADD COURSE");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });
        jPanel1.add(jb_add);
        jb_add.setBounds(23, 283, 130, 30);

        jb_edit.setText("EDIT COURSE");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });
        jPanel1.add(jb_edit);
        jb_edit.setBounds(210, 283, 130, 30);

        jb_delete.setText("DELETE COURSE");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(jb_delete);
        jb_delete.setBounds(363, 283, 130, 30);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 90, 23);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
String cn= tf_coursename.getText(); 
String cid= tf_courseid.getText(); 
int cf= Integer.parseInt(tf_coursefee.getText()); 
String cd= tf_courseduration.getText(); 
String msg="";
        try {
            msg=db.insertCourse(cn,cid,cf,cd);
            String sql=" select * from course";
     model = db.showRecord(sql);
     tab_course.setModel(model);
     clearAll();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.toString());
        }
JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_jb_addActionPerformed

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
        String cn= tf_coursename.getText(); 
String cid= tf_courseid.getText(); 
int cf= Integer.parseInt(tf_coursefee.getText()); 
String cd= tf_courseduration.getText(); 
String msg="";
        try {
            msg=db.updateCourse(cn,cid,cf,cd);
            String sql=" select * from course";
     model = db.showRecord(sql);
     tab_course.setModel(model);
     clearAll();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.toString());
        }
JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_jb_editActionPerformed

    private void tab_courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_courseMouseClicked
          tf_coursename.setText(model.getValueAt(tab_course.getSelectedRow(), 0).toString());
     tf_courseid.setText(model.getValueAt(tab_course.getSelectedRow(), 1).toString());
       tf_coursefee.setText(model.getValueAt(tab_course.getSelectedRow(), 2).toString());
     tf_courseduration.setText(model.getValueAt(tab_course.getSelectedRow(), 3).toString());

    }//GEN-LAST:event_tab_courseMouseClicked

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
String cid=tf_courseid.getText();
String msg="";
        try {
            msg=db.deletecourse(cid);
            String sql=" select * from course";
     model = db.showRecord(sql);
     tab_course.setModel(model);
     clearAll();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.toString()); ;
        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_jb_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MainPage.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed
   public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_edit;
    private javax.swing.JTable tab_course;
    private javax.swing.JTextField tf_courseduration;
    private javax.swing.JTextField tf_coursefee;
    private javax.swing.JTextField tf_courseid;
    private javax.swing.JTextField tf_coursename;
    // End of variables declaration//GEN-END:variables
}
