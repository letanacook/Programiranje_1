import java.util.Scanner;

public class PiramidaStevil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visina = sc.nextInt();
        int stevilo = 1; 

        for(int i = 1; i <= visina; i++){
            for(int j = visina; j > i; j--){
                System.out.print(" ");
            }
            for(int m = 1; m <= 2*i-1; m++){
                System.out.print(stevilo);
                stevilo = (stevilo == 9) ? 0 : stevilo+1;
            }
            System.out.println();
            stevilo = (i+1)%10; 
        }
    }
}
