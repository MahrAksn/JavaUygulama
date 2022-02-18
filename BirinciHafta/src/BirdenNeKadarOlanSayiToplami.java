import java.util.Scanner;

public class BirdenNeKadarOlanSayiToplami {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi = scan.nextInt();
		int toplam=0;
		
		for(int i=1;i<=sayi;i++) {
			
			toplam+=i;
			System.out.println("Sayilar :" + i);
		}
		System.out.println("\t+______");
		System.out.println("Toplam :"+ " "+ toplam);
		
		System.out.println("**************");
		System.out.println("MAHÝR AKSÝN");
	}

}
