import java.util.Scanner;

public class TelefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String imenik[][] = new String[n][2];

        for(int i = 0; i < n; i++){
            imenik[i][0] = sc.next();
            imenik[i][1] = sc.next();
        }

        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            String iskano = sc.next();
            boolean obstaja = false;
            int izpisi = 0;
            for(int j = 0; j < n; j++){
                if (iskano.equals(imenik[j][0])) {
                    izpisi = j;
                    obstaja = true;
                }
            }
            if (!obstaja) {
                System.out.println("NEZNANA");
            }else{
                System.out.println(imenik[izpisi][1]);
            }
        }
    }
}
