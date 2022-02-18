import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi = scan.nextInt();
		System.out.println(" ");

		int toplam = 0, temp=0 ;
		temp = sayi;
		System.out.println("Sayinin basamaklari :\n" + temp);
		while (temp != 0) {
			
			toplam = (temp % 10) + toplam;
			temp /= 10;
			System.out.println(temp + ",");
		}
		System.out.println(" ");
		System.out.println("Basamak Toplami :" + toplam);
		 
		System.out.println("**************");
		System.out.println("MAHÝR AKSÝN");

	}

}
