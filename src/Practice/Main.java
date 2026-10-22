package Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		FlightBookingSystem fbs = new FlightBookingSystem();
		
		Scanner sc = new Scanner(System.in);
		
		fbs.intializeFlights();
		
		while(true) {
		System.out.println("Enter 1: to display available flights");
		System.out.println("Enter 2: book Tickets");
		System.out.println("Enter 3: to cancel tickets");
		System.out.println("Enter 4 : display booking details");
		System.out.println("Enter 5: to exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: fbs.displayFlights();break;
		case 2: fbs.bookFlightTickets();break;
		case 3: fbs.cancelBookings();break;
		case 4: fbs.displayAllBookings();;break;
		case 5: System.exit(5);break;
		}
		
		
		}
		
		
		
	}

}
