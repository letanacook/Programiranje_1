public class Prastevila {
    private int prastevilo;

    public Prastevila() {
        this.prastevilo = 2;
    }

    public void nastaviTrenutno(int prastevilo) {
        this.prastevilo = prastevilo;
    }

    public int vrniTrenutno() {
        return this.prastevilo;
    }

    public int naslednje() {
        int prastevilo = this.prastevilo;
        while (true) {
            prastevilo++;
            if (jePrastevilo(prastevilo)) {
                this.prastevilo = prastevilo;
                return prastevilo;
            }
        }
    }

    public int prejsnje() {
        int prastevilo = this.prastevilo;
        while (prastevilo > 1) {
            prastevilo--;
            if (jePrastevilo(prastevilo)) {
                this.prastevilo = prastevilo;
                return prastevilo;
            }
        }
        return 2; 
    }

    private boolean jePrastevilo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}