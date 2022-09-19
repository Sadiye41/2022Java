package arkadasSayilar;

public class arkadasSayilar {

	public static void main(String[] args) {
		
		int sayi1=222;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1%i==0) {
				toplam1= i+toplam1;
			}
		}
		
		for(int i=1; i< sayi2; i++) {
			if(sayi2%i==0) {
				toplam2= i+toplam2;
		}

		
	}
		if(sayi1==toplam2) {
			if(sayi2==toplam1) {
				System.out.println("Arkadaş sayılardır");
			}
		}
		else {
			System.out.println("Arkadaş sayı değillerdir.");
		}
	
	}
}
