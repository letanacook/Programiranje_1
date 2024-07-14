public class Ucenec {
    private static int maksObremenitev;
    private String ime;
    private String priimek; 
    private Krozek[] krozki;
    private int stKrozkov;  

    public static void nastaviMaksObremenitev(int maksObremenitev){
        Ucenec.maksObremenitev = maksObremenitev; 
    }
    public Ucenec(String ime, String priimek){
        this.ime = ime;
        this.priimek = priimek;
        this.krozki = new Krozek[maksObremenitev];
        this.stKrozkov = 0;
    }
    public String vrniIP(){
        return String.format("%s %s", this.ime, this.priimek);
    }
    public boolean vclani(Krozek krozek){
        for (int i = 0; i < this.stKrozkov; i++) {
            if (this.krozki[i] == krozek) {
                return true; // already a member of this Krozek
            }
        }
        if (this.stKrozkov >= maksObremenitev) {
            return false; // already a member of max number of Krozek
        }
        if (krozek.steviloClanov() >= krozek.vrniKvoto()) {
            return false; // Krozek is full
        }
        for (int i = 0; i < this.stKrozkov; i++) {
            if (this.krozki[i].vrniDan() == krozek.vrniDan() && Math.abs(this.krozki[i].vrniUro() - krozek.vrniUro()) < 2) {
                return false; // time conflict with another Krozek
            }
        }
        this.krozki[this.stKrozkov++] = krozek;
        krozek.noviClan();
        return true;
    }
    public static boolean prekrivanjeUr(Krozek krozek, Krozek[] krozki, int stKrozkov){
        boolean prekrivanje = false;
        for(int i = 0; i < stKrozkov; i++){
            if(Math.abs(krozki[i].vrniUro()-krozek.vrniUro()) < 2){
                prekrivanje = true; 
            }
        }
        return prekrivanje;
    }
    public void izclani(Krozek krozek){
        for(int i = 0; i < this.stKrozkov; i++){
            if (krozki[i].equals(krozek)) {
                stKrozkov--;
                krozki[i] = krozki[stKrozkov];
                krozek.izbrisiClana();
            }
        }
    }
    public int steviloKrozkov(){
        return this.stKrozkov;
    }
}
