package Cogent.Restaurant;

public class Customer {
	private String customerName;
	//private int customerTableNumber;
	Order order;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	 public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	Order orderingItems() {
		return this.order;
	}
	 void eat() {
		System.out.println(this.customerName+" is eating ....");
	}
	
}
