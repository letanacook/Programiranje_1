import java.util.Scanner; 

public class PredvolilniGolaz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int denar = sc.nextInt();

        pogostitev(sc, denar);
    }

    public static void pogostitev(Scanner sc, int denar){
        while(sc.hasNextInt() && denar > 0){
            int skupnaCena = 0;
            int cenaKosila = sc.nextInt();
            int stKosil = sc.nextInt();
            int vino = sc.nextInt();
            skupnaCena += cenaKosila*stKosil;

            if (vino == 1) {
                if ((cenaKosila*stKosil)%2 != 0) {
                    skupnaCena += (cenaKosila*stKosil)/2 + 1;  
                }else{
                    skupnaCena += (cenaKosila*stKosil)/2;
                }
            }
            denar -= skupnaCena; 
            if (denar < 0) {
                System.out.printf("%d -%n", skupnaCena);
            }else{
                System.out.printf("%d %d%n", skupnaCena, denar);
            }
        }
    }
}