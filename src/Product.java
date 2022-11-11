
public class Product {
	public String naam;
	public String categorie;
	public int prijs;

	public Product() {
		System.out.println("Geen argumenten meegegeven.");
	}
	
	public Product(String naam, String categorie, int prijs) {
		this.naam = naam;
		this.categorie = categorie;
		this.prijs = prijs;
	}

	public String koop(int geld) {
		if (geld >= prijs) {
			return "Gefeliciteerd! Je hebt een " + naam + " gekocht voor " + prijs + " euro.";
		} else {
			return "Te weinig geld.";
		}
	}

	public void berekenPrijs(int aantal) {
		System.out.println("De totale prijs is " + (aantal * prijs));
	}
}
