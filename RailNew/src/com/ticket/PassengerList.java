package com.ticket;

import java.util.ArrayList;

public class PassengerList {
	ArrayList<Passenger> pl = new ArrayList<Passenger>();

	public PassengerList(ArrayList<Passenger> pl) {
		super();
		this.pl = pl;
	}

	public ArrayList<Passenger> getPl() {
		return pl;
	}

	public void setPl(ArrayList<Passenger> pl) {
		this.pl = pl;
	}

}
