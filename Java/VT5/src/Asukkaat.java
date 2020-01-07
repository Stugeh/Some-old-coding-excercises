import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Asukkaat {

	private String nimi;
	static List<List<String>> listalista = new ArrayList<>();

	public static List<String> addAsukaslista() {

		List<String> asukaslista = new ArrayList<>();
		return asukaslista;
	}

	public static void printAsukkaat(int i) {

		System.out.println("ASUKKAAT:");
		Iterator<List<String>> iterLista = listalista.listIterator(i);

		Iterator<String> iterAsuk = iterLista.next().listIterator();

		while (iterAsuk.hasNext()) {
			String temp = iterAsuk.next();
			System.out.println(temp);
		}
		System.out.println("\n***************************************");
	}

	// *******************************************

	public String getNimi() {
		return nimi;
	}

	public void setAsNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "\nNimi: " + this.nimi;
	}

}
