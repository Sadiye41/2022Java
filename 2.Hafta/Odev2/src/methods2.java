
public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj = "bugün hava çok güze";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayi= topla(5,7);
		System.out.println(sayi);
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println(toplam);

	} 

	public static void ekle() {
		System.out.println("eklendi");

	}



	public static void sil() {
		System.out.println("eklendi");

	}

	public static void güncelle() {
		System.out.println("eklendi");

	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	

}
