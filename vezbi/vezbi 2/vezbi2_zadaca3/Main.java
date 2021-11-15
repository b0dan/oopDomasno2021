package vezbi2_zadaca3;

public class Main {
	public static void main(String[] args) {
		Proizvod p = new Proizvod();
		
		System.out.println("Proizvod: " + p.getImeNaProizvod() + ";");
		System.out.println("Proizvoditel: " + p.getProizvoditel() + ";");
		System.out.println("Cena: " + p.getCena() + " denari;");
		System.out.println("Tezina: " + p.getTezina() + "");
	}
}
