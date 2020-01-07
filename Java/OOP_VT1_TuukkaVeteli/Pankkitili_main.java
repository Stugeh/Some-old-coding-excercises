import java.util.Scanner;

public class Pankkitili_main {
	static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		boolean done = false;
		while (!done) {
			try {
				Pankkitili tili = luePankkitili();
				while(!menu(tili)) {
					menu(tili);
				}
				done = true;
			} catch (Exception e) {
				System.out.println("Virheellinen syote!!!");
				lukija.nextLine();
				done = false;
			}
		}
	}

	public static boolean menu(Pankkitili tili) {
		int valinta;
		double summa;
		boolean stop = false;

		System.out.println(
				"\n\nSyotä haluamaasi valintaa vastaava luku:\n1.Nosto\n2.talletus\n3.Tilitietojen tulostus\n4.Exit");
		valinta = lukija.nextInt();

		switch (valinta) {

		case 1: {
			System.out.println("paljonko haluat nostaa?");
			summa = lukija.nextDouble();
			lukija.nextLine();
			tili.otto(tili, summa);
			stop = false;
			break;
		}

		case 2: {
			System.out.println("paljonko haluat tallettaa?");
			summa = lukija.nextDouble();
			lukija.nextLine();
			tili.talletus(tili, summa);
			stop = false;
			break;
		}
		case 3: {
			System.out.println(tili);
			break;
		}

		case 4: {
			stop = true;
			System.out.println("Ohjelma paattyy!");
			System.exit(0);
			break;
		}

		default: {
			System.out.println("\nUusiks meni!");
			stop = false;
			break;
		}
		}

		return stop;

	}

	public static Pankkitili luePankkitili() {

		String nimi;
		String tilinumero;
		Double saldo;

		System.out.println("Syötä nimesi >");
		nimi = lukija.nextLine();

		System.out.println("Syötä tilinumerosi >");
		tilinumero = lukija.nextLine();

		System.out.println("Syötä saldosi >");
		saldo = lukija.nextDouble();
		lukija.nextLine();

		Pankkitili ptili = new Pankkitili(nimi, tilinumero, saldo);
		return ptili;

	}

}
