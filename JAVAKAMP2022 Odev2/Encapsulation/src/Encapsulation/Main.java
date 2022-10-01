package Encapsulation;
public class Main {
public static void main(String[] args)
{
	//Public heryerden erişilbilir demek.
	//Java defaultta publictir.
	//Private sadece tanımlandığı blokta geçerlidir.
	Product product=new Product();
	product.setId(1);
	product.setDescription("Asus-Laptop");
	product.setPrice(800);
	product.setStockAmount(9);
	System.out.println(product.getName());
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	Product product1 =new Product("Laptop","Monster",800,5,9);
	System.out.println(product1.getDescription());
	//Single Responsibility //her class bir iş yapsın	
		
}
}
