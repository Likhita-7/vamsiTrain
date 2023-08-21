<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ticket.Ticket, com.ticket.Passenger, com.ticket.PassengerList,com.ticket.Farecal"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket Details</title>
</head>
<body>
    <h1>Ticket Details</h1>
    <table>
        <tr>
            <th>From</th>
            <td><%= ((Ticket) request.getAttribute("ticket")).getFrom() %></td>
        </tr>
        <tr>
            <th>To</th>
            <td><%= ((Ticket) request.getAttribute("ticket")).getTo() %></td>
        </tr>
       <tr>
            <th>Train Name</th>
            <td><%= ((Ticket) request.getAttribute("ticket")).getTrain() %></td>
        </tr>
    </table>
    <h2>Passenger List</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
        </tr>
        <%
            PassengerList passengerList = ((Ticket) request.getAttribute("ticket")).getPassengerList();
            for (Passenger passenger : passengerList.getPl()) {
        %>
        <tr>
            <td><%= passenger.getName() %></td>
            <td><%= passenger.getAge() %></td>
            <td><%= passenger.getGender() %></td>
        </tr>
        <%
            }
        %>
        
        
        
    </table>
    <br>
    <div>
    <h1>Total fare :</h1>
    <%=  ((Ticket) request.getAttribute("ticket")).getFare() %>
    </div>
    
    
  
   
</body>
</html>
