package com.ticket;

public class Ticket {
	private String from;
	private String to;
	private String train;
	private String trainClass;
	private String date;
	private PassengerList passengerList;
	private int fare;

	public Ticket(String from, String to, String train, String trainClass, String date, PassengerList passengerList) {
		super();
		this.from = from;
		this.to = to;
		this.train = train;
		this.trainClass = trainClass;
		this.date = date;
		this.passengerList = passengerList;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getTrainClass() {
		return trainClass;
	}

	public void setTrainClass(String trainClass) {
		this.trainClass = trainClass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PassengerList getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(PassengerList passengerList) {
		this.passengerList = passengerList;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}
