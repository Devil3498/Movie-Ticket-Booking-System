package TheatreOperations;

public class Ticket {
	Customer customer;
	float price=50;
	
	public Customer getCustomer() {
		return customer;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public Ticket(Customer customer,float price) {
		this.customer=customer;
		this.price=price*customer.getChoiceOfSeats().length;
	}
	

}