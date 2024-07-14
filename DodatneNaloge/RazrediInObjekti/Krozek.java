public class Krozek {
    private String naziv;
    private int dan; 
    private int ura; 
    private int kvota;
    private int stUdelezencev; 

    public Krozek(String naziv, int dan, int ura, int kvota){
        this.naziv = naziv; 
        this.dan = dan; 
        this.ura = ura; 
        this.kvota = kvota;
        this.stUdelezencev = 0;
    }
    public String vrniNaziv(){
        return this.naziv;
    }
    public int steviloClanov(){
        return this.stUdelezencev;
    }
    public int vrniDan(){
        return this.dan;
    }
    public int vrniUro(){
        return this.ura; 
    }
    public int vrniKvoto(){
        return this.kvota;
    }
    public void noviClan(){
        this.stUdelezencev++;
    }
    public void izbrisiClana(){
        this.stUdelezencev--;
    }
}
