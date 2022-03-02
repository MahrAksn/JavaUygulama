import java.util.Scanner;

public class SayilariListele {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int N=scan.nextInt();
		
	    for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
	}

}
