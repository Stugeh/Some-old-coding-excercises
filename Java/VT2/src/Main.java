import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static int j=0;
static int n=0;
static int maxAttempts = 50;
private static Rakennus[] raken;

	public static void main(String[] args) {
		int tmaar;
			
		System.out.println("kuinka monta tonttia? >");
	    tmaar = sc.nextInt();
	    
	    for (int count=0; count < tmaar; count++) {	    
	    	readtontti(null);
	    	readtyyppi();
	    	Asukkaat [] asukkaat = new Asukkaat[j];
	    	j=0;
	    	readasukkaat( asukkaat );
	   }
	}

	
	
//**************************skannerit********************

	
	
	public static void readtontti( Tontti [] tontt){ 
		
		double leve;
		double pitu;
		String nim;
		double ala;
		int maxAttempts = 50;
		
		for (int count = 0; count < maxAttempts; count++) {
            try {		
			        System.out.println("Anna tontin nimi > ");
					nim = sc.nextLine();
					sc.nextLine();
					
					System.out.println ("Anna tontin leveys koordinaatti > ");
					leve = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Anna tontin pituus koordinaatti > ");
					pitu = sc.nextDouble();
					sc.nextLine();
					
					System.out.println ("Anna tontin pinta-ala > ");
					ala = sc.nextDouble();
					sc.nextLine();
					
					tontt [n] = new Tontti(leve , pitu , nim , ala );
					n++;
				
            } 
            catch (Exception e) {
                System.out.println("virheellinen syöte yritä uudelleen");
            }  
		}
	}

	

	
	public static void readtyyppi() {
		
		int maxAttempts = 50;
		int tyyppi;
		
		for (int count = 0; count < maxAttempts; count++) {
            try {		
            	System.out.println ("Anna rakennuksen tyyppi n/1:omakotitalo n/2:rivitalo n/3:kerrostalo> ");
				tyyppi = sc.nextInt();
				sc.nextLine();
				
				if (  tyyppi==1 ) {
					omakotitalo();
				}
				else {
					muutalo();
				}
            }
            catch (Exception e) {
                System.out.println("virheellinen syöte yritä uudelleen");
            }
        }
	}		
	 

	
	
	public static void omakotitalo() {
				
		double rala1;
		int huoneluku;
		int asukasluku;
		String type;
		
		type="omakotitalo";
		System.out.println ( "Anna rakennuksen pinta-ala > n/" );
	    rala1 = sc.nextDouble();
		sc.nextLine();
		System.out.println( "Montako huonetta rakennuksessa on? > n/" );
		huoneluku = sc.nextInt();
		sc.nextLine();
		System.out.println ( "Montako asukasta talossa on? > n/n/" );
		asukasluku = sc.nextInt();
		j = asukasluku;
		sc.nextLine();
		raken [n] = new Rakennus( type , rala1 , huoneluku , asukasluku );		       
		}
	

	
	
	public static void muutalo() {
		
		boolean works = false;
		int x;
		String type;
		double rala1;
		int huoneluku;
		int asukasluku;
		
		do {			
			System.out.println("1:rivitalo n/2:kerrostalo n/n/");
			x = sc.nextInt();
				
			if ( x>0 && x<3 ) {
				switch(x) {
					case 1: type = "rivitalo";
							works = true;
					case 2: type = "kerrostalo";
							works = true;
					break;
				}
			}
			else {			
				System.out.println("Virheellinen syöte yritä uudelleen n/");
				sc.nextLine();				
			}	
		} 
		while (works == false);
		
		System.out.println("Syötä asuntojen määrä > /n");
		rala1 = sc.nextDouble();
		System.out.println("Syötä rakennuksen pinta-ala > /n");
		rala1 = sc.nextDouble();
		System.out.println("Syötä rakennuksen pinta-ala > /n");
		rala1 = sc.nextDouble();
	
	
	
	}



	

	
	
	public static void readasukkaat( Asukkaat [] asukkaat ){
	    
	    for(int i=0; i < asukkaat.length; i++){
	    	asukkaat[i] = readasukas();	    	
	    }
	}
	


	
	public static Asukkaat readasukas() {
				
		String nimi;		
		String saika;		
		
			System.out.println ("Syötä asukkaan nimi > ");
			nimi = sc.nextLine();
				
			System.out.println("Syötä asukkaan syntymäaika > ");
			saika = sc.nextLine();
			sc.nextLine();
								
			Asukkaat asukas = new Asukkaat (nimi,saika);
			return asukas;		
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//***************print metodit******************
	
	public static void printAsukkaat( Asukkaat [] asukkaat ){
		      
		System.out.println("Asukkaiden tiedot:\n");
		for(int i=0; i < asukkaat.length; i++) { printAsukas(asukkaat[i]); }
	}
		
	public static void printAsukas(final Asukkaat as){
	      System.out.println( "Asukkaan nimi: " + as.getNimi() + "\nsyntyma aika: " + as.getSaika() + "\n"  );		
	}
	
	
	
	public static void printTontit( Tontti [] tontit ){
		printTontti(tontit[0]); 
	}
	
	public static void printTontti(final Tontti ton) {
		System.out.println( "Tontin nimi: " + ton.getNimi() + "\nTontin koordinaatit: " + ton.getLeveys() + "'N " +
				ton.getPituus() + "'E \nTontin pinta-ala: " + ton.getPala() );
	}	
	
		
	
	public static void printRakennukset( Rakennus [] rakennukset ){
		printRakennus(rakennukset[0]);
	}
	
	public static void printRakennus(final Rakennus rak) {
		System.out.println("\n\nRakennuksen pinta-ala: " + rak.getRala() + "\nHuoneiden lukumäärä: " + rak.getHuone() 
		+ "\nAsukkaiden lukumäärä: " + rak.getMaar() + "\n\n");		
	}
}	










