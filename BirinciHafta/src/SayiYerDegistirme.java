import java.util.Scanner;

public class SayiYerDegistirme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayiyi giriniz : ");
		int sayi1 = scan.nextInt();

		System.out.print("ikinci Sayiyi giriniz : ");
		int sayi2 = scan.nextInt();

		if (sayi1 != sayi2) {
			System.out.println("*******************");
			System.out.println("Degisimden sonra");
			System.out.println("***************");

			System.out.println("Birinci Sayi :" + sayi2);
			System.out.println("ikinci Sayi :" + sayi1);

		} else {
			System.out.println("*******************");
			System.out.println("Sayilar Esit oldugu icin degisimi göremezsiniz KODLUYORUZ ekibi!!!");
		}
	}

}
