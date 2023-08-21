package com.ticket;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bookingservlet")
public class Bookingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bookingservlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String froms = request.getParameter("from");
		String tos = request.getParameter("to");
		String train = request.getParameter("train");
		String classs = request.getParameter("class");
		String datee = request.getParameter("datee");
		String[] names = request.getParameterValues("names");

		String[] ages = request.getParameterValues("age");

		String[] genders = request.getParameterValues("gender");

		ArrayList<Passenger> passengers = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			Passenger passenger = new Passenger(names[i], genders[i], Integer.parseInt(ages[i]));
			passengers.add(passenger);
		}
		PassengerList passengerList = new PassengerList(passengers);

		Ticket ticket = new Ticket(froms, tos, train, classs, datee, passengerList);
		int ticketlength = passengers.size();
		System.out.println(Farecal.calculateFare(ticketlength, classs));
		ticket.setFare(Farecal.calculateFare(ticketlength, classs));

		request.setAttribute("ticket", ticket);
		request.getRequestDispatcher("/ticket.jsp").forward(request, response);

	}
}
