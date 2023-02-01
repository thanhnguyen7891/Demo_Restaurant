package Cogent.Restaurant;

public class Chef {
	void prepareOrder(Order order, String vegRnonVeg) {
		for(int i=0;i<order.noOfItems;i++) {
			System.out.println("order number"+(order.item[i][0]-1)+" is getting ready please wait"+vegRnonVeg);
			
		}
	}
	void callWaiter(String vegRnonVeg) {
		System.out.println("order is ready "+vegRnonVeg);
	}
}
