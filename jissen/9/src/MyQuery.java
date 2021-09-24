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
			//検索
			con = DriverManager.getConnection("jdbc:mysql://localhost/sukkiri", "root", null);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Name: " + rs.getString("name") + " , Price: " + rs.getInt("price") + " , Weight: " + rs.getInt("weight"));
			}
			rs.close();
			pstmt.close();
			
			//追加・更新・削除
			//**********追加**************
//			PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO ITEMS VALUES (?, ?, ?);");
//			pstmt2.setString(1, "銅のつるぎ");
//			pstmt2.setInt(2, 10);
//			pstmt2.setInt(3, 15);
//			int r = pstmt2.executeUpdate();
//			if (r != 0) {
//				System.out.println(r + "件の道具を追加しました");
//			} else {
//				System.out.println("道具の追加に失敗しました");
//			}
//			pstmt2.close();
			//**********更新**************
//			PreparedStatement pstmt3 = con.prepareStatement("UPDATE ITEMS SET WEIGHT=? WHERE NAME = ?;");
//			pstmt3.setInt(1, 55);
//			pstmt3.setString(2, "銅のつるぎ");
//			int r = pstmt3.executeUpdate();
//			if (r != 0) {
//				System.out.println(r + "件の道具を更新しました");
//			} else {
//				System.out.println("道具の更新に失敗しました");
//			}
//			pstmt3.close();
			//**********削除**************
//			PreparedStatement pstmt4 = con.prepareStatement("DELETE FROM ITEMS WHERE NAME = ?;");
//			pstmt4.setString(1, "銅のつるぎ");
//			int r = pstmt4.executeUpdate();
//			if (r != 0) {
//				System.out.println(r + "件の道具を削除しました");
//			} else {
//				System.out.println("道具の削除に失敗しました");
//			}
//			pstmt4.close();
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
