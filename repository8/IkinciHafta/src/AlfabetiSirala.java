import java.util.Arrays;
import java.util.Scanner;

public class AlfabetiSirala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("I.Kelimeyi gir : ");
		String N=scan.nextLine();
		System.out.print("II.Kelimeyi gir : ");
		String N1=scan.nextLine();
		System.out.print("III.Kelimeyi gir : ");
		String N2=scan.nextLine();
		System.out.print("VI.Kelimeyi gir : ");
		String N3=scan.nextLine();
		
		String[] isimler = {N,N1,N2,N3};
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	}

}
