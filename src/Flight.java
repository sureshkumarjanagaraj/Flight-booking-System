import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Flight {
	
	private String FlightName;
	
	private int availableSeats;
	
	private int TicketPrice;
	
	private Map<String, Passenger> bookings = new HashMap<String, Passenger>();
	private int bookingCounter = 1;
	private Scanner sc = new Scanner(System.in);

	public Flight(String flightName) {
		super();
		FlightName = flightName;
		this.availableSeats = 50;
		this.TicketPrice = 5000;
	}
	
	public Flight() {
		
	}
	
	public String bookTickets(int seats, int age, String name) {

	    if (seats <= availableSeats) {

	        String bookingId = "T" + bookingCounter++;

	        TicketPrice += seats * 200;
	        availableSeats -= seats;

	        Passenger passenger = new Passenger(bookingId, name, age, seats);

	        bookings.put(bookingId, passenger);

	        return bookingId;
	    }

	    return null;
	}

	@Override
	public String toString() {
		return "FlightName: " + FlightName + " totalSeats: " + availableSeats + " TicketPrice: " + TicketPrice;
	}

	public void cancelSeats() {

	    System.out.println("Enter a Booking Id to cancel");
	    String bookingId = sc.next();

	    Passenger cancelBooking = bookings.get(bookingId);

	    if (cancelBooking != null) {

	        availableSeats += cancelBooking.getNumberOfTickets();

	        TicketPrice -= cancelBooking.getNumberOfTickets() * 200;

	        bookings.remove(bookingId);

	        System.out.println("Successfully canceled the ticket and the amount is refunded");
	    }
	    else {
	        System.out.println("There is no booking id present " + bookingId);
	    }
	}

	public Map<String, Passenger> getBookings() {
		return bookings;
	}

	public void setBookings(Map<String, Passenger> bookings) {
		this.bookings = bookings;
	}
}
