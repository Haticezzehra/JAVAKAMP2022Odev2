package Inheritance;

public class Main {

	public static void main(String[] args) {
		//Değişime direnmeyecek kodlar yazmak amaç.
		//Değişim geldiğinde programımız direnmemesi lazım.
		
		//Bir class sadece bir clası inherit edebilir.
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		KrediUI  krediUI=new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
