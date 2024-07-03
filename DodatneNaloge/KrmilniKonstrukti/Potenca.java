import java.util.Scanner;

public class Potenca {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        int potenca = sc.nextInt();
        int rezultat = 1;

        if (potenca == 0) {
            System.out.println("1");
        }else{
            for(int i = 0; i < potenca; i++){
                rezultat *= stevilo;
            }
            System.out.println(rezultat);
        }
    }
}
