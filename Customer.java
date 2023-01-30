package TheatreOperations;

public class Customer {
	String customerName;
	int seats[];
	String showtime;

	//Paramterized Constructor of Customer Class to initalize its object
	public Customer(String customerName, int seats[], String showTime) {
		this.customerName = customerName;
		this.seats = seats;
		this.showtime = showTime;
	}

	//default non-paramaterized void constructor
	public Customer() {
		
	}

	
	//Getters and setters
	
	public int[] getSeats() {
		return seats;
	}

	
	public void setSeats(int[] seats) {
		this.seats = seats;
	}

	
	public String getShowtime() {
		return showtime;
	}


	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	

	public int[] getChoiceOfSeats() {
		return seats;
	}

	
	public void setChoiceOfSeats(int[] choiceOfSeats) {
		this.seats = choiceOfSeats;
	}

	public String getCustomerName() {
		return customerName;
	}

	
	public void setCustomerName(String name) {
		this.customerName = name;
	}

}