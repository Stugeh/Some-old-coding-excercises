import java.io.*;
import java.util.*;

public class Sanalista {

	private final String fileN;
	private final Scanner scanner;
	private List<String> sanat;
	BufferedReader reader = null;

	public Sanalista(String fileP) throws FileNotFoundException {
		this.fileN = fileP;
		this.scanner = new Scanner(new File(fileP));
		this.sanat = new ArrayList<>();
		toList();
		new Hirsipuu(sanat, 5);
	}

	public void toList() {

		while (scanner.hasNext()) {
			String sanaTemp = scanner.next();
			sanat.add(sanaTemp);
		}
		printList();
		new Hirsipuu(sanat, 5);
	}

	public List<String> annaSanat() {
		return sanat;
	}

	public void printList() {
		Iterator<String> iter = sanat.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public String getFileN() {
		return fileN;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
