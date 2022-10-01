package oopp1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
	    product1.setName("Delonghi kahve makinesi");
	   // product1.setDiscount(7);
	    product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("img");
		

		Product product2 = new Product();
		 product2.setName("karaca kahve makinesi");
		   // product1.setDiscount(7);
		    product2.setUnitPrice(7500);
	        product2.setUnitsInStock(3);
	        product2.setImageUrl("img");

		Product product3 = new Product();
		 product3.setName("Kitchen kahve makinesi");
		   /// product1.setDiscount(7);
		    product3.setUnitPrice(7500);
	        product3.setUnitsInStock(3);
	        product3.setImageUrl("img");
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		for(Product product:products)
		{
			System.out.println("<li>"+product.getName()+"<li>");
		}
		System.out.println("<ul>");
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("768780");
		individualCustomer.setCustomerNumber("23245");
		individualCustomer.setFirstName("Hatice Zehra");
		individualCustomer.setLastName("Orhan");
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
	    corporateCustomer.setCompanyName("Kodlama.io");
	    corporateCustomer.setPhone("465467");
	    corporateCustomer.setTaxNumber("11111111");
	    corporateCustomer.setCustomerNumber("325345");
	    Customer[] cutomers= {individualCustomer,corporateCustomer};
	
	}
	
	

}
