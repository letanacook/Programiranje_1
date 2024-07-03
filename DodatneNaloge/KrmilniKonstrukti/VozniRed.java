import java.util.Scanner;

public class VozniRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zacetekUra = sc.nextInt();
        int zacetekMinute = sc.nextInt();
        int konecUra = sc.nextInt();
        int konecMinute = sc.nextInt();
        int interval = sc.nextInt();

        boolean seTraja = true;

        while (seTraja) {
            System.out.printf("%02d:%02d%n", zacetekUra, zacetekMinute);

            zacetekMinute += interval;
            zacetekUra += zacetekMinute / 60;
            zacetekMinute %= 60;

            
            if (zacetekUra > konecUra || (zacetekUra == konecUra && zacetekMinute > konecMinute)) {
                seTraja = false;
            }

            
            if (zacetekUra == konecUra && zacetekMinute == konecMinute) {
                System.out.printf("%02d:%02d%n", zacetekUra, zacetekMinute);
                seTraja = false;
            }
        }
    }
}
