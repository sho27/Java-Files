import java.sql.*;
public class MySqlDatabase 
{

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "root";
		String query ="select * from student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			int id = rs.getInt("rollno");
			String name = rs.getString("sname");		
			System.out.println(id + " " + name);
		}
		
		st.close();
		con.close();
	}

}
