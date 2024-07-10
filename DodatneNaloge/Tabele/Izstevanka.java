import java.util.Scanner;

public class Izstevanka {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        String otroci[] = new String[stOtrok+1];

        for(int i = 1; i <= stOtrok; i++){
            otroci[i] = sc.next();
        }

        int ostanek = stOtrok;

        while(ostanek > 1){
            int izpade = (stBesed%ostanek == 0) ? ostanek : stBesed%ostanek;

           // System.out.printf("%d. %s%n", stOtrok-ostanek, otroci[izpade]);
           System.out.println(otroci[izpade]);

            for(int i = izpade; i <= stOtrok - 1; i++){
                otroci[i] = otroci[i+1];
                //System.out.println(otroci[i]);
            }
            ostanek--;
        }
    }
}
