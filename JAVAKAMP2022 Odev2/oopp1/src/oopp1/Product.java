package oopp1;

//PascaLCase
public class Product {
	private String name;// Clasın alanları
	private double unitPrice;// Fieldlar camelCase Yazılır
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}
/*
	public void setDiscount(double discount) { ////Kimse set edemesin sadece okunsun diye set işlemini kapattık
		this.discount = discount; 
	}
*/
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

// Private sadece o sınıfın içinde kullanılabilir demek.
}
