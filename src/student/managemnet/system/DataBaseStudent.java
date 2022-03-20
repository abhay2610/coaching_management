package student.managemnet.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class DataBaseStudent {
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
      public String insertStudentRecord(String name,String fname ,String dob,String email,long phone ,String studentid,String address,String cid,String coursename,String teacher, String duration,String sdate,String edate,int coursefee,int payment) throws Exception
    {
        String sql ="insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, fname);
         stmt.setString(3, dob);
        stmt.setString(4,  email);
        stmt.setLong(5,  phone);
        stmt.setString(6, studentid);
       stmt.setString(7, address);
       stmt.setString(8, cid);
       stmt.setString(9, coursename);
       stmt.setString(10, teacher);
       stmt.setString(11, duration);
        stmt.setString(12, sdate);
         stmt.setString(13, edate);
       stmt.setInt(14,coursefee);
       stmt.setInt(15, payment);
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
        model.addColumn("Fathers Name");
        model.addColumn("Date of Birth");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Student Id");
        model.addColumn("Address");
        model.addColumn("Course Id");
        model.addColumn("Course Name");
        model.addColumn("Teacher");
        model.addColumn("Duration");
        model.addColumn("Start Date");
        model.addColumn("End Date");
        model.addColumn("Course Fee");
        model.addColumn("Payment");
        PreparedStatement stmt = createStatement( sql);
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
             {
                 model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getInt(15)});
             }
        return model; 
    }
       public String deleteStudentRecord(String sid) throws Exception
    {
        String msg ;
        String sql= "delete from student where student_id=?";
        PreparedStatement stmt = createStatement(sql);
        stmt.setString(1,sid);
        int i=stmt.executeUpdate();
        if(i>0)
            msg="Record Deleted Successfully";
        else
            msg=" Deletion Failed ";
        return msg;
       }
    public String updateStudentRecord(String name,String fname ,String dob,String email,long phone ,String studentid,String address,String cid,String coursename,String teacher, String duration,String sdate,String edate,int coursefee,int payment) throws Exception
    {
        String sql =" update student set name=?,fathers_name=?,dob=?,email=?,phone=?,residence_address=?,course_id=?,course=?,teacher=?,duration=?,start_date=?,end_date=?,course_fee=?,payment=? where student_id=?";
        PreparedStatement stmt =createStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, fname);
         stmt.setString(3, dob);
        stmt.setString(4,  email);
        stmt.setLong(5,  phone);
       stmt.setString(6, address);
       stmt.setString(7, cid);
       stmt.setString(8, coursename);
       stmt.setString(9, teacher);
       stmt.setString(10, duration);
        stmt.setString(11, sdate);
         stmt.setString(12, edate);
       stmt.setInt(13,coursefee);
       stmt.setInt(14, payment);
       stmt.setString(15, studentid);
        String msg ="";
        int i =stmt.executeUpdate();
        if(i>0)
            msg="Record udated Successfully";
        else
            msg="Updatation failed";
        
        return msg;
        
    }
    
}
