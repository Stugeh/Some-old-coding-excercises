
public class RegularSubscription extends Subscription {

	
	private int kesto;
	private double total;

	public RegularSubscription(final String tilaajaP, final String osoiteP, final String lehtiP,final double hintaP , int kestoP) {
	super(tilaajaP, osoiteP, lehtiP, hintaP);
	this.kesto = kestoP;
	}

	public void printInvoice() {
		total = kesto * getHinta();
		super.printInvoice();
		System.out.printf("\nTilauksen kesto: " + kesto + " Kuukautta\nLoppusumma: " + total + " Euroa\n\n\n");
	}
	
	
	public int getKesto() {
		return kesto;
	}

	public void setKesto(final int kestoP) {
		this.kesto = kestoP;
	}

   public String getLehti(){
	   	return super.getLehden_nimi();
	}
	
	public void setLehti(final String lehtiP){
		super.setLehden_nimi(lehtiP);
	}
	
   public String getTilaaja(){
	   return super.getTilaajan_nimi();
	}
		
	public void setTilaaja(final String tilaajaP){
		super.setTilaajan_nimi(tilaajaP);
	}
	   	
	
   public String getOsoite(){
	   return super.getToimitusosoite();
	}
		
   public void setOsoite(final String osoiteP){
		super.setToimitusosoite(osoiteP);
	}
	 
   public double getHinta() {
	   return super.getKuukausihinta();
   }
   
   public void setHinta(final double hintaP){
		super.setKuukausihinta(hintaP);
	}

}
	
	
	
	
	


