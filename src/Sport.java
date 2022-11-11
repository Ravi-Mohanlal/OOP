
public abstract class Sport {

	public String name;
	public int aantalMensen;
	public boolean vechtsport;
	public String locatie;
	
	public Sport() {
		System.out.println("In constructor");
	}

	public Sport(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("");
		System.out.println("Naam: " + name);
		System.out.println("Aantal mensen: " + aantalMensen);
		System.out.println("Vechtsport: " + vechtsport);
		System.out.println("Locatie: " + locatie);
	}
	
	public String startMatch(int kosten, int startTijd) {
		System.out.println("\nDe tickets kosten " + kosten + " euro en de wedstrijd begint om " + startTijd + " uur.");
		return "Match gestart!";
	}

	public String stopMatch(int stopTijd, String winnaar) {
		System.out.println("Wedstrijd gestopt om " + stopTijd + " uur.");
		System.out.println("De winnaar is " + winnaar + ".");
		return "Match gestopt!";
	}

	public abstract int bepaalPrijs();
	
}
