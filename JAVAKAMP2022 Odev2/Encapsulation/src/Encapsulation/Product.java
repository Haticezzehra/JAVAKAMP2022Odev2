package Encapsulation;
//Her clasın contructoru vardır.

public class Product {
	// Ürüne ait bilgileri tuttuk.
	///attribute,field
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private int id;
	//SET DEGER VERMEYE YARAR
	//GET OKUMAYA YARAR
	public Product()
	{
		System.out.println("Yapici blok çalisti.");
	}
	public Product(String name,String description,double price,int stockAmount,int id)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//THİS İÇİNDE BULUNDUĞUMUZ CLASS DEMEK
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

