package Cogent.Restaurant;

public class Chef {
	void prepareOrder(Order order, String vegRnonVeg) {
		callWaiter(vegRnonVeg);
	}
	void callWaiter(String vegRnonVeg) {
		System.out.println("order is ready "+vegRnonVeg);
	}
}
