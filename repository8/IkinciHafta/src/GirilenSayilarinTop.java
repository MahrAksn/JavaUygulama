import java.util.Scanner;

public class GirilenSayilarinTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Toplanacak Sayý Adediði Girin");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Giridiðiniz sayý " + n);
		for (int i = 0; i < n; i++) {
			System.out.println("Sayý:  " + (i + 1) + ":");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("Toplam Sayý " + n + " Sayýlarýn Toplamý =" + sum);
	}

}
