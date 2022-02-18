import java.util.Scanner;

public class GirilenSayininCarpmaTablosu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi = scan.nextInt();
		System.out.println("");
		int carp=1;
		for (int i = 0; i <= 10; i++) {

			carp = (i * sayi);
			System.out.println(i + "*" + sayi + " = " + carp);
		}
		System.out.println("**************");
		System.out.println("MAHÝR AKSÝN");
	}

}
