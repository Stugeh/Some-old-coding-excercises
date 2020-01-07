
public class StandingSubscription extends Subscription {
	
	private int ale;
	private double aleker;
	private double kkHintaAle;
	private double total;
	private double x;
	
	public StandingSubscription(final String tilaajaP, final String osoiteP, final String lehtiP,final double hintaP , int aleP) {

			super(tilaajaP, osoiteP, lehtiP, hintaP);
			this.ale =aleP;
	}
	  
	public void printInvoice() {
		x= 100-ale;
		aleker = x * 0.01;
		kkHintaAle = aleker * getHinta();
		total = kkHintaAle * 12;
		super.printInvoice();
		System.out.println("\nAlennus: " + ale  + "%\nAlennettu kuukausihinta: " + kkHintaAle + " Euroa\nTilauksen kesto: 12 kuukautta" 
		+ "\nLoppusumma: " + total + " Euroa\n\n\n");
	}
	
	public int getAle() {
		return ale;
	}

	public void setAle(int ale) {
		this.ale = ale;
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

















