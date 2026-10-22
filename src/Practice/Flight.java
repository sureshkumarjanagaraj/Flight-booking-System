package Practice;

import java.util.HashMap;
import java.util.Map;

public class Flight {

	private String flightName;
	
	private int totalSeats;
	
	private int ticketPrice;
	
	private int bookingCounter = 1;
	
	private Map<String, Passenger> bookings = new HashMap<String, Passenger>();

	public Flight(String flightName, int totalSeats) {
		
		this.flightName = flightName;
		this.totalSeats = totalSeats;
		this.ticketPrice = 5000;
	}
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

public String bookTickets(String passengerName, int age, int numberOfTickets) {
		
		if(numberOfTickets <= totalSeats) {
			
			String bookingId = "T" + bookingCounter;
			
			totalSeats -= numberOfTickets;
			ticketPrice += numberOfTickets *200;
			
			Passenger passenger = new Passenger(bookingId, passengerName, age, numberOfTickets);
			bookings.put(bookingId, passenger);
			return bookingId;
		}
			return null;
	}

	public String cancelBookings(String cancelBookingId) {
		 Passenger cancelBookings =  bookings.get(cancelBookingId);
		 
		 if(cancelBookings != null) {
			 
			 totalSeats += cancelBookings.getNumberOfTickets();
			 ticketPrice -= cancelBookings.getNumberOfTickets() * 200;
			 bookings.remove(cancelBookings);
			 return cancelBookingId;
		 }
		 return null;
	}
		

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Map<String, Passenger> getBookings() {
		return bookings;
	}

	public void setBookings(Map<String, Passenger> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Flight { flightName: " + flightName + " totalSeats: " + totalSeats + " ticketPrice=" + ticketPrice
				+ "}";
	}
		
}
