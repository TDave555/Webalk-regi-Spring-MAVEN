package hu.me.iit.webalk.fourth.Impl;

public class AutoKerek implements hu.me.iit.webalk.fourth.Kerek {
	private final String tipus;
	private final int szelesseg;
	private final int atmero;
	private final int kopenyMagassag;
	
	public AutoKerek(String tipus, int szelesseg, int atmero, int kopenyMagassag) {
		this.tipus = tipus;
		this.szelesseg = szelesseg;
		this.atmero = atmero;
		this.kopenyMagassag = kopenyMagassag;
	}
	
	public AutoKerek() {
		this.tipus = "noname";
		this.szelesseg = 190;
		this.atmero = 15;
		this.kopenyMagassag = 90;
	}

	@Override
	public String toString() {
		return String.format("Kerék típusa: "+tipus+", adatai: "+szelesseg+
				"/"+atmero+" R "+ kopenyMagassag);
	}
	
}
