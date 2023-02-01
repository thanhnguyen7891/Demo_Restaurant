package Cogent.Restaurant;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerName("Huy");
		Waiter waiter=new Waiter();
		waiter.takeOrder(customer);
		customer.eat();
		Bill bill=new Bill();
		bill.generateBill(customer);
	}

}
