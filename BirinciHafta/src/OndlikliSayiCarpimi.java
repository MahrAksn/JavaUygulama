import java.util.Scanner;

public class OndlikliSayiCarpimi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayiyi giriniz : ");
		double sayi1 = scan.nextDouble();

		System.out.print("ikinci Sayiyi giriniz : ");
		double sayi2 = scan.nextDouble();

		double carpim = (sayi1 * sayi2);
		System.out.println("");
		System.out.println( sayi1 + "*" + sayi2 +" = " + carpim );

	}

}
