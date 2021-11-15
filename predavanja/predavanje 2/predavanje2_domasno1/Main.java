package predavanje2_domasno1;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Bodan", "Talev", "INKI728");
		Ocenka o = new Ocenka("Matematika 1", "25/02/2021", 9);
		
		System.out.println(s);
		System.out.println(o);
		
		System.out.println("-----------------------");
		
		System.out.print("Ocenki: ");
		for(int i=0; i<s.ocenki.length; i++)
			System.out.print(s.ocenki[i] + ", ");
		//s.setOcenka(o);
		
		System.out.println("\nProsek: " + s.prosek());		
	}
}
