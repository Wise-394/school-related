package pangalawa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//(String name, int quantity, int price, String supplier
public class Methods {

	public static List <Product> productList = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	
	public void addProduct(String name, int quantity, int price, String supplier) 
	{
		Product product = new Product(name,quantity,price,supplier);
		productList.add(product);
	}
	public void displayProduct() 
	{
		for(Product product : productList) 
		{
			System.out.println(product.getName());
		}
	}
	public void productQuantity() 
	{
		displayProduct();
		System.out.println("enter product name to edit quantity: ");
		String productName = scn.nextLine();
		int quantityToEdit = scn.nextInt();
		boolean success = false;
		for(Product product : productList) 
		{
			if(productName.equals(product.getName())) 
			{
				product.setQuantity(quantityToEdit);
				success = true;
				break;
			}
		}
		if(success == false) 
		{
			System.out.println("invalid product name");
		}
	}
	public void productPrice() 
	{
		displayProduct();
		System.out.println("enter product name to edit price: ");
		String productName = scn.nextLine();
		System.out.println("enter mew price: ");
		int priceToEdit = scn.nextInt(); scn.nextLine();
		boolean success = false;
		for(Product product : productList) 
		{
			if(productName.equals(product.getName())) 
			{
				product.setPrice(priceToEdit);
				success = true;
				break;
			}
		}
		if(success == false) 
		{
			System.out.println("invalid product name");
		}
	}
	public void displayAllProduct() 
	{
		for(Product product : productList) 
		{
			System.out.println(product.getName() + " PRICE: " + product.getPrice() + " QUANTITY: " + product.getQuantity() + " SUPPLIER: " + product.getSupplier() );
		
		}
	}
	public void searchProduct() 
	{
		displayProduct();
		System.out.println("enter product name: ");
		String productName = scn.nextLine();
		boolean success = false;
		for(Product product : productList) 
		{
			if(productName.equals(product.getName())) 
			{
				System.out.println(product.getName() + "PRICE: " + product.getPrice() + "QUANTITY: " + product.getQuantity() + "SUPPLIER: " + product.getSupplier() );
				success = true;
				break;
			}
		}
		if(success == false) 
		{
			System.out.println("invalid product name");
		}
	}
	public void removeProduct() 
	{
		displayProduct();
		System.out.println("enter product name: ");
		String productName = scn.nextLine();
		boolean success = false;
		for(Product product : productList) 
		{
			int i = 0;
			if(productName.equals(product.getName())) 
			{
				productList.remove(i);
			}
			i++;
		}
		if(success == false) 
		{
			System.out.println("invalid product name");
		}
	}
	public void inventory() {
	    try (FileWriter fr = new FileWriter("FILE.txt");
	         BufferedWriter bw = new BufferedWriter(fr)) {

	        for (Product product : productList) {
	            bw.write(product.getName() + "PRICE: " + product.getPrice() + "QUANTITY: " + product.getQuantity() + "SUPPLIER: " + product.getSupplier());
	            bw.newLine();  // Add a new line after each product
	        }

	        bw.flush();  // Flush the BufferedWriter
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
}

