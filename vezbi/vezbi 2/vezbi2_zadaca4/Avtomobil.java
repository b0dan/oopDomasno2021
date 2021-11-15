package vezbi2_zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private String boja;
	private int kilometri;
	
	public Avtomobil (String marka, String model, String boja, int kilometri) {
		this.marka=marka;
		this.model=model;
		this.boja=boja;
		this.kilometri=kilometri;
	}
	
	public int zgolemiKilometri(int pomnoziKm) {
		int km = kilometri * pomnoziKm;
		return km;
	}
	
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public String getBoja() {
		return boja;
	}
	public int getKilometri() {
		return kilometri;
	}
}
