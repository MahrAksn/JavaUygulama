import java.util.Scanner;

public class SesliHarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Metin gir : ");
		String metin = scan.nextLine();
		int sonuc = sesliSay(metin);
        System.out.println(sonuc);
		
	}
	public static int sesliSay(String str) {
        String sesli = "aeıioöuü";
        if (str.equals("")) {
            return 0;
        } else if (sesli.indexOf(str.charAt(0)) > -1) {
            return 1 + sesliSay(str.substring(1));
        } else {
            return 0 + sesliSay(str.substring(1));
        }
    }
}
