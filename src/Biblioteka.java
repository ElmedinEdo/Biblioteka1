
public class Biblioteka extends BibliotekaTest {
	
	private int id;
	private String ime;
	private String prezime;
	public int brojPosudenihKnjiga;
	
	public Biblioteka() {
				}
	
	public Biblioteka(int id, String ime, String prezime, int brojPosudenihKnjiga) {
		this.id=id;
		this.ime = ime;
		this.prezime=prezime;;
	    this.brojPosudenihKnjiga =brojPosudenihKnjiga;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojPosudenihKnjiga() {
		return brojPosudenihKnjiga;
	}
	public void setBrojPosudenihKnjiga(int brojPosudenihKnjiga) {
		this.brojPosudenihKnjiga = brojPosudenihKnjiga;
	}

	
	@Override
	public String toString() {
		return "RacunBiblioteka [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", brojPosudenihKnjiga="
				+ brojPosudenihKnjiga + "]";
	}
}
	

