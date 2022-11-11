public class Application {

	public static void main(String[] args) {
		System.out.println("het werkt");

		Product p1 = new Product("Appel", "Voedsel", 2);
		Product p2 = new Product();
		
		p2.naam = "Banaan";
		p2.categorie = "Voedsel";
		p2.prijs = 1;

		System.out.println(p1.koop(3));
		System.out.println(p2.koop(0));
		
		p1.berekenPrijs(10);
		
		
		
		Voetbal s1 = new Voetbal();
		Basketbal s2 = new Basketbal();
		Honkbal s3 = new Honkbal();
		
		System.out.println(s1.bepaalPrijs());
		System.out.println(s2.bepaalPrijs());
		System.out.println(s3.bepaalPrijs());
	}

}
