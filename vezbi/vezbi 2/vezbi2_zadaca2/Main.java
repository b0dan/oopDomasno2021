package vezbi2_zadaca2;

public class Main {
	public static void main(String[] args) {
		Restoran r = new Restoran();
		
		r.setImeNaRestoran("Kapri");
		r.setLokacija("MK, 11-ta Makedonska Divizija 1, Bitola 7000");
		r.setTelefon("047/256-500");
		r.setBrojNaSedista(100);
		
		System.out.println("Restoran: " + r.getImeNaRestoran() + ";");
		System.out.println("Lokacija: " + r.getLokacija() + ";");
		System.out.println("Telefon: " + r.getTelefon() + ";");
		System.out.println("Broj na sedista: " + r.getBrojNaSedista() + ".");
	}
}
