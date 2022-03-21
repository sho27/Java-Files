import java.sql.*;
public class UpdateAllRecords 
{

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pwd = "root";
		String query = "update student set address = 'Pehowa'";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		PreparedStatement st = con.prepareStatement(query);
		int count = st.executeUpdate();
		System.out.println(count + "row/s affected");
		
		st.close();
		con.close();
	}

}
