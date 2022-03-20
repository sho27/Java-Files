import java.sql.*;
public class UpdateRecord 
{
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pwd = "root";
		String query = "update student set sname = 'Ridham' where rollno = 5";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count + "row/s affected");
		
		st.close();
		con.close();
	}
}
