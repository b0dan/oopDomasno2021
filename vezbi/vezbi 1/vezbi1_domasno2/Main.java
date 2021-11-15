package vezbi1_domasno2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Brojach br = new Brojach();
		
		String[] parichka= {"pismo", "glava"};
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		
		Random r = new Random();
		for (int i = 1; i <= n; i++) {
			int ishod = r.nextInt(parichka.length);
			System.out.println(i + ": " + parichka[ishod]);
			br.zgolemiBrojach(ishod);
		}
		
		System.out.println();
		System.out.println("Pismo: " + br.kP);
		System.out.println("Glava: " + br.kG);
	}
}
