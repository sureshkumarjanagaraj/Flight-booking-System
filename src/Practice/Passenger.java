package Practice;

public class Passenger {
	
	private String bookingId;

	private String passengerName;
	
	private int age;
	
	private int numberOfTickets;
	
	public Passenger(String bookingId, String passengerName, int age, int numberOfTickets) {
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.age = age;
		this.numberOfTickets = numberOfTickets;

	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	@Override
	public String toString() {
		return "Passenger { bookingId: " + bookingId + " passengerName: " + passengerName + " age: " + age
				+ " numberOfTickets: " + numberOfTickets + "}";
	}
	
	
}
