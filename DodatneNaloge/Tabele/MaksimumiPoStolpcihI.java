import java.util.Arrays;
import java.util.Scanner;

public class MaksimumiPoStolpcih {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int sirina = sc.nextInt();

        int matrika[][] = new int[visina][sirina];
        int max[] = new int[sirina];
        for(int i = 0; i < sirina; i++){
            max[i] = Integer.MIN_VALUE;
        }

        for(int i = 0; i < visina; i++){
            for(int j = 0; j < sirina; j++){
                matrika[i][j] = sc.nextInt();
                if (matrika[i][j] > max[j]) {
                    max[j] = matrika[i][j];
                }
            }
        }
        System.out.print(Arrays.toString(max));
    }
}
