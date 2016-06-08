package baseball;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetailDao {
	DetailDto list = new DetailDto();
	List<DetailDto> resultList = new ArrayList<>();

	public List<DetailDto> load(int id){
		//接続
		Connection con = DBManager.createConnection();

		//SQLをセット
		String sql = "SELECT"
				+ " T01.TEAM_NAME AS TEAMNAME"
				+ " ,T01.HEADQUARTERS"
				+ " ,T01.INAUGURATION"
				+ " ,T01.HISTORY"
		   + " FROM"
				+ " BASEBALL_TEAMS T01"
		   + " WHERE"
		   		+ " T01.ID = " + id;

		try {
			//SQLの発行準備
			PreparedStatement ps = con.prepareStatement(sql);

			//SQL発行
			ResultSet rs = ps.executeQuery();

			//結果の取り出し
			if(rs.next()){
				list = new DetailDto();

				list.setId(id);
				list.setTeamName(rs.getString("teamName"));
				list.setHeadQuarters(rs.getString("headQuarters"));
				list.setInauguration(rs.getString("inauguration"));
				list.setHistory(rs.getString("history"));

				//リストに追加する
				resultList.add(list);
			}

			//サーブレットに結果を返す
			return resultList;

		} catch (SQLException e) {
			throw new RuntimeException("DB処置に失敗しました");

		} finally {
			System.out.println("sql: " + sql);

			//DB切断
			DBManager.cloneConnection(con);
		}
	}



}
