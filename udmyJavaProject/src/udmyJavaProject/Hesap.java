package udmyJavaProject;

public class Hesap {
	private String kullanciAdi;
	private String parola;
	private int bakiye;
	
	
	public Hesap(String kullanciAdi,String parola,int bakiye) {
		this.setKullanciAdi(kullanciAdi);
		this.setParola(parola);
		this.setBakiye(bakiye);
	}


	public int getBakiye() {
		return bakiye;
	}


	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


	public String getKullanciAdi() {
		return kullanciAdi;
	}


	public void setKullanciAdi(String kullanciAdi) {
		this.kullanciAdi = kullanciAdi;
	}
	
	
	public void paraYatır(int tutar) {
		bakiye+=tutar;
		System.out.println("Yeni Bakiyeniz: "+bakiye);
	}
	public void paraCek(int tutar) {
		if((bakiye-tutar)<0) {
			System.out.println("Yetersiz Bakiye");
		}
		else {
			bakiye-=tutar;
			System.out.println("Yeni Bakiye: "+bakiye);
		}
	}

}
