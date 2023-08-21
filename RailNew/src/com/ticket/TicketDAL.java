package com.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TicketDAL {
	Connection c = null;
	PreparedStatement st = null;
	ArrayList<Ticket> ticketal = new ArrayList<Ticket>();

	public void setTicketData() {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training", "plf_training_admin",
					"pff123");
			st = c.prepareStatement("insert into ticketnew values ?,?,?,?,?,?,?,?");
			ResultSet rs = st.executeQuery();
		} catch (Exception ex) {

		}
	}

}
