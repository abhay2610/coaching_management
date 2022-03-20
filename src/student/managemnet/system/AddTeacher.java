package student.managemnet.system;
import StudentManagementSystem.DataBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AddTeacher extends javax.swing.JFrame {
    DefaultTableModel model;
    DataBase dbo;
    public AddTeacher() {
       
        initComponents();
        dbo =new DataBase();
        model =new  DefaultTableModel();
          try{
         String  sql="select * from teacher ";
         model=dbo.showRecord(sql); 
         tab.setModel(model);
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.toString());
        }
       
       
        err1.setVisible(false);
        err2.setVisible(false);
        err4.setVisible(false);
        err3.setVisible(false);
        tab.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        err1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbq = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_aadhar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField();
        err2 = new javax.swing.JLabel();
        cbw = new javax.swing.JComboBox();
        cbs = new javax.swing.JComboBox();
        err3 = new javax.swing.JLabel();
        err4 = new javax.swing.JLabel();
        jb_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jb_delete = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jb_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(51, 0, 255));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("ADD TEACHER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 0, 280, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setText("NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 50, 80, 20);

        tf_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nameFocusLost(evt);
            }
        });
        tf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nameKeyTyped(evt);
            }
        });
        jPanel1.add(tf_name);
        tf_name.setBounds(140, 50, 330, 30);

        err1.setForeground(new java.awt.Color(204, 0, 0));
        err1.setText("*Enter name");
        jPanel1.add(err1);
        err1.setBounds(140, 80, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel4.setText("QUALIFICATION:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 90, 30);

        cbq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select option", "B Tech", "M Tech", "BCA", "MCA", "PGDCA" }));
        jPanel1.add(cbq);
        cbq.setBounds(140, 110, 330, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel5.setText("EMAIL ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 170, 80, 30);

        tf_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_emailFocusLost(evt);
            }
        });
        jPanel1.add(tf_email);
        tf_email.setBounds(140, 170, 330, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel6.setText("AADHAR No :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 230, 90, 30);

        tf_aadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_aadharFocusLost(evt);
            }
        });
        tf_aadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_aadharKeyTyped(evt);
            }
        });
        jPanel1.add(tf_aadhar);
        tf_aadhar.setBounds(140, 230, 330, 30);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel7.setText("CONTACT NO:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 50, 80, 30);
        jPanel1.add(tf_phone);
        tf_phone.setBounds(650, 50, 330, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("SUBJECT:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 110, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel9.setText("WORK EXPERIENCE :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(530, 170, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel10.setText("JOINING DATE:");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(550, 230, 100, 30);

        tf_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_dateFocusLost(evt);
            }
        });
        tf_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_dateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_dateKeyTyped(evt);
            }
        });
        jPanel1.add(tf_date);
        tf_date.setBounds(650, 230, 330, 30);

        err2.setForeground(new java.awt.Color(204, 51, 0));
        err2.setText("*Invalid Email ID");
        jPanel1.add(err2);
        err2.setBounds(140, 200, 330, 20);

        cbw.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select option", "<1 years", "1 years", "2 years", "3 years", ">3 years" }));
        jPanel1.add(cbw);
        cbw.setBounds(650, 170, 330, 30);

        cbs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select subject", "HTML", "C", "C++", "JAVA", "ANDROID", "JAVASCRIPT", "PYTHON" }));
        jPanel1.add(cbs);
        cbs.setBounds(650, 110, 330, 30);

        err3.setForeground(new java.awt.Color(204, 0, 0));
        err3.setText("*Invalid Aadhar No");
        jPanel1.add(err3);
        err3.setBounds(140, 260, 330, 20);

        err4.setForeground(new java.awt.Color(204, 0, 0));
        err4.setText("*should be in format DD/MM/YY");
        jPanel1.add(err4);
        err4.setBounds(650, 260, 330, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 40, 1110, 300);

        jb_add.setBackground(new java.awt.Color(0, 51, 255));
        jb_add.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_add.setText("ADD");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });
        getContentPane().add(jb_add);
        jb_add.setBounds(130, 360, 120, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

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
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 410, 1110, 140);

        jb_delete.setBackground(new java.awt.Color(0, 51, 255));
        jb_delete.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_delete.setText("DELETE");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_delete);
        jb_delete.setBounds(520, 360, 100, 30);

        jb_edit.setBackground(new java.awt.Color(0, 51, 255));
        jb_edit.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jb_edit.setText("UPDATE");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });
        getContentPane().add(jb_edit);
        jb_edit.setBounds(870, 360, 100, 30);

        jb_back.setText("BACK");
        jb_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backActionPerformed(evt);
            }
        });
        getContentPane().add(jb_back);
        jb_back.setBounds(0, 0, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nameFocusLost
       String s = tf_name.getText();
       if(s.isEmpty())
           err1.setVisible(true);
       else
           err1.setVisible(false);
       
    }//GEN-LAST:event_tf_nameFocusLost

    private void tf_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyTyped
      err1.setVisible(false); 
    }//GEN-LAST:event_tf_nameKeyTyped

    private void tf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyReleased
     tf_name.setText(tf_name.getText().toUpperCase())  ; 
    }//GEN-LAST:event_tf_nameKeyReleased

    private void tf_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_emailFocusLost
        EmailValidator e=new  EmailValidator();
        String s =tf_email.getText();
       boolean b= e.validate(s);
       if(!b)
           err2.setVisible(true);
       else
           err2.setVisible(false);
           
    }//GEN-LAST:event_tf_emailFocusLost

    private void tf_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dateKeyTyped
       err4.setVisible(true); 
    }//GEN-LAST:event_tf_dateKeyTyped

    private void tf_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dateKeyReleased

    }//GEN-LAST:event_tf_dateKeyReleased

    private void tf_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_dateFocusLost
       err4.setVisible(false); 
    }//GEN-LAST:event_tf_dateFocusLost
