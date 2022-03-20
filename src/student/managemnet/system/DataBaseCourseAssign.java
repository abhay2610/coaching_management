/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.managemnet.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhay
 */
public class DataBaseCourseAssign {
     final public String URL="jdbc:mysql://localhost:3306/adjava";
    final public String USER="root";
    final public String PASS="";
    public PreparedStatement createStatement (String  sql) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection(URL,USER,PASS);
        PreparedStatement stmt=con.prepareStatement(sql);
        return(stmt);
    }
     public String insert(String courseid,String teacherid) throws Exception
    {
        String sql ="insert into course_assign(teacher_id,course_id) values(?,?)";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, courseid);
        stmt.setString(2, teacherid);
        String msg ="";
        int i =stmt.executeUpdate();
        if(i>0)
            msg="Record added Successfully";
        else
            msg="No Record Inserted";
        
        return msg;
         
    }
    public DefaultTableModel showRecord(String sql) throws Exception
    {
      DefaultTableModel model=new DefaultTableModel();
      model.addColumn("Assignment Id");
        model.addColumn("Teacher Id");
        model.addColumn("Course Id");
        PreparedStatement stmt = createStatement( sql);
        ResultSet rs = stmt.executeQuery(sql);
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3)});
             }
             return model;
      
    }
     public String delete( int sn ) throws Exception
    {
        String msg ;
        String sql= "delete from course_assign   where sr_no=?";
        PreparedStatement stmt = createStatement(sql);
        stmt.setInt(1,sn);
       
        int i=stmt.executeUpdate();
        if(i>0)
            msg="Record Deleted Successfully";
        else
            msg=" Deletion Filed ";
        return msg;
       }
      public String update(int sn,String teacherid,String courseid) throws Exception
    {
        String sql ="update course_assign set teacher_id=?,course_id=? where sr_no=?";
        PreparedStatement stmt =createStatement(sql);
       
        stmt.setString(1, teacherid);
        stmt.setString(2, courseid);
         stmt.setInt(3,sn);
        String msg ;
        int i =stmt.executeUpdate();
        if(i>0)
            msg="Record added Successfully";
        else
            msg="No Record Inserted";
        
        return msg;
         
    }
    
    
}
