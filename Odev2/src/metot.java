
public class metot {

	public static void main(String[] args) {

		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut değildir");


		}

		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
 
		
	}
}
