package uppgift4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fortsätta = "";
		double belopp = 0;
		int svar;
		
		do {
			
			System.out.println("Insättning eller uttag? (0-insättning, 1-uttag)");
			svar = scan.nextInt();
			
			if (svar == 0) {
				System.out.println("Ange belopp: ");
				belopp = scan.nextInt();
				
				Account.credit(belopp);
				
			}if (svar == 1) {
				System.out.println("Ange belopp: ");
				belopp = scan.nextInt();
				
				Account.withdraw(belopp);
				
			}
			
			System.out.println("Saldo: " + Account.getBalance());
			
			System.out.println("Vill du avsluta?");
			fortsätta = scan.next();
			
			} while (!"J".equals(fortsätta));
		
		System.out.println("Saldo: " + Account.getBalance());
		System.out.println("Programmet Avslutas");

	}

}
