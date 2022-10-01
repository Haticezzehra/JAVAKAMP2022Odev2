package Metod;

public class Main {
	
public static void main(String[] args)
{
	sayiBulmaca();
}

public static void sayiBulmaca()
{
	
			int[] sayilar= {1,2,5,7,9,0};
			int aranacak =3;
			boolean	varMi=false;
			for(int sayi:sayilar)
			{
				if(sayi==aranacak)
				{
					varMi=true;
				}
			}
			if(varMi==true)
			{
				mesajVer("Aranacak sayi dizide var.", aranacak);
			}
			else
			{
				mesajVer("Aranacak sayi dizide yok.", aranacak);
			}
		

}

public static void mesajVer(String mesaj,int aranacak)
{
	System.out.println(mesaj+aranacak);
}
}
