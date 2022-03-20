import java.sql.*;

public class DeleteRecord 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pwd = "root";
		String query = "delete from student where rollno = 6";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count + "row/s affected");
		
		st.close();
		con.close();
	}
}
