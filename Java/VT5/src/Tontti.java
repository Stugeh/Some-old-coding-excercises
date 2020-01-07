import java.util.ArrayList;
import java.util.Iterator;

public class Tontti {

	private String osoite;
	private String nimi;
	private double pala;
	static ArrayList<Tontti> tonttilista = new ArrayList<Tontti>();

	public Tontti(final String nimi_par, final String osoite_par, final double pala_par) {

		this.nimi = nimi_par;
		this.osoite = osoite_par;
		this.pala = pala_par;
	}

	public static void addTontti(Tontti tont) {
		tonttilista.add(tont);
	}

	public static void printTontti() {
		Iterator<Tontti> iterTont = tonttilista.iterator();
		while (iterTont.hasNext()) {
			Tontti tontTemp = iterTont.next();
			System.out.println("\n\nTONTIN TIEDOT:\nTontti: " + tontTemp.getNimi() + "\nOsoite:  "
					+ tontTemp.getOsoite() + "\nTontin pinta-ala: " + tontTemp.getPala() + "\n");
			Rakennus.printRakennus();
		}
	}

	
// *********************************
	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(final String osoite_par) {
		this.osoite = osoite_par;
	}

	public String getNimi() {
		return this.nimi;
	}

	public void setNimi(final String nimi_par) {
		this.nimi = nimi_par;
	}

	public double getPala() {
		return this.pala;
	}

	public void setPala(final double pala_par) {
		this.pala = pala_par;
	}

	@Override
	public String toString() {
		return "\n\nTONTIN TIEDOT:\nTontti: " + this.nimi + "\nOsoite:  " + this.osoite + "\nTontin pinta-ala: " + pala
				+ "\n";
	}

}
