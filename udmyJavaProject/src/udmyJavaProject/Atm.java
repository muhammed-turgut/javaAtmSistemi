package udmyJavaProject;

import java.util.Scanner;

public class Atm {
	public void calis(Hesap hesap){
		Login login=new Login();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bankamıza Hoşgeldiniz...");
		
		System.out.println("****************************");
		System.out.println("Kullancı Girişi");
		System.out.println("****************************");
		
		int girisHakki=3;
		
		while(true){
			if(login.login(hesap)) {
				System.out.println("Giriş Başarili");
				break;
			}
			else {
				System.out.println("Giriş Başarısız");
				girisHakki--;
				System.out.println("Kalan Giriş Hakkı: "+girisHakki);
			}
			if(girisHakki==0) {
				System.out.println("Giriş Hakkınız Bitti...");
				return;// return yazmamızın sebebi methodu sonlandırmak
			}			
		}
		
		
		while(true) {
			
            System.out.println("******************************");
			String islemler="1.Bakiye Görüntüle\n"+"2.Para Yatirma\n"+"3.Para Cekme"+"Cikis icin q ya basin";
			System.out.println(islemler);
			System.out.println("***************************");
			System.err.println("İslem Seçin: ");
			String islem=scanner.nextLine();
			if(islem.equals("q")) {
				
				break;
				
			}
			else if(islem.equals("1")) {
				System.out.println("Mevcut Bakiye: "+hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("Lütfen Yatırmak İstediginiz Miktarı Girin");
				int miktar=scanner.nextInt();
				hesap.paraYatır(miktar);
			}
			else if(islem.equals("3")) {
				System.out.println("Lütfen Çekmek İstediginiz Mİktarı Girin: ");
				int miktar=scanner.nextInt();
				hesap.paraCek(miktar);
			}
			else {
				System.out.println("Geçersiz İşlem");
			}
		}
		
		
		
	}

}
