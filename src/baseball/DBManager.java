package baseball;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private final static String DB_NAME = "postgres";
	private final static String URL = "jdbc:postgresql://localhost:5432/" + DB_NAME;
	private final static String USER_NAME = "postgres";
	private final static String PASSWORD = "M9P9U9ZE*";

	public static Connection createConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			return con;

		} catch (Exception e) {
			throw new RuntimeException("DB接続に失敗しました", e);
		}
	}

	public static void cloneConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
		}
	}
}
