package mukemmelSayi;

import java.util.Iterator;

public class MukemmelSayi {

	public static void main(String[] args) {

		int number = 27;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = i + total;
			}

		}
		if (total == number) {
			System.out.println("Mükemmel Sayi");
		} else {
			System.out.println("Mükemmel Sayı Değil");

		}

	}

}
