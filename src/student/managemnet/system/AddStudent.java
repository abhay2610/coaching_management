
package student.managemnet.system;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddStudent extends javax.swing.JFrame {

        DefaultComboBoxModel mo;
        DataBaseStudent dbo;
        DefaultTableModel model;
        public AddStudent() {
        initComponents();
        dbo=new  DataBaseStudent();
        mo=new  DefaultComboBoxModel();
        model=new DefaultTableModel();
         jcbc.setModel(mo);
        loadCourse();
        try{
            String sql ="select * from student";
            model=dbo.showRecord(sql);
        tab.setModel(model);
            }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
      private void clearAll()
    {
        tf_name.setText("");
        tf_fname.setText("");
        tf_dob.setText("");
        tf_phone.setText("");
        tf_email.setText("");
        tf_address.setText("");
        tf_coursename.setText("");
        tf_sdate.setText("");
        tf_edate.setText("");
        tf_coursefee.setText("");
        tf_payment.setText("");
        tf_duration.setText("");
        jcbc.setSelectedIndex(0);
        jcbt.setSelectedIndex(0);
        tf_sid.setText("");     
    }
 public void loadFields()
      {
         
         String cid=mo.getSelectedItem().toString();
         try{
              
              DataBaseCourse baseCourse=new DataBaseCourse();
              PreparedStatement stmt=baseCourse.createStatement("Select * from course where course_id=?;");
              stmt.setString(1, cid);
              ResultSet rs=stmt.executeQuery();
              if(rs.next())
                 {       
                  tf_coursename.setText(rs.getString(1));
                  tf_duration.setText(rs.getString(4));
                  tf_coursefee.setText(rs.getString(3));
                  }
              }
         catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.toString());
                             }  
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_coursename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_payment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_duration = new javax.swing.JTextField();
        tf_sdate = new javax.swing.JTextField();
        jcbc = new javax.swing.JComboBox();
        jcbt = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        tf_edate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_coursefee = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_sid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextArea();
        tf_dob = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jb_delete = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDUCATIONAL DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 18), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setText("COURSE ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 50, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel3.setText("COURSE NAME:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 110, 100, 30);

        tf_coursename.setEditable(false);
        jPanel2.add(tf_coursename);
        tf_coursename.setBounds(130, 110, 380, 30);

        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("*select course");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(130, 80, 380, 20);

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("*Select Teacher");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(130, 190, 400, 20);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel6.setText("TEACHER :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 160, 80, 30);
        jPanel2.add(tf_payment);
        tf_payment.setBounds(130, 420, 380, 30);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*format DD/MM/YY");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 300, 380, 20);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel8.setText("DURATION :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 220, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel9.setText("START DATE :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 270, 80, 30);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel11.setText("PAYMENT :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 420, 80, 30);

        tf_duration.setEditable(false);
        jPanel2.add(tf_duration);
        tf_duration.setBounds(130, 220, 380, 30);
        jPanel2.add(tf_sdate);
        tf_sdate.setBounds(130, 270, 380, 30);

        jcbc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbcFocusLost(evt);
            }
        });
        jcbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcActionPerformed(evt);
            }
        });
        jPanel2.add(jcbc);
        jcbc.setBounds(130, 50, 380, 30);

        jcbt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jcbt);
        jcbt.setBounds(130, 160, 380, 30);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel13.setText("END DATE :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 330, 80, 30);
        jPanel2.add(tf_edate);
        tf_edate.setBounds(130, 330, 380, 30);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel14.setText("COURSE FEE :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 380, 90, 30);

        tf_coursefee.setEditable(false);
        jPanel2.add(tf_coursefee);
        tf_coursefee.setBounds(130, 380, 380, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(700, 50, 540, 470);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONAL DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 18), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel10.setText("NAME :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 50, 100, 30);
        jPanel3.add(tf_name);
        tf_name.setBounds(130, 50, 380, 30);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel12.setText("FATHER' S NAME :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 100, 100, 30);
        jPanel3.add(tf_fname);
        tf_fname.setBounds(130, 100, 380, 30);

        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("*enter name");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(130, 60, 400, 20);

        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("*enter name");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(130, 80, 380, 20);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel17.setText("DATE OF BIRTH :");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(30, 150, 100, 30);
        jPanel3.add(tf_sid);
        tf_sid.setBounds(130, 320, 380, 30);

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*format DD/MM/YY");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(130, 180, 380, 20);

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel19.setText("EMAIL :");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(30, 210, 100, 30);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel20.setText("STUDENT ID :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(30, 320, 100, 30);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel21.setText("RESIDENCE ADDRESS:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 390, 120, 40);

        tf_address.setColumns(20);
        tf_address.setRows(5);
        jScrollPane3.setViewportView(tf_address);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(130, 370, 380, 70);
        jPanel3.add(tf_dob);
        tf_dob.setBounds(130, 150, 380, 30);
        jPanel3.add(tf_email);
        tf_email.setBounds(130, 210, 380, 30);

        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("*enter father's name");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(130, 130, 380, 20);
        jPanel3.add(tf_phone);
        tf_phone.setBounds(130, 270, 380, 30);

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel23.setText("PHONE :");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(30, 270, 100, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(100, 50, 540, 470);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ADD STUDENT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 0, 230, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 0, 1370, 530);

        jb_add.setBackground(new java.awt.Color(153, 153, 255));
        jb_add.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jb_add.setText("SUBMIT");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });
        getContentPane().add(jb_add);
        jb_add.setBounds(180, 530, 90, 30);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 570, 1130, 120);

        jb_delete.setBackground(new java.awt.Color(153, 153, 255));
        jb_delete.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jb_delete.setText("DELETE");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_delete);
        jb_delete.setBounds(1220, 530, 90, 30);

        jb_edit.setBackground(new java.awt.Color(153, 153, 255));
        jb_edit.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jb_edit.setText("EDIT");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });
        getContentPane().add(jb_edit);
        jb_edit.setBounds(720, 530, 90, 30);

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

    private void jcbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcActionPerformed
