import java.util.Arrays;
import java.util.Scanner;

public class VsiRazlicniI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int stevila[] = new int[st];

        for(int i = 0; i < st; i++){
            stevila[i] = sc.nextInt();
        }

        Arrays.sort(stevila);

        boolean vsiRazlicni = true;
        int najmanjsaPonovitev = 0;

        for(int i = 1; i < st; i++){
            if (stevila[i] == stevila[i-1] && vsiRazlicni) {
                vsiRazlicni = false;
                najmanjsaPonovitev = stevila[i];
            }
        }
        if (!vsiRazlicni) {
            System.out.println(najmanjsaPonovitev);
        }else{
            System.out.println("RAZLICNI");
        }

    }
}
