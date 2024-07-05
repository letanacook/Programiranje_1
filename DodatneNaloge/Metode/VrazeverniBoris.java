import java.util.Random;
import java.util.Scanner;

public class VrazeverniBoris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int stDni = sc.nextInt();

        Random rand = new Random(seme);

        for(int i = 1; i <= stDni; i++){
            if(i%7 == 0){
                System.out.printf("%4d (N): ", i);
                obred(rand, seme, 5);
            }else{
                System.out.printf("%4d (D): ", i);
                obred(rand, seme, 3);
            }
            System.out.println();
        }
    }
    public static void obred(Random rand, int seme, int stEnakih){
        int ponovitve = 0; 
        int trenutno = 0;
        int stMetov = 0;

        while(ponovitve != stEnakih){
            trenutno = rand.nextInt(6)+1;
            stMetov++;
            if (trenutno%2 == 1) {
                ponovitve++;
            }
            System.out.printf("%d ", trenutno);
        }
        System.out.printf("[%d]", stMetov);
    }
}
