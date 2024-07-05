import java.util.Random;
import java.util.Scanner;

public class SahovskiPopoldnevi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int vrjetnostAndrej = sc.nextInt();
        int vrjetnostBranko = sc.nextInt();
        int partije = sc.nextInt();
        int mejaZmag = sc.nextInt();
        int stDni = sc.nextInt();

        Random rand = new Random(seme);

        for(int i = 1; i <= stDni; i++){
            System.out.printf("%d. dan: ", i);
            partije(rand, vrjetnostAndrej, vrjetnostBranko, partije, mejaZmag);
            System.out.println();
        }

    }
    public static void partije(Random rand, int vrjetnostAndrej, int vrjetnostBranko, int partije, int mejaZmag){
        int zmageAndrej = 0; 
        int zmageBranko = 0; 
        int igre = 0;
        int trenutno = 0;

        while(igre < partije && zmageAndrej < mejaZmag && zmageBranko < mejaZmag){
            trenutno = rand.nextInt(100);
            if (trenutno < vrjetnostAndrej) {
                zmageAndrej++;
                igre++;
                System.out.print("A");
            }else if(trenutno >= vrjetnostAndrej && trenutno < (vrjetnostAndrej + vrjetnostBranko)){
                zmageBranko++;
                igre++;
                System.out.print("B");
            }else{
                igre++;
                System.out.print("r");
            }
        }
        System.out.printf(" (%d)", igre);
    }
}
