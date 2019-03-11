package edu.neu.cs6510.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class DtoWriter implements ItemWriter<List<LookUpData>> {

	private final String url = "jdbc:postgresql://gov-fin-dev.cfs8wixk7pzv.us-west-1.rds.amazonaws.com/postgres";
	private final String user = "gov_fin_dev";
	private final String password = "11111111";

	@Override
	public void write(List<? extends List<LookUpData>> items) throws Exception {

		int i = 0;
		Connection conn = null;
	    try {
	        conn = DriverManager.getConnection(url, user, password);
	        System.out.println("Connected to the PostgreSQL server successfully.");

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

		
	    PreparedStatement st = conn.prepareStatement("INSERT INTO GOV_FIN_LOOKUP (attribute_mapping_id,location_id,value,year) values ( ?, ?, ?, ?)");
		
		for (List<LookUpData> l : items) {
			for (LookUpData ll : l) {
				
				try {
			
				st.setInt(1, ll.attribute_mapping_id);
				st.setInt(2, ll.location_id);
				st.setDouble(3, ll.value);
				st.setInt(4, ll.year);
				st.executeUpdate();
				
				}
				catch(Exception e) {
					//System.out.println(e.getMessage());
				}
				
			}
			
		//	System.out.println("done for record: "+i++);
			
		}
		st.close();

		System.out.println("Batch done");
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
