package student.managemnet.system;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CourseAssign extends javax.swing.JFrame {

   DataBaseCourseAssign db;
   DefaultTableModel model;
    public CourseAssign() {
        db=new  DataBaseCourseAssign();
        initComponents();
                tf_sn.setVisible(false);
         db =new DataBaseCourseAssign();
        model =new  DefaultTableModel();
          try{
         String  sql="select * from course_assign ";
         model=db.showRecord(sql); 
         tab_courseassign.setModel(model);
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.toString());
        }
        err1.setVisible(false);
        err2.setVisible(false);
   
    }
private void clearAll() {                                              
       tf_tid.setText("");
     tf_cid.setText("");

    }         
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_cid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_tid = new javax.swing.JTextField();
        jb_assign = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_courseassign = new javax.swing.JTable();
        err1 = new javax.swing.JLabel();
        err2 = new javax.swing.JLabel();
        jb_edit = new javax.swing.JButton();
        jb_delete = new javax.swing.JButton();
        tf_sn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(1000, 2000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("COURSE ASSIGN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 0, 273, 44);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("TEACHER ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 100, 40);
        getContentPane().add(tf_cid);
        tf_cid.setBounds(150, 130, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("COURSE ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 20);

        tf_tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tidActionPerformed(evt);
            }
        });
        getContentPane().add(tf_tid);
        tf_tid.setBounds(150, 70, 260, 40);

        jb_assign.setBackground(new java.awt.Color(51, 51, 255));
        jb_assign.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_assign.setText("ASSIGN");
        jb_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_assignActionPerformed(evt);
            }
        });
        getContentPane().add(jb_assign);
        jb_assign.setBounds(50, 200, 100, 40);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tab_courseassign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tab_courseassign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab_courseassign.setDragEnabled(true);
        tab_courseassign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_courseassignMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_courseassign);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 260, 540, 190);

        err1.setForeground(new java.awt.Color(255, 0, 0));
        err1.setText("*enter id");
        getContentPane().add(err1);
        err1.setBounds(410, 90, 60, 20);

        err2.setForeground(new java.awt.Color(255, 0, 0));
        err2.setText("*enter id");
        getContentPane().add(err2);
        err2.setBounds(410, 150, 60, 20);

        jb_edit.setBackground(new java.awt.Color(51, 51, 255));
        jb_edit.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_edit.setText("EDIT");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });
        getContentPane().add(jb_edit);
        jb_edit.setBounds(230, 200, 100, 40);

        jb_delete.setBackground(new java.awt.Color(51, 51, 255));
        jb_delete.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_delete.setText("DELETE");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_delete);
        jb_delete.setBounds(400, 200, 100, 40);
        getContentPane().add(tf_sn);
        tf_sn.setBounds(480, 0, 120, 30);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tidActionPerformed
       
    }//GEN-LAST:event_tf_tidActionPerformed
 
    private void jb_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_assignActionPerformed
        String tid=tf_tid.getText(); 
         String cid=tf_cid.getText();
         String msg="";
       try {
            msg=db.insert(tid, cid);
            String sql ="select * from course_assign";
             model = db.showRecord(sql);
            tab_courseassign.setModel(model);
            clearAll();
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex.toString());
       }
       JOptionPane.showMessageDialog(null,msg);
    }//GEN-LAST:event_jb_assignActionPerformed

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
       String tid=tf_tid.getText(); 
         String cid=tf_cid.getText();
          int sn=Integer.parseInt(tf_sn.getText().toString());
         String msg="";
       try {
            msg=db.update(sn,tid, cid);
            String sql ="select * from course_assign";
             model = db.showRecord(sql);
            tab_courseassign.setModel(model);
           clearAll();
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex.toString());
       }
       JOptionPane.showMessageDialog(null,msg);  
    }//GEN-LAST:event_jb_editActionPerformed

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
     int sn=Integer.parseInt(tf_sn.getText().toString()); 
        
         String msg="";
       try {
            msg=db.delete(sn);
            String sql ="select * from course_assign";
             model = db.showRecord(sql);
            tab_courseassign.setModel(model);
            clearAll();
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex.toString());
       }
       JOptionPane.showMessageDialog(null,msg);   
    }//GEN-LAST:event_jb_deleteActionPerformed

    
    private void tab_courseassignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_courseassignMouseClicked
        tf_sn.setText(model.getValueAt(tab_courseassign.getSelectedRow(), 0).toString());
        tf_tid.setText(model.getValueAt(tab_courseassign.getSelectedRow(), 1).toString());
     tf_cid.setText(model.getValueAt(tab_courseassign.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_tab_courseassignMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
        MainPage.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseAssign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel err1;
    private javax.swing.JLabel err2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_assign;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_edit;
    private javax.swing.JTable tab_courseassign;
    private javax.swing.JTextField tf_cid;
    private javax.swing.JTextField tf_sn;
    private javax.swing.JTextField tf_tid;
    // End of variables declaration//GEN-END:variables
}
