import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FlightReservationSystem {

	private HashMap<String, Flight> flights = new HashMap<String, Flight>();
	
	private Scanner sc = new Scanner(System.in);
	
	public void intializeFlights() {
		flights.put("INDIGO", new Flight("Indigo"));
		flights.put("KINGFISHER", new Flight("KingFisher"));
	}
	
	public void displayFlights() {
		
		for(Flight flight: flights.values()) {
			System.out.println(flight);
		}
		System.out.println();
	}
	
	public void bookTickets() {
		displayFlights();
		
		System.out.println("Enter a flightName to book (Indigo/ KingFisher)");
		String flightName = sc.next().toUpperCase();
		
		Flight selectedFlight = flights.get(flightName);
		
		if(selectedFlight != null) {
			
			System.out.println("Enter a passenger name");
			String name = sc.next();
			System.out.println("Enter a age ?");
			int age = sc.nextInt();
			System.out.println("Enter a TotalNumber of seats to book");
			int totalSeats = sc.nextInt();
			 String bookingId = selectedFlight.bookTickets(totalSeats, age, name);
			 
			 if(bookingId == null) {
				 System.out.println("There is no availbale seats. Booking failed");
				 return;
			 }
			 
			 System.out.println("Sucessfully tickes booked, booking id :" + bookingId);
		}
			else {
			System.out.println("There is no flight name ");
			return;
		}
	}
	
	public void cancelSeats() {
		
		System.out.println("Enter a flight name that you booked ? ");
		String flightName = sc.next().toUpperCase();
		
		Flight cancelFlight = flights.get(flightName);
		
		if(cancelFlight != null) {
			cancelFlight.cancelSeats();
		}
		else {
			System.out.println("There is no flight name like this "+ flightName);
		}
		
	}
	
	public void displayAllBookings() {

	    boolean found = false;
	    
	    for (Flight flight : flights.values()) {

	        if (!flight.getBookings().isEmpty()) {
	            for (Passenger passenger : flight.getBookings().values()) {
	                System.out.println(passenger);
	                System.out.println();
	            }

	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("There are no bookings made!!");
	    }
	}
	
}
