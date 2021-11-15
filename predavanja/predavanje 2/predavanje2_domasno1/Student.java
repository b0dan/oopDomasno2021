package predavanje2_domasno1;

public class Student extends Covek {
	int[] ocenki = {6, 6, 7, 7};
	private String indeks;
	
	public Student(String ime, String prezime, String indeks) {
		super(ime, prezime);
		this.indeks=indeks;
	}
	
	public String getIndeks() {
		return indeks;
	}
	public void setIndeks(String indeks) {
		this.indeks=indeks;
	}
	
	public void setOcenka(Ocenka o) {
		ocenki[4] = o.getOcenka();
	}
	
	public float prosek() {
		float  p;
		
		int s=0;
		for(int i=0; i<ocenki.length; i++)
			s = s + ocenki[i];
		
		p = (float) s / (ocenki.length);
		return p;
	}
	
	public String toString() {
		String sS = "Ime: " + getIme() + " " + getPrezime() + "\nIndeks: " + indeks;
		return sS;
	}
}
