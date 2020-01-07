import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean done = false;

		while (!done) {
			readTontti();
			readTalo();
			printInfo();

			done = valinta();
		}
	}

	public static void readTontti() {

		String osoite;
		String nim;
		double ala;
		boolean done = false;

		while (!done) {
			try {
				System.out.println("Anna tontin nimi > ");
				nim = sc.nextLine();

				System.out.println("Anna tontin osoite > ");
				osoite = sc.nextLine();

				System.out.println("Anna tontin pinta-ala > ");
				ala = sc.nextDouble();
				sc.nextLine();

				Tontti tontt = new Tontti(nim, osoite, ala);
				Tontti.addTontti(tontt);
				done = true;
			} catch (Exception e) {
				System.out.println("\n\nVIRHEELLINEN SYOTE YRITA UUDELLEEN!!\n");
				sc.nextLine();
			}

		}
	}

	public static void readTalo() {

		double pintAla;
		int huoneluku;
		int asukasluku;
		String type;
		int asunnot;
		int val;
		String nimi;
		List<String> asukaslista = Asukkaat.addAsukaslista();

		boolean done = false;

		while (!done) {
			try {
				System.out.print("\nAnna rakennuksen tyyppi \n   1.Omakotitalo \n   2.Rivitalo \n   3.Kerrostalo \n> ");
				val = sc.nextInt();
				sc.nextLine();
				System.out.println("\nAnna rakennuksen pinta-ala > ");
				pintAla = sc.nextDouble();
				sc.nextLine();

				switch (val) {

				case 1:
					type = "Omakotitalo";
					asunnot = 1;

					System.out.println("Anna rakennuksen huoneiden maara > ");
					huoneluku = sc.nextInt();
					sc.nextLine();

					System.out.println("Kuinka monta asukasta talossa asuu? > ");
					asukasluku = sc.nextInt();
					sc.nextLine();

					Rakennus talo = new Rakennus(type, pintAla, huoneluku, asukasluku, asunnot);

					Rakennus.addRakennus(talo);

					asukaslista = Asukkaat.addAsukaslista();

					for (int i = 0; i < asukasluku; i++) {
						nimi = readAsukas();
						asukaslista.add(nimi);
					}
					Asukkaat.listalista.add(asukaslista);
					done = true;
					break;

				case 2:
					int j = 1;
					type = "Rivitalo";

					System.out.println("Anna rakennuksen asuntojen määrä >");
					asunnot = sc.nextInt();
					sc.nextLine();

					Rakennus rivi = new Rakennus(type, asunnot);
					Rakennus.addRakennus(rivi);

					for (int i = 0; i < asunnot; i++) {

						asukasluku = readAsunt(j);
						j++;

						asukaslista = Asukkaat.addAsukaslista();

						for (int f = 0; f < asukasluku; f++) {
							nimi = readAsukas();
							asukaslista.add(nimi);
						}
						Asukkaat.listalista.add(asukaslista);
					}
					done = true;
					break;

				case 3:
					j = 1;
					type = "Kerrostalo";

					System.out.println("Anna rakennuksen asuntojen määrä > ");
					asunnot = sc.nextInt();
					sc.nextLine();

					Rakennus kerros = new Rakennus(type, asunnot);
					Rakennus.addRakennus(kerros);

					for (int i = 0; i < asunnot; i++) {

						asukasluku = readAsunt(j);
						j++;

						asukaslista = Asukkaat.addAsukaslista();

						for (int g = 0; g < asukasluku; g++) {
							nimi = readAsukas();
							asukaslista.add(nimi);
						}
						Asukkaat.listalista.add(asukaslista);
					}
					done = true;
					break;

				default:
					System.out.print("Vaara valinta. Yrita uudelleen.");
				}

			} catch (Exception e) {
				System.out.println("\n\nVIRHEELLINEN SYOTE YRITA UUDELLEEN!!\n");
				sc.nextLine();
			}
		}
	}

	public static int readAsunt(int u) {

		double pintAla;
		int huoneluku;
		int asukasluku;

		System.out.println("\nSYOTA ASUNNON " + u + " TIEDOT\n");
		u++;

		System.out.println("Anna asunnon pinta-ala > ");
		pintAla = sc.nextDouble();
		sc.nextLine();

		System.out.println("Anna asunnon huoneiden maara > ");
		huoneluku = sc.nextInt();
		sc.nextLine();

		System.out.println("Kuinka monta asukasta asunnossa asuu? > ");
		asukasluku = sc.nextInt();
		sc.nextLine();

		Rakennus asunto = new Rakennus(pintAla, huoneluku, asukasluku);
		Rakennus.addAsunto(asunto);

		return asukasluku;

	}

	public static String readAsukas() {

		String nimi;

		System.out.println("Syötä asukkaan nimi > ");
		nimi = sc.nextLine();
		return nimi;

	}

	public static void printInfo() {
		Tontti.printTontti();
	}

	public static boolean valinta() {

		char valinta;

		System.out.print("\n Haluatko syottaa toisen tontin? K/E \n> ");
		valinta = sc.next().charAt(0);
		sc.nextLine();

		if (valinta == 'E' || valinta == 'e') {
			System.out.println("\n\nOHJELMA PAATTYY!!!");
			return true;
		} else {
			if (valinta == 'K' || valinta == 'k') {
				System.out.println("\nValitsit kylla!\n");
				return false;
			} else {
				System.out.println("Valitse kylla tai ei (K/E)");
				return valinta();
			}
		}
	}
}
