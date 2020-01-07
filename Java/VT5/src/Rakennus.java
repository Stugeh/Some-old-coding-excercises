import java.util.ArrayList;
import java.util.Iterator;

public class Rakennus {

	private double rala;
	private int huoneet;
	private int asukasmaar;
	private int asunnot;
	private String tyyp;
	private double asAla;
	static ArrayList<Rakennus> rakennuslista = new ArrayList<Rakennus>();
	static ArrayList<Rakennus> asuntolista = new ArrayList<Rakennus>();

	// omakotitalo
	public Rakennus(final String tyyp_par, final double rala_par, final int huoneet_par, final int asukasmaar_par,
			final int asunnot_par) {
		this.tyyp = tyyp_par;
		this.rala = rala_par;
		this.huoneet = huoneet_par;
		this.asukasmaar = asukasmaar_par;
		this.asunnot = asunnot_par;
	}

	// rivi- ja kerrostalot
	public Rakennus(final String tyyp_par, final int asunnot_par) {
		this.tyyp = tyyp_par;
		this.asunnot = asunnot_par;
	}

	// asunto
	public Rakennus(final double pintAla_p, final int huoneluku_p, final int asukasmaar_p) {
		this.asAla = pintAla_p;
		this.huoneet = huoneluku_p;
		this.asukasmaar = asukasmaar_p;
	}

	public static void addRakennus(Rakennus rak) {
		rakennuslista.add(rak);
	}

	public static void addAsunto(Rakennus asun) {
		asuntolista.add(asun);
	}

	public static void printRakennus() {

		Iterator<Rakennus> iterRak = rakennuslista.iterator();
		while (iterRak.hasNext()) {
			Rakennus rakTemp = iterRak.next();

			if (rakTemp.getTyyp() == "Omakotitalo") {
				System.out.println("\nRAKENNUKSEN TIEDOT:\nRakennuksen tyyppi: " + rakTemp.getTyyp()
						+ "\nRakennuksen pinta-ala: " + rakTemp.getRala() + "\nHuoneiden maara: " + rakTemp.getHuone()
						+ "\nAsukkaiden maara: " + rakTemp.getMaar() + "\n\n");
				Asukkaat.printAsukkaat(0);
			} else {
				System.out.println("\nRAKENNUKSEN TIEDOT:\nRakennuksen tyyppi: " + rakTemp.getTyyp()
						+ "\nAsuntojen maara: " + rakTemp.getAsunnot());
				printAsunto();
			}

		}
	}

	public static void printAsunto() {

		Iterator<Rakennus> iterAsun = asuntolista.iterator();
		int i = 1;

		while (iterAsun.hasNext()) {
			Rakennus asunTemp = iterAsun.next();
			System.out.println("\nASUNNON " + i + " TIEDOT:\nAsunnon pinta-ala: " + asunTemp.getAsAla()
					+ "\nHuoneiden maara: " + asunTemp.getHuone() + "\nAsukkaiden maara: " + asunTemp.getMaar() + "\n");
			Asukkaat.printAsukkaat(i - 1);
			i++;
		}
	}

	public double getRala() {
		return rala;
	}

	public int getHuone() {
		return this.huoneet;
	}

	public int getMaar() {
		return this.asukasmaar;
	}

	public String getTyyp() {
		return this.tyyp;
	}

	public int getAsunnot() {
		return this.asunnot;
	}

	public double getAsAla() {
		return asAla;
	}

	public void setHuone(final int huoneet_par) {
		this.huoneet = huoneet_par;
	}

	public void setRala(final double rala_par) {
		this.rala = rala_par;
	}

	public void setTyyp(String tyyp) {
		this.tyyp = tyyp;
	}

	public void setAsunnot(int asunnot) {
		this.asunnot = asunnot;
	}

	public void setAsAla(double asAla) {
		this.asAla = asAla;
	}

	@Override
	public String toString() {
		return "\n\nRAKENNUKSEN TIEDOT:\nRakennuksen pinta-ala: " + this.rala + "\nHuoneiden lukum‰‰r‰: " + this.huoneet
				+ "\nAsukkaiden lukum‰‰r‰:" + this.asukasmaar;
	}

}
