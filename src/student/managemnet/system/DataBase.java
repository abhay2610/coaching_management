package  StudentManagementSystem;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class DataBase {
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
    public String insertTeacherRecord(String name,String qualification,String email,long aadhar,long phone ,String subject,String workexp) throws Exception
    {
        String sql ="insert into teacher values(?,?,?,?,?,?,?)";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, qualification);
        stmt.setString(3,  email);
        stmt.setLong(4,  aadhar);
        stmt.setLong(5,  phone);
        stmt.setString(6, subject);
       stmt.setString(7, workexp);
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
        model.addColumn("Name");
        model.addColumn("Qualification");
        model.addColumn("Email");
        model.addColumn("Aadhar no.");
        model.addColumn("Phone");
        model.addColumn("subject");
        model.addColumn("Work Experience");
        model.addColumn("Joining date");
        PreparedStatement stmt = createStatement( sql);
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
             {
                 model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getLong(5),rs.getString(6),rs.getString(7)});
             }
        return model;
      
    }
    public String deleteTeacherRecord(Long aa) throws Exception
    {
        String msg ;
        String sql= "delete from teacher where aadhar=?";
        PreparedStatement stmt = createStatement(sql);
        stmt.setLong(1,aa);
        int i=stmt.executeUpdate();
        if(i>0)
            msg="Record Deleted Successfully";
        else
            msg=" Deletion Filed ";
        return msg;
       }
    public String updateTeacherRecord(String name,String qualification,String email,long aadhar,long phone ,String subject,String workexp) throws Exception
    {
        String sql ="update teacher set name=?,qualification=?,email=?,phone=?,subject=?,workexp=? where aadhar=?";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, qualification);
        stmt.setString(3,  email);
        stmt.setLong(4,phone  );
        stmt.setString(5,subject );
        stmt.setString(6, workexp);
       stmt.setLong(7, aadhar);
        String msg ;
        int i =stmt.executeUpdate();
        if(i>0)
            msg="Record added Successfully";
        else
            msg="No Record Inserted";
        
        return msg;
         
    }
    
    

}
