import java.util.*; 

public class Pismo{
	public Posta izvorna;
	public Posta ciljna; 
	public boolean jePriporoceno;
	public int razdalja; 
	
	public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
		this.izvorna = izvorna; 
		this.ciljna = ciljna; 
		this.jePriporoceno = jePriporoceno; 
		this.razdalja = razdalja; 
	}
	
	@Override
    public String toString(){
        char priporoceno = this.jePriporoceno ? 'P' : 'N'; // Determine the value of priporoceno
        return String.format("%d %s -> %d %s (%d km) [%c]", this.izvorna.stevilka, this.izvorna.naziv, this.ciljna.stevilka,
            this.ciljna.naziv, razdalja, priporoceno); // Use priporoceno in the format string
	}
	
	public boolean izviraOd(Posta posta){
		return (posta.stevilka == this.izvorna.stevilka && posta.naziv.equals(this.izvorna.naziv));
	}
	
	public boolean staIzvorInCiljIsta(){
		return (this.izvorna.stevilka == this.ciljna.stevilka && this.izvorna.naziv.equals(this.ciljna.naziv));
	}
	
	public boolean imaIstiCiljKot(Pismo pismo){
		return (pismo.ciljna.stevilka == this.ciljna.stevilka && pismo.ciljna.naziv.equals(this.ciljna.naziv));
	}
	public static boolean imataIstiCilj(Pismo p1, Pismo p2){
		return p1.imaIstiCiljKot(p2);
	}
	
	private static int r;
    private static int c;
    private static int p;
	
	public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
		r = enotaRazdalje; 
		c = enotaCene; 
		p = priporocnina; 
	}
	
	public int cena(){
		if(this.razdalja == 0){
			return this.jePriporoceno ? c + p : c; 
		}else if(r == 0){
			return 0;
		}else{
			int kategorija = this.razdalja / r;
			return this.jePriporoceno ? (kategorija + 1)*c + p : (kategorija + 1)*c; 
		}
	}
	
	public boolean jeDrazjeOd(Pismo pismo){
		if(pismo.cena() < this.cena())
			return true; 
		return false; 
	}

	public static Pismo vrniDrazje(Pismo p1, Pismo p2){
		return p1.jeDrazjeOd(p2) ? p1 : p2; 
	}

	public Pismo izdelajPovratno(){
		return new Pismo(this.ciljna, this.izvorna, jePriporoceno, razdalja); 
	}
}

/*
import java.util.*; 

public class Pismo {
    public Posta izvorna;
    public Posta ciljna; 
    public boolean jePriporoceno;
    public int razdalja; 
    
    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
        this.izvorna = izvorna; 
        this.ciljna = ciljna; 
        this.jePriporoceno = jePriporoceno; 
        this.razdalja = razdalja; 
    }
	@Override
    public String toString(){
        char priporoceno = this.jePriporoceno ? 'P' : 'N'; // Determine the value of priporoceno
        return String.format("%d %s -> %d %s (%d km) [%c]", this.izvorna.stevilka, this.izvorna.naziv, this.ciljna.stevilka,
            this.ciljna.naziv, razdalja, priporoceno); // Use priporoceno in the format string
    }
    
    public boolean izviraOd(Posta posta){
        return (posta.stevilka == this.izvorna.stevilka && posta.naziv.equals(this.izvorna.naziv));
    }
    
    public boolean staIzvorInCiljIsta(){
        return (this.izvorna.stevilka == this.ciljna.stevilka && this.izvorna.naziv.equals(this.ciljna.naziv));
    }
    
    public boolean imaIstiCiljKot(Pismo pismo){
        return (pismo.ciljna.stevilka == this.ciljna.stevilka && pismo.ciljna.naziv.equals(this.ciljna.naziv));
    }
    
    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return p1.imaIstiCiljKot(p2);
    }
    
    private static int r;
    private static int c;
    private static int p;
    
    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
        r = enotaRazdalje; 
        c = enotaCene; 
        p = priporocnina; 
    }
    
    public int cena(){
        if (this.razdalja == 0){
            return this.jePriporoceno ? c + p : c; 
        } else if (r == 0){
            return 0;
        } else {
            int kategorija = this.razdalja / r;
            return this.jePriporoceno ? (kategorija + 1) * c + p : (kategorija + 1) * c; 
        }
    }
    
    public boolean jeDrazjeOd(Pismo pismo){
        return pismo.cena() < this.cena();
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        return p1.jeDrazjeOd(p2) ? p1 : p2; 
    }

    public Pismo izdelajPovratno(){
        return new Pismo(this.ciljna, this.izvorna, jePriporoceno, razdalja); 
    }
}
*/