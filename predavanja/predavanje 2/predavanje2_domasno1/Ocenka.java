package predavanje2_domasno1;

public class Ocenka {
	private String predmet;
	private String datum;
	private int ocenka;
	
	public Ocenka(String predmet, String datum, int ocenka) {
		this.predmet=predmet;
		this.datum=datum;
		this.ocenka=ocenka;
	}
	
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet=predmet;
	}
	
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum=datum;
	}
	
	public int getOcenka() {
		return ocenka;
	}
	public void setOcenka(int ocenka) {
		this.ocenka=ocenka;
	}	
	
	public String toString() {
		String sO = "Predmet: " + predmet + "\nDatum: " + datum + "\nOcenka: " + ocenka;
		return sO;
	}
}
