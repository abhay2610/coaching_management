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
public class DataBaseCourse {
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
     public String insertCourse(String coursename,String courseid,int coursefee,String  courseduration) throws Exception
    {
        String sql ="insert into course values(?,?,?,?)";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, coursename);
        stmt.setString(2, courseid);
        stmt.setInt(3,  coursefee);
        stmt.setString(4,  courseduration);
       
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
        model.addColumn("Course Name");
        model.addColumn("Course Id");
         model.addColumn("Course Fee");
           model.addColumn("Course Detail");
            PreparedStatement stmt = createStatement( sql);
              ResultSet rs = stmt.executeQuery(sql);
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4)});
             }
             return model;
      
    }
    public String deletecourse(String cid) throws Exception
    {
        String msg ;
        String sql= "delete from course where course_id=?";
        PreparedStatement stmt = createStatement(sql);
        stmt.setString(1, cid);
        int i=stmt.executeUpdate();
        if(i>0)
            msg="Record Deleted Successfully";
        else
            msg=" Deletion Filed ";
        return msg;
       }
    public String updateCourse(String coursename,String courseid,int coursefee,String courseduration) throws Exception
    {
        String sql ="update course set course_name=?,course_fee=?,course_duration=? where course_id=?";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, coursename);
        stmt.setInt(2, coursefee);
        stmt.setString(3,  courseduration);
        stmt.setString(4,courseid  );
        String msg ;
        int i =stmt.executeUpdate();
        if(i>0)
            msg="Record added Successfully";
        else
            msg="No Record Inserted";
        
        return msg;
         
    }
        
}
