package Class;

public class Main {
public static void main(String[] args)
{
	//claslar referance tiptir
	CustomerManager customerManager=new  CustomerManager();
    CustomerManager customerManager2= new CustomerManager();
    customerManager=customerManager2;   //Artık kendi referansını değil customer Manager 2 nin referansını tutuyo.
	customerManager.Add();
	customerManager.Remove();
	customerManager.Update();
	
	//Garbage Collector=>Bellek Yçneticisi 
}
}
