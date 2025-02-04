package Bibliotheque;

public class Livre {
	private String Name;
	private double Price;
	private int Quantity;
	
	public Livre() {
		Name = "Harry Potter";
		Price = 25.99;
		Quantity = 12;
	}
	
	public String getName() {
		return Name;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	
	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}
	
	public String toString() {
		return "Livre[Name=" + Name + ",Price=" + Price + ",Quantity=" + Quantity + "]";
	}
}
