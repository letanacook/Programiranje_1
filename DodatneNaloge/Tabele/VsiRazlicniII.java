import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//delajo testni primeri do 8...aka ni optimizirano

public class VsiRazlicniII {
    private static final int MAKS_STEVILO = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seme = sc.nextInt();
        Random random = new Random(seme);

        int n = sc.nextInt();
        int stevila[] = new int[n];

        for(int i = 0; i < n; i++){
            stevila[i] =  random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
        }

        Arrays.sort(stevila);

        int najvecPonovitev = 1;
        int trenutno = 1;
        int najSt = stevila[0];
        boolean razlicna = true;

        for(int i = 1; i < n; i++){
            if(stevila[i] == stevila[i-1]) {
               trenutno++;
               razlicna = false;
            }else{
                if (trenutno > najvecPonovitev) {
                    najvecPonovitev = trenutno;
                    najSt = stevila[i-1];
                }
                trenutno = 1;
            }
        }

        if(trenutno > najvecPonovitev){
            najvecPonovitev = trenutno;
            najSt = stevila[n-1];
        }

        if(razlicna) {
            System.out.println("RAZLICNI");
        }else{
            System.out.println(najSt);
        }


    }
}
