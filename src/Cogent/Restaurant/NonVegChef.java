package Cogent.Restaurant;

public class NonVegChef extends Chef {
	public void nonVegSection(Order order) {
		for(int i=0;i<order.noOfItems;i++) {
			System.out.println("order number"+(order.item[i][0]-1)+" is ready (non veg)");
		}
	}
}
