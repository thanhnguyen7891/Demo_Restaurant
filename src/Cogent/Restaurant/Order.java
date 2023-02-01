package Cogent.Restaurant;

public class Order {
	static int orderNum;
	int item[][];
	int noOfItems;
	
	public int[][] getItem() {
		return item;
	}
	public void setItem(int num) {
		this.item = new int[num][2];
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
		setItem(noOfItems);
	}
	
}
