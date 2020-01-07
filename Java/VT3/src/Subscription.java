
public class Subscription {

	private String lehden_nimi;
	private String tilaajan_nimi;
	private String toimitusosoite;
	private double kuukausihinta;
	
	
	public Subscription(final String tilaajaP, final String osoiteP, final String lehtiP, final double hintaP) {
		this.lehden_nimi = lehtiP;
		this.tilaajan_nimi = tilaajaP;
		this.toimitusosoite = osoiteP;
		this.kuukausihinta = hintaP;
	}


	
	public void printInvoice() {
		System.out.printf("Tilaajan nimi: " + tilaajan_nimi + "\nTilaajan osoite: " + toimitusosoite +
						  "\nLehden nimi: " + lehden_nimi + "\nKuukausihinta: " + kuukausihinta + " Euroa");		
	}
	
	public String getLehden_nimi() {
		return lehden_nimi;
	}


	public void setLehden_nimi(final String lehtiP) {
		this.lehden_nimi = lehtiP;
	}
	
	public String getTilaajan_nimi() {
		return tilaajan_nimi;
	}


	public void setTilaajan_nimi(final String tilaajaP) {
		this.tilaajan_nimi = tilaajaP;
	}


	public String getToimitusosoite() {
		return toimitusosoite;
	}


	public void setToimitusosoite(final String osoiteP) {
		this.toimitusosoite = osoiteP;
	}


	public double getKuukausihinta() {
		return kuukausihinta;
	}


	public void setKuukausihinta(final double hintaP) {
		this.kuukausihinta = hintaP;
	}


}
