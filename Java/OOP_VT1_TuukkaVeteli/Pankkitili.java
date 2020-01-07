public class Pankkitili {

	private String nimi;
	private String tilinumero;
	private double saldo;

	public Pankkitili(String nimi_par, String tilinumero_par, Double saldo_par) {
		this.nimi = nimi_par;
		this.tilinumero = tilinumero_par;
		this.saldo = saldo_par;
	}

	public void otto(Pankkitili tili, double summa) {
		if ( summa >= tili.getSaldo() || summa < 0) {
			System.out.println("\nVirheellinen summa!");
		}
		else {
			tili.setSaldo(tili.getSaldo() - summa);
		}

	}

	public void talletus(Pankkitili tili, double summa) {
		if ( summa >= tili.getSaldo() || summa < 0) {
			System.out.println("\nVirheellinen summa!");
		}
		else {
			tili.setSaldo(tili.getSaldo() + summa);
		}

		

	}

	// Set metodit
	public void setNimi(final String nimi_par) {
		this.nimi = nimi_par;
	}

	public void setTilinumero(final String tilinumero_par) {
		this.tilinumero = tilinumero_par;
	}

	public void setSaldo(final double saldo_par) {
		this.saldo = saldo_par;
	}

	// Get metodit
	public String getNimi() {
		return this.nimi;
	}

	public String getTilinumero() {
		return tilinumero;
	}

	public double getSaldo() {
		return saldo;
	}

	// tilitietojen tulostusmetodi
	@Override
	public String toString() {
		return "\nTilin omistaja: " + nimi + "\nTilinumerosi: " + this.tilinumero + "\nTilisi saldo: " + saldo;
	}


}
