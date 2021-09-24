import java.sql.*;

public class MyQuery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました。");
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/sukkiri", "root", null);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Name: " + rs.getString("name") + " , Price: " + rs.getInt("price") + " , Weight: " + rs.getInt("weight"));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
