package vezbi2_zadaca1;

public class Main {
	public static void main(String[] args) {
		Covek c = new Covek();
		
		c.setIme("Petko");
		c.setPrezime("Petkovski");
		c.setEMBG("2302000410721");
		
		System.out.println(c.getIme() + " " + c.getPrezime() + " - " + c.getEMBG());
	}
}
