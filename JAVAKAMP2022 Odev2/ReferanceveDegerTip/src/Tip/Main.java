package Tip;

public class Main {
public static void main(String[] args)
{
	//Değer tiplerde sadece o değer atanırken referance tiplerde adres atanır
	int sayi1=10;
	int sayi2=20;
	sayi2=sayi1;
	System.out.println(sayi2);
	
	
	int[] sayilar1= {1,5,6};
	int[] sayilar2= {3,6,7};
	sayilar1=sayilar2;
	sayilar1[0]=3;
	System.out.println(sayilar2[0]);
	
	
}
}
