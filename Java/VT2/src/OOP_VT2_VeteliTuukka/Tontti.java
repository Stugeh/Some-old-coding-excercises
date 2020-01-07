public class Tontti {

	private double leveys;
	private double pituus;
	private String nimi;
	private double pala;
 
	//***********konstruktori********************
	public Tontti ( final double leveys_par , final double pituus_par , final String nimi_par ,  final double pala_par ) {
		
		this.leveys = leveys_par;
		this.pituus = pituus_par;
		this.nimi = nimi_par;
		this.pala = pala_par;			
	}

	
	//**********setterit, getterit ja toString************
	
	public double getLeveys()     { return leveys; }
	public void setLeveys( final double leveys_par )     { this.leveys = leveys_par; }
	
	public double getPituus()     {return this.pituus;}
	public void setPituus( final double pituus_par )     {this.pituus = pituus_par;}

	public String getNimi()     { return this.nimi; }
	public void setNimi(final String nimi_par)     { this.nimi = nimi_par; }

	public double getPala()     { return this.pala; }
	public void setPala( final double pala_par )     { this.pala = pala_par; }

	public String toString(){
		return "\nTontti: " + this.nimi + "\nTontin pinta-ala: " + pala + "\nKoordinaatit:"  + this.leveys + "'N" + this.pituus + "'E";
	}
	
	
	
	
}
