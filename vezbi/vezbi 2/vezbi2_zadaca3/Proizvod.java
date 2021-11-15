package vezbi2_zadaca3;

public class Proizvod {
	private String imeNaProizvod;
	private String proizvoditel;
	private int cena;
	private int tezina;
	
	public Proizvod () {
		imeNaProizvod = "Stobi Flips";
		proizvoditel = "Vitaminka";
		cena = 10;
		tezina = 100;
	}
	
	public String getImeNaProizvod() {
		return imeNaProizvod;
	}
	public void setImeNaProizod(String imeNaProizvod) {
		this.imeNaProizvod=imeNaProizvod;
	}
	
	public String getProizvoditel() {
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel=proizvoditel;
	}
	
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena=cena;
	}
	
	public int getTezina() {
		return tezina;
	}
	public void setTezina(int tezina) {
		this.tezina=tezina;
	}
}