loadFields()   ;     
    }//GEN-LAST:event_jcbcActionPerformed

    private void jcbcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbcFocusLost
     loadTeacher();   
    }//GEN-LAST:event_jcbcFocusLost

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
         String n =  tf_name.getText();
         String f=tf_fname.getText();
         String dob=tf_dob.getText();
         String e = tf_email.getText();
         long p =Long.parseLong(tf_phone.getText());
         String sid =  tf_sid.getText();
         String add =  tf_address.getText();
         String cid =  jcbc.getSelectedItem().toString();
         String cname =  tf_coursename.getText();
         String t=jcbt.getSelectedItem().toString();
         String d =  tf_duration.getText();
         String sdate=tf_sdate.getText();
         String edate=tf_edate.getText();
         int  cfee = Integer.parseInt(tf_coursefee.getText());
         int  pay = Integer.parseInt(tf_payment.getText()); 
         String msg="";
        
        try {
             
            msg = dbo.insertStudentRecord(n,f,dob,e,p,sid,add,cid,cname,t,d,sdate,edate,cfee,pay);
            String sql ="select * from student";
            model=dbo.showRecord(sql);
            tab.setModel(model);
            clearAll();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,ex.toString());
        }
            JOptionPane.showMessageDialog(null,msg);   
    }//GEN-LAST:event_jb_addActionPerformed

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
       String sid=tf_sid.getText();
       String msg="";
       try
       {
           msg=dbo.deleteStudentRecord(sid);
            JOptionPane.showMessageDialog(null, msg);
             String sql ="select * from student";
            model=dbo.showRecord(sql);
            tab.setModel(model);
            clearAll();
       }
       catch(Exception ex)
               {
                   JOptionPane.showMessageDialog(null, ex.toString());
                }
      
       
    }//GEN-LAST:event_jb_deleteActionPerformed

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
       String n =  tf_name.getText();
         String f=tf_fname.getText();
         String dob=tf_dob.getText();
         String e = tf_email.getText();
         long p =Long.parseLong(tf_phone.getText());
         String sid =  tf_sid.getText();
         String add =  tf_address.getText();
         String cid =  jcbc.getSelectedItem().toString();
         String cname =  tf_coursename.getText();
         String t=jcbt.getSelectedItem().toString();
         String d =  tf_duration.getText();
         String sdate=tf_sdate.getText();
         String edate=tf_edate.getText();
         int  cfee = Integer.parseInt(tf_coursefee.getText());
         int  pay = Integer.parseInt(tf_payment.getText()); 
         String msg="";
        
        try {
             
            msg = dbo.updateStudentRecord(n,f,dob,e,p,sid,add,cid,cname,t,d,sdate,edate,cfee,pay);
            String sql ="select * from student";
            model=dbo.showRecord(sql);
            tab.setModel(model);
            clearAll();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        JOptionPane.showMessageDialog(null,msg);   
    }//GEN-LAST:event_jb_editActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
       tf_name.setText(model.getValueAt(tab.getSelectedRow(),0).toString());
       tf_fname.setText(model.getValueAt(tab.getSelectedRow(),1).toString());
       tf_dob.setText(model.getValueAt(tab.getSelectedRow(),2).toString());
       tf_email.setText(model.getValueAt(tab.getSelectedRow(),3).toString());
       tf_phone.setText(model.getValueAt(tab.getSelectedRow(),4).toString());
       tf_sid.setText(model.getValueAt(tab.getSelectedRow(),5).toString());
       tf_address.setText(model.getValueAt(tab.getSelectedRow(),6).toString());
       jcbc.setSelectedItem(model.getValueAt(tab.getSelectedRow(), 7));
       tf_coursename.setText(model.getValueAt(tab.getSelectedRow(),8).toString());
       jcbt.setSelectedItem(model.getValueAt(tab.getSelectedRow(), 9));
       tf_duration.setText(model.getValueAt(tab.getSelectedRow(),10).toString());
       tf_sdate.setText(model.getValueAt(tab.getSelectedRow(),11).toString());
       tf_edate.setText(model.getValueAt(tab.getSelectedRow(),12).toString());
       tf_coursefee.setText(model.getValueAt(tab.getSelectedRow(),13).toString());
       tf_payment.setText(model.getValueAt(tab.getSelectedRow(),14).toString());
    }//GEN-LAST:event_tabMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
        MainPage.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }
     public void loadTeacher(){
          String cid=mo.getSelectedItem().toString();
  try{
  DataBaseCourseAssign baseCourse=new DataBaseCourseAssign();
  PreparedStatement stmt=baseCourse.createStatement("Select teacher_id from course_assign where course_id=?;");
  stmt.setString(1,cid);
      ResultSet rs=stmt.executeQuery();
         jcbt.removeAllItems();
      while(rs.next()){
       
          jcbt.addItem(rs.getString(1));
      }
  }catch(Exception ex){
      
  JOptionPane.showMessageDialog(null, ex.toString());
  }   
   }
    
     
   public void loadCourse(){
  try{
  DataBaseCourse baseCourse=new DataBaseCourse();
  PreparedStatement stmt=baseCourse.createStatement("Select course_id from course;");
      ResultSet rs=stmt.executeQuery();
         jcbc.removeAllItems();
      while(rs.next()){
       
          jcbc.addItem(rs.getString(1));
      }
  }catch(Exception ex){
      
  JOptionPane.showMessageDialog(null, ex.toString());
  }   
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_edit;
    private javax.swing.JComboBox jcbc;
    private javax.swing.JComboBox jcbt;
    private javax.swing.JTable tab;
    private javax.swing.JTextArea tf_address;
    private javax.swing.JTextField tf_coursefee;
    private javax.swing.JTextField tf_coursename;
    private javax.swing.JTextField tf_dob;
    private javax.swing.JTextField tf_duration;
    private javax.swing.JTextField tf_edate;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_payment;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_sdate;
    private javax.swing.JTextField tf_sid;
    // End of variables declaration//GEN-END:variables
}
