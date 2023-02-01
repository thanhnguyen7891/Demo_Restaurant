package Cogent.Restaurant;

public class Customer {
	private String customerName;
	private int customerTableNumber;
	Order order;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	 Order orderingItems() {
		return this.order;
	}
	 void eat() {
		
	}
	
}
