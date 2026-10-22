
 class Passenger {

	private String bookingId;
	
	private String name;
	
	private int age;
	
	private int numberOfTickets;

	public Passenger(String bookingId, String name, int age, int numberOfTickets) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.age = age;
		this.numberOfTickets = numberOfTickets;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BookingId: " + bookingId + ", name: " + name + ", age: " + age + ", numberOfTickets: "
				+ numberOfTickets;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	
	
	
	
	
	
}
