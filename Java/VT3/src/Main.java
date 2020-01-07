
import java.util.Scanner;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
		
	static String lehti;
	static String tilaaja;
	static String osoite;
	static double hinta;
	static int alennus;
	static int kesto;
	static int maxAttempts = 50;
	static boolean success = false;
	
	public static void main(String[] args) {
				
		while (success == false) {
			try {
			    
				System.out.println("!!!NORMAALI TILAUS!!!\n\n");
								
				System.out.print("Tilaajan nimi > \n");
				tilaaja = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Tilaajan osoite > \n");
				osoite = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Lehden nimi > \n");
				lehti = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Tilauksen kesto kuukausina > \n");
				kesto = sc.nextInt();
				sc.nextLine();	
				
				System.out.print("Tilauksen kuukausihinta > \n");
				hinta = sc.nextDouble();
				sc.nextLine();
				success = true;
				
			} catch (Exception e) {
				success=false;
				System.out.println("\n\n!!!!!!Virheellinen syöte!!!!!!!!\n\n");
			}
		}
				RegularSubscription normaalitilaus = new RegularSubscription(tilaaja, osoite,lehti,hinta,kesto);
				
				System.out.print("\n\n************************************Normaalitilauksen kuitti************************************\n\n");
				printSubscriptionInvoice(normaalitilaus);
				
				success = false;
			
				
				
				System.out.print("!!!KESTOTILAUS!!!\n\n");
		
		while (success == false) {
			try {
				kesto = 12;
				alennus = 20;
				
				System.out.print("Tilaajan nimi > \n");
				tilaaja = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Tilaajan osoite > \n");
				osoite = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Lehden nimi > \n");
				lehti = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Tilauksen kuukausihinta > \n");
				hinta = sc.nextDouble();
				sc.nextLine();
				success=true;
				
			} catch (Exception e) {
				success=false;
				System.out.println("\n\n!!!!!!Virheellinen syöte!!!!!!!!\n\n");
			  }
		}
			
				StandingSubscription kestotilaus = new StandingSubscription (tilaaja, osoite,lehti,hinta,alennus);
				
				System.out.println("\n\n************************************Kestotilauksen kuitti************************************\n\n");
				printSubscriptionInvoice(kestotilaus);
				
	}
		
			
	
			
	public static void printSubscriptionInvoice(Subscription subs){
            subs.printInvoice();        
        	System.out.println("\n\n");
	}

	
	
}


