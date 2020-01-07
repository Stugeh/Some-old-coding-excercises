
public class Rakennus {
	
	private double rala;
	private int huoneet;
	private int asukasmaar;
	
 
	//***********konstruktori********************
	public Rakennus ( final double rala_par , final int huoneet_par , final int asukasmaar_par  ) {
		
		this.rala = rala_par;
		this.huoneet = huoneet_par;
		this.asukasmaar = asukasmaar_par;
	}
	
	//**********setterit, getterit ja toString************
	public double getRala(){ return rala; }
	public int getHuone(){return this.huoneet;}
	public int getMaar(){ return this.asukasmaar; }
	
	public void setHuone( final int huoneet_par ){this.huoneet = huoneet_par;}
	public void setRala( final double rala_par ){ this.rala = rala_par; }
	
	
	public String toString(){
		return "\n\nRakennuksen pinta-ala: " + this.rala + "\nHuoneiden lukum‰‰r‰: " + this.huoneet + "\nAsukkaiden lukum‰‰r‰:"  + this.asukasmaar ;
	}
}
