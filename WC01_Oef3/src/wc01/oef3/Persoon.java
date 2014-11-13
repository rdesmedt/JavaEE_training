package wc01.oef3;

public class Persoon {
	String naam;
	String login;
	String passw;
	String adres;
	
	public Persoon() {
		super();
		setNaam("Roeland");
		setLogin("Roel");
		setPassw("1234");
		setAdres("fonteintje, Denderbelle");
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
	
	
}
