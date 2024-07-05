import java.util.Scanner;

public class DigitalneCrtice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int stCrtic[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int stevila[] = new int[n];

        for(int i = 0; i < n; i++){
            stevila[i] = sc.nextInt();
        }
        int mxStCrtic = 0; 
        int indeks = 0;  
        int trenutno = 0; 

        for(int i = 0; i < n; i++){
            int sestevek = 0;
            trenutno = stevila[i];
            while(trenutno != 0){
                sestevek += stCrtic[trenutno%10];
                trenutno /= 10;
            }
            if (sestevek > mxStCrtic) {
                indeks = i;
                mxStCrtic = sestevek; 
            }
        }
        System.out.println(stevila[indeks]);
    }
}
