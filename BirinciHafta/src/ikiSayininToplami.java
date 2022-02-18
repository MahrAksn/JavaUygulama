import java.util.Scanner;

public class ikiSayininToplami {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayiyi giriniz : ");
		int sayi1 = scan.nextInt();

		System.out.print("ikinci Sayiyi giriniz : ");
		int sayi2 = scan.nextInt();

		int toplam = (sayi1 + sayi2);
		System.out.println("");
		System.out.println( sayi1 + "+" + sayi2 +" = " + toplam );

	}

}
