package udmyJavaProject;

import java.util.Scanner;

public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scanner =new Scanner(System.in);
		
		String kullanciAdi;
		String parola;
		System.out.println("Kullanci Adi: ");
		kullanciAdi=scanner.nextLine();
		
		System.out.println("Parola: ");
		parola=scanner.nextLine();
		
		if(hesap.getKullanciAdi().equals(kullanciAdi) && hesap.getParola().equals(parola)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
