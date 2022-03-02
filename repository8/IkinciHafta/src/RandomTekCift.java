import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTekCift {

	public static void main(String[] args) {

		Random rnd = new Random();

		int sayilar = rnd.nextInt(10) * 10;

		for (int i = 0; i < sayilar; i++) {

			if (i % 2 == 0) {
				System.out.println("Sayiniz çift sayidir.");
				
				
			} else {
				System.out.println("Sayiniz tek sayidir.");

			}
			System.out.println(i);
			
			
		}

	}

}
