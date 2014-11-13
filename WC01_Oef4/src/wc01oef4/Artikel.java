package wc01oef4;

public class Artikel {
	private String naam;
	private String prijs;
	
	public Artikel(String naam, String prijs) {
		super();
		this.naam = naam;
		this.prijs = prijs;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getPrijs() {
		return prijs;
	}

	public void setPrijs(String prijs) {
		this.prijs = prijs;
	}

	@Override
	public String toString() {
		return "Artikel <b>" + naam + "</b> kost: <b>" + prijs + "</b>.";
	}
	
	
	
	
}
