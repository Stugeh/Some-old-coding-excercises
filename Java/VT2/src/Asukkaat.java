
public class Asukkaat {

	private String nimi;
	private String saika;
	
		//***********konstruktori********************
		public Asukkaat(final String nimi_par, final String saika_par) {
			this.nimi = nimi_par;
			this.saika = saika_par;		
		}
	
		
		//**********setterit, getterit ja toString************
		public String getSaika(){ return saika; }
		public String getNimi(){ return nimi; }
	
		public void setAsNimi(String nimi){ this.nimi = nimi; }
		public void setSaika(String saika){ this.saika = saika; }
		
		public String toString(){
			return "\n\nNimi: " + this.nimi + "\nSyntymäaika:  " + this.saika;
		}
}
