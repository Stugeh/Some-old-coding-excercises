import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hirsipuu {

	private List<String> sanat;
	private Random rnGen;
	private static String theSana;
	private static int maxVaarin;
	private ArrayList<Character> arvaukset = new ArrayList<>();
	private static ArrayList<Character> oikein = new ArrayList<>();
	private char arvaus;

	public Hirsipuu(List<String> sanatP, int maxVaarinP) {
		Hirsipuu.maxVaarin = maxVaarinP;
		rnGen = new Random();
		int i = rnGen.nextInt(sanatP.size());
		this.setTheSana(sanatP.get(i));
		// System.out.println("theSana: "+theSana);
	}

	public Hirsipuu(char arvausP) {
		this.setArvaus(arvausP);
	}

	public boolean arvaa(char arvaus) {

		if (!Character.isLetter(arvaus)) {
			throw new IllegalArgumentException("ei ole kirjain");
		}
		arvaus = Character.toLowerCase(arvaus);
		boolean osuma = getTheSana().indexOf(arvaus) >= 0;
		if (!osuma) {
			maxVaarin--;
		} else {
			oikein.add(arvaus);
		}

		arvaukset.add(arvaus);
		return osuma;
	}

	public static String display() {
		String progress = "";
		for (char letter : theSana.toCharArray()) {
			char display = '*';
			if (oikein.indexOf(letter) >= 0) {
				display = letter;
			}
			progress += display;
		}
		return progress;
	}

	public List<Character> arvaukset(char arvaus) {
		arvaukset.add(arvaus);
		return arvaukset;
	}

	public int arvauksiaOnJaljella() {
		return maxVaarin;
	}

	public String sana() {
		return getTheSana();
	}

	public static boolean onLoppu(String progress) {
		if (maxVaarin == 0) {
			return true;
		}
		if (progress == theSana) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void printProgress(String progress){
		System.out.println(progress);
	}

	public List<String> getSanat() {
		return sanat;
	}

	public void setSanat(List<String> sanat) {
		this.sanat = sanat;
	}

	public String getTheSana() {
		return theSana;
	}

	public void setTheSana(String theSana) {
		Hirsipuu.theSana = theSana;
	}

	public char getArvaus() {
		return arvaus;
	}

	public void setArvaus(char arvaus) {
		this.arvaus = arvaus;
	}

}
