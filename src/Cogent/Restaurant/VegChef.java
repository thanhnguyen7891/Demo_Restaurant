package Cogent.Restaurant;

public class VegChef extends Chef {
	public void vegSection(Order order) {
		for(int i=0;i<order.noOfItems;i++) {
			System.out.println("order number"+(order.item[i][0]-1)+" is getting please wait ready (veg)");
		}

	}
}
