
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotekaTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int izbor = 0;

		do {

			System.out.println("...................................");
			System.out.println("<<<<...B I B L I O T E K A.....>>>>");
			System.out.println("-----------------------------------");
			System.out.println("0) - Ukupno  knjizevnih djela: ");
			System.out.println("---------------------------------- ");

			System.out.println("Unesite Id broj: ");
			System.out.println("...................................");
			System.out.println("1) za: Korisnik1 ");
			System.out.println("2) za: Korisnik2 ");
			System.out.println("3) za: Korisnik3 ");

			System.out.println("---------------------------------- ");

			System.out.println("4) Djela: Mesa Selimovic: ");
			System.out.println("5) Djela: Ivo Andric: ");
			System.out.println("6) Djela: Marin Drzic: ");
			System.out.println("7) Djela: Charles Bukowski: ");
			System.out.println("8) Djela: Hermann Hesse: ");

			System.out.println("-----------------------------------");

			System.out.println("9) Izlaz: ");
			System.out.println("---------------------------------- ");

			izbor = input.nextInt();
			System.out.println("\n");

			switch (izbor) {

			case 0:

				ArrayList<String> djelaMesaSelimovic = new ArrayList<>();
				ArrayList<String> djelaIvoAndric = new ArrayList<>();
				ArrayList<String> djelaMarinDrzic = new ArrayList<>();
				ArrayList<String> djelaCharlesBukowski = new ArrayList<>();
				ArrayList<String> djelaHermannHesse = new ArrayList<>();

				djelaMesaSelimovic.add("\n1 - Dervis i smrt. ");
				djelaMesaSelimovic.add("\n2 - Tisine, 1961. ");
				djelaMesaSelimovic.add("\n3 - Uvrijedeni covjek, 1947. ");
				djelaMesaSelimovic.add("\n4 - Magla i mjesecina, 1965. ");
				djelaMesaSelimovic.add("\n5 - Ostrvo,  1975.");
				djelaMesaSelimovic.add("\n6 - Tvrdava, 1970. ");
				djelaMesaSelimovic.add("\n7 - Sjecanja. ");
				djelaMesaSelimovic.add("\n8 - Krug, 1983. ");

				djelaIvoAndric.add("\n1 - Lica, 1960.");
				djelaIvoAndric.add("\n2 - Prokleta avlija, 1954.)");
				djelaIvoAndric.add("\n3 - Zena na kamenu 1962.");
				djelaIvoAndric.add("\n4 - Gospodica, 1945.)");
				djelaIvoAndric.add("\n5 - Znakovi pored puta ");

				djelaMarinDrzic.add("\n1 - Dundo Maroje ");
				djelaMarinDrzic.add("\n2 - Skup ");
				djelaMarinDrzic.add("\n3 - Arkulin ");
				djelaMarinDrzic.add("\n4 - Dundo Maroje ");
				djelaMarinDrzic.add("\n5 - Dundo Maroje ");

				djelaCharlesBukowski.add("\n1 - Post Office (1971) ");
				djelaCharlesBukowski.add("\n2 - Factotum (1975) ");
				djelaCharlesBukowski.add("\n3 - Reach for the Sun: (1999)");

				djelaHermannHesse.add("\n1 - Stepski vuk");
				djelaHermannHesse.add("\n2 - Demian");
				djelaHermannHesse.add("\n3 - Igra staklenim biserima");
				djelaHermannHesse.add("\n4 - Siddhartha");
				djelaHermannHesse.add("\n5 - Narcis i Zlatousti");
				djelaHermannHesse.add("\n6 - Knulp");

				System.out.println("Ukupno knjizevnih djela: " + (djelaMesaSelimovic.size() + djelaIvoAndric.size()
						+ djelaMarinDrzic.size() + djelaCharlesBukowski.size() + djelaHermannHesse.size()));

				djelaMesaSelimovic.remove(0);
				djelaMesaSelimovic.remove(1);
				djelaMarinDrzic.remove(0);
				djelaMarinDrzic.remove(3);
				djelaHermannHesse.remove(5);

				System.out.println("Preostalo knjizevnih djela: " + (djelaMesaSelimovic.size() + djelaIvoAndric.size()
						+ djelaMarinDrzic.size() + djelaCharlesBukowski.size() + djelaHermannHesse.size()));

				System.out.println();
				izbor = input.nextInt();
				System.out.println("\n");

				break;

			case 1:

				Biblioteka korisnik1 = new Biblioteka();
				
				korisnik1.setId(1);
				korisnik1.setIme("Jane ");
				korisnik1.setPrezime("Clark ");
				korisnik1.setBrojPosudenihKnjiga(1);

				System.out.println("\nId: " + korisnik1.getId() + "\nIme: " + korisnik1.getIme()+
				"\nPrezime: "+ korisnik1.getPrezime() + "\nBroj posudenih knjiga: " + korisnik1.getBrojPosudenihKnjiga());

				LocalDate localDate1 = LocalDate.of(2018, 9, 25);
				LocalDate newDate1 = localDate1.plusDays(90);

				System.out.println("Knjiga je izdata do datuma: " + newDate1);
				System.out.println("\n");
				System.out.println("Knjiga koja je posudena: " + "1. - Dundo Maroje - djelaMarinDrzic ");
				System.out.println("Knjiga koja je posudena: " );
				System.out.println("Knjiga koja je posudena: " );
				
				izbor = input.nextInt();
				System.out.println("\n");
				break;
			case 2:
				
				Biblioteka korisnik2 = new Biblioteka();
				
				korisnik2.setId(2);
				korisnik2.setIme("Mike ");
				korisnik2.setPrezime("Stone ");
				korisnik2.setBrojPosudenihKnjiga(0);

				System.out.println("\nId: " + korisnik2.getId() + "\nIme: " + korisnik2.getIme()+
				"\nPrezime: "+ korisnik2.getPrezime() + "\nBroj posudenih knjiga: " + korisnik2.getBrojPosudenihKnjiga());

				LocalDate localDate2 = LocalDate.of(2018, 10, 25);
				LocalDate newDate2 = localDate2.plusDays(0);

				System.out.println("Knjiga je izdata do datuma: " + newDate2);
				System.out.println("\n");
				System.out.println("Knjiga koja je posudena: " );
				System.out.println("Knjiga koja je posudena: " );
				System.out.println("Knjiga koja je posudena: " );
				
				izbor = input.nextInt();
				System.out.println("\n");

				break;
			case 3:
				
				Biblioteka korisnik3 = new Biblioteka();
				
				korisnik3.setId(3);
				korisnik3.setIme("Mia ");
				korisnik3.setPrezime("Anderson ");
				korisnik3.setBrojPosudenihKnjiga(3);

				System.out.println("\nId: " + korisnik3.getId() + "\nIme: " + korisnik3.getIme()+
				"\nPrezime: " + korisnik3.getPrezime() + "\nBroj posudenih knjiga: " + korisnik3.getBrojPosudenihKnjiga());

				LocalDate localDate3 = LocalDate.of(2018, 10, 25);
				LocalDate newDate3 = localDate3.plusDays(90);

				System.out.println("Knjiga je izdata do datuma: " + newDate3);
				System.out.println("\n");
				System.out.println("Knjiga koja je posudena: " + "4. - Dundo Maroje - djelaMarinDrzic ");
				System.out.println("Knjiga koja je posudena: " + "1. - Dervis i smrt. - djelaMesaSelimovic ");
				System.out.println("Knjiga koja je posudena: " + "2. - Tisine, 1961. - djelaMesaSelimovic ");

				izbor = input.nextInt();
				System.out.println("\n");
				break;
			case 4:
				System.out.println("4.Djela Mesa Selimovic: ");

				ArrayList<String> djelaMesaSelimovic1 = new ArrayList<>();
				djelaMesaSelimovic1.add("\n1 - Dervis i smrt. ");
				djelaMesaSelimovic1.add("\n2 - Tisine, 1961. ");
				djelaMesaSelimovic1.add("\n3 - Uvrijedeni covjek, 1947. ");
				djelaMesaSelimovic1.add("\n4 - Magla i mjesecina, 1965. ");
				djelaMesaSelimovic1.add("\n5 - Ostrvo,  1975.");
				djelaMesaSelimovic1.add("\n6 - Tvrdava, 1970. ");
				djelaMesaSelimovic1.add("\n7 - Sjecanja. ");
				djelaMesaSelimovic1.add("\n8 - Krug, 1983. ");

				System.out.println();
				for (String e : djelaMesaSelimovic1) {
					System.out.print(e + " ");
				}

				System.out.println("\n...................................");
				System.out.println("Ukupno djela: " + djelaMesaSelimovic1.size());

				System.out.print("Preostalo djela: ");
				djelaMesaSelimovic1.remove(0);
				djelaMesaSelimovic1.remove(1);

				System.out.println(djelaMesaSelimovic1.size());
				System.out.println("");

				izbor = input.nextInt();
				System.out.println("\n");
				break;
			case 5:
				System.out.println("5.Djela Ivo Andric: ");

				ArrayList<String> djelaIvoAndric1 = new ArrayList<>();
				djelaIvoAndric1.add("\n1 - Lica, 1960.");
				djelaIvoAndric1.add("\n2 - Prokleta avlija, 1954.)");
				djelaIvoAndric1.add("\n3 - Zena na kamenu 1962.");
				djelaIvoAndric1.add("\n4 - Gospodica, 1945.)");
				djelaIvoAndric1.add("\n5 - Znakovi pored puta ");

				System.out.println();
				for (String e : djelaIvoAndric1) {
					System.out.print(e + " ");
				}

				System.out.println("\n....................................");
				System.out.println("Ukupno djela: " + djelaIvoAndric1.size());

				System.out.print("Preostalo djela: ");
				System.out.println(djelaIvoAndric1.size());

				izbor = input.nextInt();
				System.out.println("\n");
				break;
			case 6:

				System.out.println("6.Djela Marin Drzic  ");

				ArrayList<String> djelaMarinDrzic1 = new ArrayList<>();
				djelaMarinDrzic1.add("\n1 - Dundo Maroje ");
				djelaMarinDrzic1.add("\n2 - Skup ");
				djelaMarinDrzic1.add("\n3 - Arkulin ");
				djelaMarinDrzic1.add("\n4 - Dundo Maroje ");
				djelaMarinDrzic1.add("\n5 - Dundo Maroje ");

				System.out.println();

				for (String e : djelaMarinDrzic1) {
					System.out.print(e + " ");
				}

				System.out.println("\n.....................................");

				System.out.println("Ukupno djela: " + djelaMarinDrzic1.size());

				djelaMarinDrzic1.remove(0);
				djelaMarinDrzic1.remove(3);

				System.out.print("Preostalo djela: ");
				System.out.println(djelaMarinDrzic1.size());

				System.out.println("");

				izbor = input.nextInt();
				System.out.println("\n");

				break;
			case 7:
				System.out.println("7.Djela Charles Bukowski: ");

				ArrayList<String> djelaCharlesBukowski1 = new ArrayList<>();
				djelaCharlesBukowski1.add("\n1 - Post Office (1971) ");
				djelaCharlesBukowski1.add("\n2 - Factotum (1975) ");
				djelaCharlesBukowski1.add("\n3 - Reach for the Sun: (1999)");

				System.out.println();

				for (String e : djelaCharlesBukowski1) {
					System.out.print(e + " ");
				}

				System.out.println("\n......................................");

				System.out.println("Ukupno djela: " + djelaCharlesBukowski1.size());

				System.out.print("Preostalo djela: ");
				System.out.println(djelaCharlesBukowski1.size());

				izbor = input.nextInt();
				System.out.println("\n");

				break;
			case 8:

				System.out.println("8.Djela Hermann Hesse: ");

				ArrayList<String> djelaHermannHesse1 = new ArrayList<>();
				djelaHermannHesse1.add("\n1 - Stepski vuk");
				djelaHermannHesse1.add("\n2 - Demian");
				djelaHermannHesse1.add("\n3 - Igra staklenim biserima");
				djelaHermannHesse1.add("\n4 - Siddhartha");
				djelaHermannHesse1.add("\n5 - Narcis i Zlatousti");
				djelaHermannHesse1.add("\n6 - Knulp");

				System.out.println();

				for (String e : djelaHermannHesse1) {
					System.out.print(e + " ");
				}

				System.out.println("\n.......................................");

				System.out.println("Ukupno djela: " + djelaHermannHesse1.size());
				djelaHermannHesse1.remove(5);

				System.out.print("Preostalo djela: ");
				System.out.println(djelaHermannHesse1.size());

				System.out.println("");

				izbor = input.nextInt();
				System.out.println("\n");

				break;
			case 9:
				System.out.println("---------------------------------------------");
				break;

			default:
				System.out.println("Pogresan unos! Molimo pokusajte ponovo! ");
				break;
			}
		} while (izbor != 9);
		System.out.println("<<<< Izlaz >>>>");
input.close();
	}

}
