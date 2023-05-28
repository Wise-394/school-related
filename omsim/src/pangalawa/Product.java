package pangalawa;

public class Product {
	private String name;
	private int quantity; 
	private int price; 
	private String supplier;
	Product(String name, int quantity, int price, String supplier)
	{
		this.setName(name);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setSupplier(supplier);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
}
