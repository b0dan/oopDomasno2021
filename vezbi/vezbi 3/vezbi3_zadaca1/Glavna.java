package vezbi3_zadaca1;

public class Glavna {
	public static void main(String[] args) {
		KalkulatorZaCeliBroevi kzcb = new KalkulatorZaCeliBroevi();
		
		kzcb.x = 3;
		kzcb.y = 2;
		
		System.out.println("Razlikata iznesuva: " + kzcb.odzemanje(kzcb.x, kzcb.y));
		System.out.println("Sumata iznesuva: " + kzcb.sobiranje(kzcb.x, kzcb.y));
		System.out.println("Proizvodot iznesuva: " + kzcb.mnozenje(kzcb.x, kzcb.y));
		System.out.println("Kolichnikot iznesuva: " + kzcb.delenje(kzcb.x, kzcb.y));
		System.out.println("Ostatokot iznesuva: " + kzcb.ostatok(kzcb.x, kzcb.y));
		System.out.println("Stepenot iznesuva: " + kzcb.stepenuvanje(kzcb.x, kzcb.y));
	}
}
