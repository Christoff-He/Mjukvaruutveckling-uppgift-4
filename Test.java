package uppgift4;

public class Test {

	public static void main(String[] args) {
	//Testning av Account's metoder
	
	Account konto = new Account();
	
	konto.setNbr("123");
	
	System.out.println(konto.getNbr());
	
	konto.setBalance(100);
	
	System.out.println(konto.getBalance());
	
	konto.credit(10);
	
	System.out.println(konto.getBalance());
	
	konto.withdraw(100);
	
	System.out.println(konto.getBalance());
	
	}
}