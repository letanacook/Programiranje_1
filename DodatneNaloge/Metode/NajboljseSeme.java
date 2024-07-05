import java.util.Random;
import java.util.Scanner;;

public class NajboljseSeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int n = sc.nextInt();

        long najvecje = 0L; 
        long trenutno = 0L; 
        int najSeme = 0; 

        for(int i = a; i <= b; i++){
            trenutno = seme(i, n);
            if (trenutno > najvecje) {
                najvecje = trenutno;
                najSeme = i; 
            }
        }

        System.out.println(najSeme);
    }

    public static long seme(int i, int n){
        Random rand = new Random(i);
        long trenutno = 0; 
        for(int j = 1; j <= n; j++){
            trenutno = trenutno*10 + rand.nextInt(10);
        }
        return trenutno; 
    }
}
