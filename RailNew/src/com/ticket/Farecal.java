package com.ticket;

public class Farecal {
	private static int basefare = 300;

	public Farecal() {
	}

	public static int calculateFare(int passlength, String travelClass) {
		int fare = basefare;

		if (travelClass.equals("AC")) {
			fare += 500;
		}

		return fare * passlength;
	}
}
