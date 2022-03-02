import java.util.Scanner;

public class MetniSayiKadarYaz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Metin giriniz : ");
		String metin = scan.nextLine();
		System.out.print("Sayi giriniz : ");
		int N = scan.nextInt();

		while (N>0) {
			System.out.println(metin);
			N--;
		}			
	}

}
