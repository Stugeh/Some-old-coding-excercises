
public class InsuranceInfo {

	private Property kiinteisto;

	private double vakuutusarvo;
	
    public InsuranceInfo(final Property kiinteistoP,final double vakuusP) {
    	kiinteisto = new Property(kiinteistoP);
    	this.vakuutusarvo = vakuusP;
    	
    }
	
	public void printInsInf() {
		System.out.printf(kiinteisto.getTyyppi() +  "   "  + kiinteisto.getPaikka() + "      " + getVakuutusarvo());
	}

	
	public Property getKiinteisto() {
		return kiinteisto;
	}

	public void setKiinteisto(Property kiinteisto) {
		this.kiinteisto = kiinteisto;
	}

	public double getVakuutusarvo() {
		return vakuutusarvo;
	}

	public void setVakuutusarvo(double vakuutusarvo) {
		this.vakuutusarvo = vakuutusarvo;
	}
	
	
	public String toString(){
	      return "Tyyppi: " + kiinteisto.getTyyppi() + "  Paikka: " + kiinteisto.getPaikka() + "  Vakuutusarvo:  " + this.vakuutusarvo + "  ";
	   }
	
	
	

	
	
}
