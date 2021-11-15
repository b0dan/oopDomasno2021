package vezbi2_zadaca4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Avtomobil a = new Avtomobil("Ford", "Fiesta", "Metalik", 200000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("pomnoziKm=");
		int pomnoziKm = sc.nextInt();
		
		System.out.println();
		System.out.println(a.getMarka() + " " + a.getModel() + " " + a.getBoja() + " " + a.getKilometri());
		System.out.println(a.zgolemiKilometri(pomnoziKm));
	}
}