private void clearAll()
{
    tf_name.setText("");
    tf_email.setText("");
    tf_aadhar.setText("");
    tf_phone.setText("");
    tf_date.setText("");
    cbq.setSelectedIndex(0);
     cbs.setSelectedIndex(0);
      cbw.setSelectedIndex(0);
}
 
    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
       String n =  tf_name.getText();
       String q = cbq.getSelectedItem().toString();
       String e = tf_email.getText();
       long aa = Long.parseLong(tf_aadhar.getText());
       long p = Long.parseLong(tf_phone.getText());
       String s =  cbs.getSelectedItem().toString();
       String w = cbw.getSelectedItem().toString();
       String msg="";
        
        try {
             
            msg = dbo.insertTeacherRecord(n,q,e,aa,p,s,w);
            String sql ="select * from teacher";
            model=dbo.showRecord(sql);
            tab.setModel(model);
            clearAll();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        JOptionPane.showMessageDialog(null,msg);
        
    }//GEN-LAST:event_jb_addActionPerformed

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
    Long aa =Long.parseLong(tf_aadhar.getText());
    try
    {
        String msg=dbo.deleteTeacherRecord(aa);
        JOptionPane.showMessageDialog(null,msg);
        String  sql="select * from teacher ";
        model=dbo.showRecord(sql);
        tab.setModel(model);
        clearAll();    
    }
    catch(Exception ex)
            {
            JOptionPane.showMessageDialog(null,ex.toString());
            }
    
    }//GEN-LAST:event_jb_deleteActionPerformed

    
    private void tf_aadharFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_aadharFocusLost
       Pattern  p =Pattern.compile("\\b[0-9]\\b");
       String s=tf_aadhar.getText();
     
       int count=s.length();
       
       Matcher m =p.matcher(s);    
        if(count!=16)
            err3.setVisible(true);
        else
            err3.setVisible(false);
            
    }//GEN-LAST:event_tf_aadharFocusLost

    private void tf_aadharKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_aadharKeyTyped
      
    }//GEN-LAST:event_tf_aadharKeyTyped

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
       String n =  tf_name.getText();
       String q = cbq.getSelectedItem().toString();
       String e = tf_email.getText();
       long aa = Long.parseLong(tf_aadhar.getText());
       long p = Long.parseLong(tf_phone.getText());
       String s =  cbs.getSelectedItem().toString();
       String w = cbw.getSelectedItem().toString();
        try {
            String msg=dbo.updateTeacherRecord(n, q, e, aa, p, s, w);
            String  sql="select * from teacher ";
            model=dbo.showRecord(sql);
            tab.setModel(model);
            clearAll();  
            JOptionPane.showMessageDialog(null,msg);
            } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jb_editActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
     tf_name.setText(model.getValueAt(tab.getSelectedRow(), 0).toString());
     tf_email.setText(model.getValueAt(tab.getSelectedRow(), 2).toString());
     tf_aadhar.setText(model.getValueAt(tab.getSelectedRow(), 3).toString());
     tf_phone.setText(model.getValueAt(tab.getSelectedRow(), 4).toString());// TODO add your handling code here:
    }//GEN-LAST:event_tabMouseClicked

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        this.dispose();
        MainPage.main(new String[]{});
    }//GEN-LAST:event_jb_backActionPerformed
   public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbq;
    private javax.swing.JComboBox cbs;
    private javax.swing.JComboBox cbw;
    private javax.swing.JLabel err1;
    private javax.swing.JLabel err2;
    private javax.swing.JLabel err3;
    private javax.swing.JLabel err4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_edit;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tf_aadhar;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables
}
