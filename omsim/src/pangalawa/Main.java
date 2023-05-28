package pangalawa;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Methods m = new Methods();
	Scanner scn = new Scanner(System.in);
	while(true) 
	{
		System.out.println("1:VIEW ALL PRODUCTS \n2:ADD PRODUCT \n3:UPDATE PRODUCT PRICE \n4:UPDATE PRODUCT QUANTITY \n5:VIEW PRODUCT DETAILS \n6:INVENTORY \n7:EXIT");
		int op = scn.nextInt(); scn.nextLine();
		if(op == 1) 
		{
			m.displayAllProduct();
		}
		else if(op == 2) 
		{
			System.out.println("enter product name: ");
			String name = scn.nextLine();
			System.out.println("enter product quantity: ");
			int quantity = scn.nextInt(); scn.nextLine();
			System.out.println("enter product price: ");
			int price = scn.nextInt(); scn.nextLine();
			System.out.println("enter supplier name: ");
			String supplier = scn.nextLine();
			m.addProduct(name, quantity,price,supplier);
		}
		else if(op == 3) 
		{
			m.productPrice();
		}
		else if(op == 4) 
		{
			m.productQuantity();
		}
		else if(op == 5) 
		{
			m.displayProduct();
		}
		else if(op == 6) 
		{
			m.inventory();
		}
		else if(op == 7) 
		{
			break;
		}
	}
	
	
}
}
