
public class Property {
	private String tyyppi;
	private String paikka;
	
	
	
	public Property(String tyyppiP, String paikkaP) {
		this.paikka = paikkaP;
		this.tyyppi = tyyppiP;
	}


	public Property(Property kiintP) {
      this.tyyppi = kiintP.getTyyppi();
      this.paikka = kiintP.getPaikka();
    }


	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getPaikka() {
		return paikka;
	}

	public void setPaikka(String paikka) {
		this.paikka = paikka;
	}



	
}
