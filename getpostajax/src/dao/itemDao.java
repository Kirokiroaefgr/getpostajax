package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.itemDTO;
import util.DBConnector;

public class itemDao {
	public ArrayList<itemDTO> select() {
		ArrayList<itemDTO> itemList= new ArrayList<>();
		String name = null;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection("cetus");
		String sql;
		sql = "SELECT * FROM item";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				itemDTO dto = new itemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				itemList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return itemList;
	}

	public itemDTO select01(int age) {
		ArrayList<itemDTO> itemList= new ArrayList<>();
		String name = null;
		itemDTO dto = new itemDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection("cetus");
		String sql;
		sql = "SELECT * FROM item WHERE item_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, age);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
