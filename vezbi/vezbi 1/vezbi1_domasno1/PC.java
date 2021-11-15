package vezbi1_domasno1;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String disk;
	public String ssd;
	
	String golemina = "GB";
	
	public PC () {
		memorija = 2;
		tipNaMemorija = "DDR4";
		hardDisk = 160;
		disk = "HDD";
		ssd = "SSD M.2";
	}
	
	public void pecati(int zgolemiMemorija, int novSSDDisk) {
		System.out.println("Memorijata beshe " + memorija + golemina + ", a sega iznesuva " + (memorija + zgolemiMemorija) + golemina + ".");
		System.out.println("Tipot na memorijata e " + tipNaMemorija + ".");
		System.out.println("Noviot disk e " + ssd + " i ima golemina od " + novSSDDisk + golemina + ". Prethodno imavme " + disk + " so golemina od " + hardDisk + golemina + ".");
	}
}
