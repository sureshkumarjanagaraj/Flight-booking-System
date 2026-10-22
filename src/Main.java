
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	FlightReservationSystem frs = new FlightReservationSystem();
	Scanner sc = new Scanner(System.in);
	 Flight f = new Flight();
	
	frs.intializeFlights();
	
	while(true) {
		System.out.println("Click 1 to see flights");
		System.out.println("Click 2 to book tickets");
		System.out.println("Click 3 to cancel tickets");
		System.out.println("Click 4 to display booked tickets");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1 : frs.displayFlights();break;
		case 2 : frs.bookTickets();break;
		case 3 : frs.cancelSeats();break;
		case 4 : frs.displayAllBookings();break;
		}
	}
}
}
