package com.example.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DtoWriter implements ItemWriter<List<LookUpData>> {

	private final String url = "jdbc:postgresql://gov-fin-dev.cfs8wixk7pzv.us-west-1.rds.amazonaws.com/postgres";
	private final String user = "gov_fin_dev";
	private final String password = "11111111";

	@Override
	public void write(List<? extends List<LookUpData>> items) throws Exception {

		Connection conn = null;
	    try {
	        conn = DriverManager.getConnection(url, user, password);
	        System.out.println("Connected to the PostgreSQL server successfully.");

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

		
		
	    
		for (List<LookUpData> l : items) {
			for (LookUpData ll : l) {
				
				PreparedStatement st = conn.prepareStatement("INSERT INTO GOV_FIN_LOOKUP (id,attribute_mapping_id,location_id,value,year) values (seq.nextval, ?, ?, ?, ?)");
				st.setInt(1, ll.attribute_mapping_id);
				st.setInt(2, ll.location_id);
				st.setDouble(3, ll.value);
				st.setInt(4, ll.year);
				st.executeUpdate();
				st.close();
				
				
				/*System.out.println(ll.getAttribute_mapping_id());
				String sql = "INSERT INTO GOV_FIN_LOOKUP (attribute_mapping_id,location_id,value,year) "
		                + "VALUES " + "(" + ll.attribute_mapping_id + ", " + ll.location_id + ", " + ll.value + ", " + ll.year + ")";
				Statement stmnt = null;
				stmnt.executeUpdate(sql);*/
			}
		}

	}

	public Connection connect() {
	    Connection conn = null;
	    try {
	        conn = DriverManager.getConnection(url, user, password);
	        System.out.println("Connected to the PostgreSQL server successfully.");

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

	    return conn;
	}
}
