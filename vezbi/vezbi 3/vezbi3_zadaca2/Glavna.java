package vezbi3_zadaca2;

public class Glavna {
	public static void main(String[] args) {
		KalkulatorZaDecimalniBroevi kzdb = new KalkulatorZaDecimalniBroevi();
		
		kzdb.x = 3.2;
		kzdb.y = 2.3;
		
		System.out.println("Razlikata iznesuva: " + kzdb.odzemanje(kzdb.x, kzdb.y));
		System.out.println("Sumata iznesuva: " + kzdb.sobiranje(kzdb.x, kzdb.y));
		System.out.println("Proizvodot iznesuva: " + kzdb.mnozenje(kzdb.x, kzdb.y));
		System.out.println("Kolichnikot iznesuva: " + kzdb.delenje(kzdb.x, kzdb.y));
		System.out.println("Ostatokot iznesuva: " + kzdb.ostatok(kzdb.x, kzdb.y));
		System.out.println("Stepenot iznesuva: " + kzdb.stepenuvanje(kzdb.x, kzdb.y));
	}
}
