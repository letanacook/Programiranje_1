import java.util.Scanner;

public class PotencaPoModulu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        long rezultat = naPotenco(a, b, m);
        
        System.out.println(rezultat);
    }

    public static long naPotenco(int a, int b, int m){
        long rezultat = 1L;
        long baza = a % m; //preverimo ce je baza deljiva z m
        
        while(b > 0){
            if((b % 2) == 1) { //ce je b liho
                rezultat = (rezultat * baza) % m; 
            }
            baza = (baza * baza) % m; // bazo kvadriramo 
            b /= 2;
        }
        return rezultat;
    }
}
