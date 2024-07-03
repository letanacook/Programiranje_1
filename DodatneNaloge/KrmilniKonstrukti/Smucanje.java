import java.util.Scanner;

public class Smucanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stTekmovalcev = sc.nextInt();
        int tekmovalec = 0; 
        int najRezultat = 1000000;
        int stDiskvalificiranih = 0;
        int trenutniRezultat = 0; 
        int sestevek = 0; 

        for(int i = 0; i < stTekmovalcev; i++){
            for(int j = 0; j < 2; j++){
                trenutniRezultat = sc.nextInt();
                if(trenutniRezultat == 0){
                    stDiskvalificiranih++;
                    trenutniRezultat = 0;
                    break; 
                }
                sestevek+=trenutniRezultat; 
            }
            if (sestevek < najRezultat && trenutniRezultat != 0) {
                najRezultat=sestevek;
                tekmovalec = i+1; 
            }
            sestevek = 0; 
        }

        if (stDiskvalificiranih == stTekmovalcev) {
            System.out.println("NIHCE");
        }else{
            System.out.println(tekmovalec);
            System.out.println(najRezultat);
        }
    }
}
