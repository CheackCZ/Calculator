package Kalkulacka;

public class Kalkulacka {

	private int cislo;
	private int cislo1;
	
	public Kalkulacka(int cislo, int cislo1) {
		this.cislo = cislo;
		this.cislo1 = cislo1;
	}
	
	public int Soucet() {
		return cislo * cislo1;
	}
	
	public int Rozdil() {
		return cislo - cislo1;
	}
	
	public int Soucin() {
		return cislo * cislo1;
	}
	
	public int Deleni() {
		return cislo / cislo1;
	}
	
	
}
