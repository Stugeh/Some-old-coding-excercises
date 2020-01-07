import java.io.FileNotFoundException;
import java.util.*;;

public class VT6Main {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {

		String filename;

		// System.out.println("Syota tiedoston nimi: ");
		// filename = sc.nextLine();
		filename = "testi.txt";
		new Sanalista(filename);
		String prog = Hirsipuu.display();
		
		while( ! Hirsipuu.onLoppu(prog) ) {		
			arvausprompt();
			prog = Hirsipuu.display();
			Hirsipuu.printProgress(prog);
			
		}
	}

	public static void arvausprompt() {
		System.out.println("Syota kirjain: ");
		Hirsipuu arvaus = new Hirsipuu(sc.next().charAt(0));
		sc.nextLine();
		arvaus.arvaa(arvaus.getArvaus());

	}

}
