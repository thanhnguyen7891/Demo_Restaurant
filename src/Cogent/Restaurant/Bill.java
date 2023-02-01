package Cogent.Restaurant;

import java.util.StringTokenizer;

public class Bill {
	Order order;
	int bill;
	int count;
	static int totalBill=0;
	
	void generateBill(Customer customer) {
		int total=0;

		this.order=customer.order;
		System.out.println("dear customer "+ customer.getCustomerName()+" your bill:");
		System.out.println("invoice");
		System.out.println("---------");
		System.out.printf("%-20s %-10s %-10s \n","Item","Quant","Bill");
		System.out.printf("%-20s %-10s %-10s \n","------","------","------");
		for(int i=0;i<order.noOfItems;i++) {
			int no=order.item[i][0]-1;
			String menuString=Waiter.listItems[no];
			StringTokenizer st=new StringTokenizer(menuString," :-.1234567890");
			
			StringBuffer itemString= new StringBuffer();
			while(st.hasMoreTokens()) {
				itemString.append(st.nextToken()+" ");
			}
			int quant=order.item[i][1];
			
			int itemPrice=Integer.parseInt(menuString.substring(2).replaceAll("[^0-9]", ""))*quant;
			total+=itemPrice;
			System.out.printf("%-20s %-10d %-10d",itemString,quant,itemPrice);
			System.out.println();
			System.out.printf("%-20s %-10s %-10s \n","------","------","------");
			
		}
		System.out.printf("%-20s %-10s %-10d \n","Total Bill","",total);
		
	}
}
