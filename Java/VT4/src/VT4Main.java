import java.util.InputMismatchException;
import java.util.Scanner;



public class VT4Main {

	
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		InsInfContainer container = new InsInfContainer();
		Property prop;
		InsuranceInfo info;		
		int valinta;
		double max,min;
		
		do {
			valinta = valikko();
				
			switch ( valinta ){
				case 1:
					prop = readProperty();
					info = readInsInf(prop);
					containerAdd(info,container);
				   break;
				   
				case 2:
					container.printAll();
				   break;
				   
				case 3:
				    System.out.println("\n\nAnna Maksimi vakuutusarvo");
				    max = readDouble(); 
				    container.printLess(max);
				   break;
				
				case 4:
				    System.out.println("\n\nAnna Minimi vakuutusarvo");
				    min = readDouble();
				    container.printMore(min);
				   break;
				  
				case 0:
				   System.out.print("Ohjelman suoritus paattyy.");
				   break;
				   
				default:
				   System.out.print("Vaara valinta. Yrita uudelleen.");
			}	
		}while ( valinta != 0);
		
	}		
	

	
	public static int valikko() {

      System.out.println("\n\n 1) Lisaa Kiinteisto");
      System.out.println(" 2) Tulosta lista kiinteistoista");
      System.out.println(" 3) Tulosta lista vakuutusarvoltaan pienemmista kuin x");
      System.out.println(" 4) Tulosta lista vakuutusarvoltaan suuremmista kuin x");
      System.out.println(" 0) Lopeta");
      System.out.print("\nValintasi > ");
      
      return readInt();			
	}

	
	
	public static Property readProperty() {
		String type;
		String location;
		
		System.out.println("Anna tontin tyyppi > ");
		type = sc.nextLine();
		
		System.out.println("Anna tontin sijainti  > ");
		location = sc.nextLine();
		
		return new Property(type,location);
	}

	
	
	public static InsuranceInfo readInsInf(Property kiinteisto) {
		double arvo;	
		System.out.println("Anna kiinteistön vakuutusarvo  > ");
		arvo = sc.nextDouble();
		
		
		return new InsuranceInfo (kiinteisto,arvo);
	}

	
		
	public static void containerAdd(InsuranceInfo info,InsInfContainer container) {
		container.addInfo(info);		
	}
	
   
	
	public static int readInt(){
      boolean ok = false;
      int luku = 0;
		      
      do {
		         
         try {
            luku = sc.nextInt();
            sc.nextLine();
            ok = true;
         }catch( InputMismatchException ime ){
            sc.nextLine();
            System.out.print("Virhe, yrita uudelleen > ");
         }
		         
      }while(!ok);
     
      return luku;
      
   }
  
	
	
    public static int readDouble(){
	      boolean ok = false;
	      int luku = 0;
			      
	      do {
			         
	         try {
	            luku = sc.nextInt();
	            sc.nextLine();
	            ok = true;
	         }catch( InputMismatchException ime ){
	            sc.nextLine();
	            System.out.print("Virhe, yrita uudelleen > ");
	         }
			         
	      }while(!ok);
	     
	      return luku;
	      
	   }
   
}
	
	

