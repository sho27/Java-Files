import java.sql.*;
public class InsertRecord 
{

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "root";
		String query ="insert into student values (5, 'Alisha')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count + "row/s affected");
		st.close();
		con.close();
	}

}
