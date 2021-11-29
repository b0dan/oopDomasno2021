package vezbi3_zadaca1;

public class KalkulatorZaCeliBroevi implements IMatematickiOperaciiVrzCeliBroevi {
	public int x;
	public int y;
	
	@Override
	public int odzemanje(int x, int y) {
		int odzemanje;
		odzemanje = x - y;
		return odzemanje;
	}
	
	@Override
	public long sobiranje(int x, int y) {
		long sobiranje;
		sobiranje = x + y;
		return sobiranje;
	}
	
	@Override
	public long mnozenje(int x, int y) {
		long mnozenje; 
		mnozenje = x * y;
		return mnozenje;
	}
	
	@Override
	public long delenje(int x, int y) {
		long delenje;
		delenje = x / y;
		return delenje;
	}
	
	@Override
	public int ostatok(int x, int y) {
		int ostatok;
		ostatok = x % y;
		return ostatok;
	}
	
	@Override
	public long stepenuvanje(int x, int y) {
		long stepenuvanje;
		stepenuvanje = (int)Math.pow(x, y);
		return stepenuvanje;
	}
}
