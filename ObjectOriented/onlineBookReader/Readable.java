package onlineBookReader;

public abstract class Readable {
	private String name;
	private int numOfPages;
	private double price;
	private int id;
	
	public Readable(int id, String name, int numOfPages, double price){
		this.id = id;
		this.name = name;
		this.numOfPages = numOfPages;
		this.price = price;
	}
}
