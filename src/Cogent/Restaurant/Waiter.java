package Cogent.Restaurant;

import java.util.Scanner;

public class Waiter {
	String listItems[]= {"1.Full meals --100","2.veg biriyani--150", "3.veg Rice--50",
			"4.veg Palav--100", "5.veg Manchuria--50", "6.gobi Nudles--50",
			"7.chicken Biriyani--200", "8.chicken65--200", "9.chicken Curry--100", 
			"10.chicken Manchuria--150"};
	void menu() {
		for(String item:listItems) {
			System.out.println(item);
		}
	}
	void takeOrder() {
		menu();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of items");
		int itemsNum=sc.nextInt();
		
		Order order=new Order();	
		// print menu and customer choose
		order.setNoOfItems(itemsNum);
		
		for(int i=0;i<itemsNum;i++) {
			System.out.println("items number "+(i+1)+": enter no of item from 1-10");
			order.item[i][0]=sc.nextInt();
			System.out.println("items number "+(i+1)+":enter quantity ");
			order.item[i][1]=sc.nextInt();
		}
		placeOrderToChef(order);
		
		
		
		
	}
	void placeOrderToChef(Order order) {
		NonVegChef nonVegChef=new NonVegChef();
		VegChef vegChef=new VegChef();
		for(int i=0;i<order.noOfItems;i++) {
			int noOrder=order.item[i][0];
			
			if(listItems[noOrder-1].contains("veg")) {
			System.out.println("order number "+noOrder+" is getting ready please wait (veg)");
			vegChef.callWaiter("veg");
			
			}else {
			System.out.println("order"+noOrder+" is getting ready please wait (non veg)");
			nonVegChef.callWaiter("non veg");
			}
		}
		
	}
}
