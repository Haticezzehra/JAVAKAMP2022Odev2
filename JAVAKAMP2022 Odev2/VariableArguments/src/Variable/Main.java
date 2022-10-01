package Variable;

public class Main {
public static void main(String [] args)
{
	int sonuc=topla(6,8,9,6,9);
	System.out.println(sonuc);
}

public static int topla(int... sayilar)
{
	int toplam =0;
	for (int i : sayilar) {
		toplam=toplam+i;
	}
	return toplam;
}
}
