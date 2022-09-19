
public class arraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";

		
		for(int i=0; i<4; i++) {
			System.out.println(ogrenciler[i]);
		}
			
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
	}

}
