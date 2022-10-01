
public class Main {
	//Void birşey döndürmez sadece o işlemi yapar.
public static void Main(String[] args)
{
	ekle();
	int toplam=topla(8,7);
	System.out.println(toplam);
	
}
public static void ekle()
{
	System.out.println("Eklendi");
}
public static void sil()
{
	System.out.println("Silindi");
}
public static void guncelle()
{
	System.out.println("Guncellendi");
}

public static String sehirVer()
{
	return "Ankara";
	
}

public static int topla(int sayi1,int sayi2)
{
	return sayi1+sayi2;
}
}
