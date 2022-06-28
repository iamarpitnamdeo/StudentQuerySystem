package Database;
import java.sql.*;

public class DBConnect {
  public Connection cn=null;
  public DBConnect()throws Exception
  {
	  Class.forName("org.postgresql.Driver");
	  cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sakshi@123");
  }
  public void queryExecuter(String sql)throws Exception
  {
	  Statement stmt=cn.createStatement();
	  stmt.execute(sql);
	  stmt.close();
	  
  }
  public ResultSet queryReturner(String sql)throws Exception{
	  Statement stmt=cn.createStatement();
	  ResultSet rs=stmt.executeQuery(sql);
	  return rs;
  }
}
