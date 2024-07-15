public class Filozof{
    private String ime;
    private int stPalic;
    private boolean levaPalica;
    private boolean desnaPalica;

    public Filozof(String ime){
        this.ime = ime;
        this.stPalic = 0;
        this.desnaPalica = false;
        this.levaPalica = false;
    }
    public String vrniIme(){
        return this.ime;
    }
    private Filozof levi; 
    private Filozof desni;
    public void nastaviSoseda(Filozof levi, Filozof desni){
        this.desni = desni;
        this.levi = levi;
    }
    public boolean jeLeviSosedOd(Filozof f){
        return f.levi.equals(this);
    }
    public boolean jeDesniSosedOd(Filozof f){
        return f.desni.equals(this);
    }
    public Filozof[] vrniSoseda(){
        Filozof sosedi[] = new Filozof[2];
        sosedi[0] = this.levi;
        sosedi[1] = this.desni;
        return sosedi;
    }
    public int kolikoPalicicDrzi(){
        return this.stPalic;
    }
    public boolean drziDesno(){
        return this.desnaPalica;
    }
    public boolean drziLevo(){
        return this.levaPalica;
    }
    public boolean primiLevo(){
        if (this.levaPalica) {
            return true;
        }else if(this.levi.drziDesno()){
            return false;
        }else{
            this.levaPalica = true; 
            this.stPalic++;
            return true;
        }
    }
    public boolean primiDesno(){
        if (this.desnaPalica) {
            return true;
        }else if(this.desni.drziLevo()){
            return false;
        }else{
            this.desnaPalica = true; 
            this.stPalic++;
            return true;
        }
    }
    public void izpustiLevo(){
        if (this.levaPalica) {
            this.levaPalica = false;
            this.stPalic--;
        }
    }
    public void izpustiDesno(){
        if(this.desnaPalica){
            this.desnaPalica = false;
            this.stPalic--;
        }
    }
    public static int steviloJedcev(Filozof[] filozofi){
        int stJedcev = 0; 
        for(int i = 0; i < filozofi.length; i++){
            if (filozofi[i].desnaPalica && filozofi[i].levaPalica) {
                stJedcev++;
            }
        }
        return stJedcev;
    }
    public int steviloFilozofov(){
        int steviloFilozofov = 1; 
        Filozof trenutni = this;
        while(!trenutni.desni.equals(this)){
            trenutni = trenutni.desni;
            steviloFilozofov++;
        }
        return steviloFilozofov;
    }
}