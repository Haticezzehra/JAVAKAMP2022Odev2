package Inheritance;

public class Main {

	public static void main(String[] args) {
		Custpmer customer =new Custpmer();
		Employe employe=new Employe();
	
		EmployeeManager employeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
        employeManager.List();
	}

}
