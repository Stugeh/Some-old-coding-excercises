import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static int j=0;

	public static void main(String[] args) {
		
	Tontti [] tontit = new Tontti[1];
	    readtontti( tontit );
	    
	    Rakennus [] rakennukset = new Rakennus[1];
	    readrakennus( rakennukset );

		Asukkaat [] asukkaat = new Asukkaat[j];
	   	j=0;
  	
	  int maxAttempts = 50;
	  for (int count = 0; count < maxAttempts; count++) { 	             //try-catch loop inputMismatchin varalle()
	   try {                                                          
		readasukkaat( asukkaat );
		break;
	   	}
	   catch (Exception e) {
		   System.out.println("virheellinen syöte yritä uudelleen");   
	   }
	  }
	   	printTontit( tontit );
	   	printRakennukset( rakennukset );
	   	printAsukkaat( asukkaat );
	  
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
					
					tontt [0] = new Tontti(leve , pitu , nim , ala );
					break;
            } 
            catch (Exception e) {
                System.out.println("virheellinen syöte yritä uudelleen");
            }  
		}
	}
	
					
	public static void  readrakennus( Rakennus [] raken) {
		
		double rala1;
		int huoneluku;
		int asukasluku;
		int maxAttempts = 50;
		
		
	for (int count = 0; count < maxAttempts; count++) {
            try {		
				System.out.println ("Anna rakennuksen pinta-ala > ");
				rala1 = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Montako huonetta rakennuksessa on? > ");
				huoneluku = sc.nextInt();
				sc.nextLine();
				
				System.out.println ("Montako asukasta talossa on? > ");
				asukasluku = sc.nextInt();
				j = asukasluku;
				sc.nextLine();
				
				raken [0] = new Rakennus(rala1, huoneluku, asukasluku );
				break;
            } 
            catch (Exception e) {
                System.out.println("virheellinen syöte yritä uudelleen");
            }
		}	
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










