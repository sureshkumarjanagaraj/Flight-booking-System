package Practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightBookingSystem {

	private Map<String, Flight> flights = new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	Flight f = new Flight();
	
	public void intializeFlights() {
		flights.put("INDIGO", new Flight("INDIGO", 50));
		flights.put("KINGFISHER", new Flight("KINGFISHER", 80));
	}
	
	public void displayFlights() {
		for(Flight flight : flights.values()) {
			System.out.println(flight);
		}
	}
	
	public void bookFlightTickets() {
		System.out.println("Enter a flight name");
		String flightName = sc.next().toUpperCase();
		
		 Flight selectedFlight = flights.get(flightName);
		 
		 if(selectedFlight != null) {
			 
			 System.out.println("Enter a name");
			 String passengerName = sc.next();
			 
			 System.out.println("Enter a age");
			 int age = sc.nextInt();
			 
			 System.out.println("Enter a number of seats want to book");
			 int numberOfTickets = sc.nextInt();
			 
			 String bookingId = selectedFlight.bookTickets(passengerName, age,  numberOfTickets);
			 
			 if(bookingId == null) {
				 System.out.println("There is no tickets availble so booking cancelled");
				 return;
			 }
			 
			 System.out.println("Succesfully ticked booked and the booking Id is: " + bookingId);
		 }
		 else {
			 System.out.println("There is flight contains with this name : " + flightName);
			 return;
		 }
	}
	
	public void cancelBookings() {
		
		System.out.println("Enter a flight name which is booked");
		String flightName = sc.next().toUpperCase();
		
		Flight cancelBookings = flights.get(flightName);
		
		if(cancelBookings != null) {
			
			System.out.println("Enter a bookingId");
			String cancelBookingId = sc.next().toUpperCase();
			String cancelBooking =  cancelBookings.cancelBookings(cancelBookingId);
			
			if(cancelBooking == null) {
				System.out.println("There is no boooking id found with this " + cancelBookingId);
				return;
			}
			
			System.out.println("Ticket has been  removed " + cancelBooking + " the amount is refunded" );
			return;
		}
		
		else {
			System.out.println("There is no flight name with this " + flightName);
		}
		
	}
	
	
	public void displayAllBookings() {
		
		boolean found = false;

	  for(Flight flight : flights.values()) {
		  for(Passenger booking : flight.getBookings().values()) {
			  System.out.println(booking);
			  found = true;
		  }
	  }
	  
	  if(!found) {
		  System.out.println("There is no bookings made");
	  }
	
	}
}
