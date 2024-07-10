public class Pismo {
    private Posta izvorna; 
    private Posta ciljna;
    private boolean jePriporoceno; 
    private int razdalja; 

    private static int r;
    private static int c; 
    private static int p;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
        this.izvorna = izvorna; 
        this.ciljna = ciljna; 
        this.jePriporoceno = jePriporoceno; 
        this.razdalja = razdalja;
    }
    @Override
    public String toString(){
        char priporoceno = this.jePriporoceno ? 'P' : 'N';
        
        return String.format("%d %s -> %d %s (%d km) [%c]", this.izvorna.vrniStevilko(), this.izvorna.vrniNaziv(),
            this.ciljna.vrniStevilko(), this.ciljna.vrniNaziv(), this.razdalja, priporoceno);
    }
    public boolean izviraOd(Posta posta){
        return posta.equals(this.izvorna);
    }
    public boolean staIzvorInCiljIsta(){
        return this.izvorna.equals(this.ciljna);
    }
    public boolean imaIstiCiljKot(Pismo pismo){
        return pismo.ciljna.equals(this.ciljna);
    }
    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return p1.ciljna.equals(p2.ciljna);
    }
    public int cena(){
        int enota = this.razdalja/r + 1;
        if (this.jePriporoceno) {
            return enota*c + p;
        }else{
            return enota*c;
        }
    }

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }
    public boolean jeDrazjeOd(Pismo pismo){
        return this.cena() > pismo.cena();
    }
    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        if (p1.cena() > p2.cena()) {
            return p1;
        }else{
            return p2;
        }
    }
    public Pismo izdelajPovratno(){
        Pismo povratno = new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
        return povratno;
    }
}
