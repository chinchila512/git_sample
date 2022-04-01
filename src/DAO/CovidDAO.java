package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Covid;
import model.SearchInput;
import model.SearchMonthlyInput;

public class CovidDAO {
	// データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/"
			+ "proassist?characterEncoding=UTF-8&serverTimezone=Asia/Tokyo";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";

	/** covidテーブルのSELECT文を実行するメソッド */
	public List<Covid> findByPrefecture(SearchInput input) {

		List<Covid> CovidList = new ArrayList<>();

		// データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			// SELECT文を準備
			String sql = "SELECT HIDUKE,PREFECTURE,CASES FROM COVID WHERE HIDUKE like ? AND PREFECTURE =?";
//			HIDUKE LIKE '?%' 
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, input.getHiduke());
			pStmt.setString(2, input.getPrefecture());

			System.out.println("SQL=" + pStmt.toString());

			// SELECT文を実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			// 結果表に格納されたレコードの内容をCovidインスタンスに設定
			while (rs.next()) {
				String hiduke = rs.getString("HIDUKE");
				String prefecture = rs.getString("PREFECTURE");
				int cases = rs.getInt("CASES");

				CovidList.add(new Covid(hiduke, prefecture, cases));
			}

			System.out.println("CovidList size=" + CovidList.size());

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return CovidList;

	}

	public List<Covid> findByPrefecture(SearchMonthlyInput input) {

		List<Covid> CovidList = new ArrayList<>();

		// データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			// SELECT文を準備
			String sql = "SELECT DATE_FORMAT(hiduke,'%y-%m')AS HIDUKE,\n"
					+ "SUM(CASES) AS CASES,PREFECTURE FROM covid \n"
					+ "where prefecture =? AND HIDUKE LIKE ? \n"
					+ "GROUP BY DATE_FORMAT(hiduke,'%y-%m')";

			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, input.getPrefecture());
			pStmt.setString(2, input.getMonthly());


			System.out.println("SQL=" + pStmt.toString());

			// SELECT文を実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			// 結果表に格納されたレコードの内容をCovidインスタンスに設定
			while (rs.next()) {
				String hiduke = rs.getString("HIDUKE");
				String prefecture = rs.getString("PREFECTURE");
				int cases = rs.getInt("CASES");

				CovidList.add(new Covid(hiduke, prefecture, cases));
			}

			System.out.println("CovidList size=" + CovidList.size());

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return CovidList;
	}
}