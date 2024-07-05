import java.util.Random;
import java.util.Scanner;

public class ZdolgocasenaMojca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int stKock = sc.nextInt();
        int stDni = sc.nextInt();

        Random rand = new Random(seme);

        for(int i = 1; i <= stDni; i++){
            System.out.printf("%d. dan:", i);
            metiKock(rand, stKock);
            System.out.println();
        }
    }
    public static void metiKock(Random rand, int stKock){
        int stMetov = 0;
        int sestevek = 0;
        int trenutno = 0;

        do{
            System.out.println();
            stMetov++;
            sestevek = 0; 
            System.out.printf("    %d. met: ", stMetov);
            for(int i = 1; i <= stKock; i++){
                trenutno = rand.nextInt(6)+1;
                System.out.printf("%d ", trenutno);
                sestevek += trenutno;
            }
            System.out.printf("| vsota = %d", sestevek);
        }while(!prastevilo(sestevek));
    }
    public static boolean prastevilo(int sestevek){
        boolean prastevilo = true; 
        if (sestevek == 1) {
            prastevilo = false;
        }
        for(int i = 2; i < sestevek; i++){
            if (sestevek%i == 0) {
                prastevilo = false;
                break;
            }
        }
        return prastevilo;
    }
}
