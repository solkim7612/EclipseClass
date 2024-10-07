package day09;

public class Food {
	
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	public Food() {
		// TODO Auto-generated constructor stub
	}
	

}
