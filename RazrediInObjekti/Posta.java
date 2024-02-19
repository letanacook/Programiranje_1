import java.util.*; 

public class Posta{
	public int stevilka; 
	public String naziv; 
	
	public Posta(int stevilka, String naziv){
		this.stevilka = stevilka; 
		this.naziv = naziv; 
	}
	
	public int vrniStevilko(){
		return this.stevilka; 
	}
	
	public String vrniNaziv(){
		return this.naziv; 
	}
	
	public String toString(){
		return String.format("%d %s", this.stevilka, this.naziv);
	}
	
}