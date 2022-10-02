package asalSayi;

public class miniProje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 1;
		int kalan;
		boolean asalMi = true;
		
		if(sayi==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		
		if(sayi<1) {
			System.out.println("Geçersiz Sayı");
		}
		

		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				asalMi = false;
			}

		}
		if (asalMi) {
			System.out.println("Sayı Asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
