import java.util.Scanner;
import java.util.Locale;

public class H3T2_Main {
   
   static Scanner lukija = new Scanner(System.in).useLocale( new Locale("us", "US"));
   
   public static void main(String [] args ){
      int size;
      int max;
      int luku;
      boolean theEnd = false;
      String vastaus;
      
      System.out.print("Anna arvottavien lukujen lukumaara > ");
      size = lukija.nextInt();
      
      System.out.print("Anna arvottavien lukujen maksimiarvo > ");
      max = lukija.nextInt();
      lukija.nextLine(); //poistaa nextInt-metodin jättämän enterin painalluksen puskurista
      
      RandTable taulukko = new RandTable( size, max );
      
      do {
         
         luku = taulukko.nextNumber();
         
         if( luku > 0 ){
            System.out.println("Saatiin luku " + luku );
            System.out.print("Lisaa ? (k/e)");
            
            vastaus = lukija.nextLine();
            if( vastaus.charAt(0) == 'e' || vastaus.charAt(0)=='E')
               theEnd = true;
            
         }else {
            System.out.println("Kaikki luvut tulostettu");
         }
         
      }while( luku > 0 && !theEnd);
      
   }
}